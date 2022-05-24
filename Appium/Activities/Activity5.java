package activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Activity5 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "139ec4af");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.mms");
        caps.setCapability("appActivity", ".ui.MmsTabActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void smsTest() throws InterruptedException {
        // Wait for elements to load
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("description(\"Compose\")")));
        // Locate the button to write a new message and click it
        driver.findElement(MobileBy.AndroidUIAutomator("description(\"Compose\")")).click();

        // Enter the number to send message to
        String contactBoxLocator = "resourceId(\"com.android.mms:id/recipients_editor\")";

        // Enter your own phone number
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator(contactBoxLocator)));
        driver.findElement(MobileBy.AndroidUIAutomator(contactBoxLocator)).sendKeys("8939967821");
        ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));

        // Wait for message box to load
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("resourceId(\"com.android.mms:id/message_content_panel\")"))).click();

        // Type in a message
       wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("resourceId(\"com.android.mms:id/message_content_panel\")")));

       driver.findElement(By.id("com.android.mms:id/embedded_text_editor")).sendKeys("Hello from Appium");
       driver.findElement(MobileBy.id("com.android.mms:id/send_slot_id")).click();
        Thread.sleep(2000);
        driver.findElement(MobileBy.id("com.android.mms:id/sim_button1")).click();
        // Send the message
        driver.findElement(MobileBy.AndroidUIAutomator("description(\"Send message\")")).click();
        Thread.sleep(4000);
        // Wait for message to show
       // WebElement messageLocator = driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[1]"));
        List<MobileElement> element = driver.findElementsByXPath("//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout");
        int taskSize= element.size()/3;
        System.out.print(taskSize);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout["+taskSize+"]")));

        // Assertion
        String sentMessageText = driver.findElement(MobileBy.xpath("//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout["+taskSize+"]//android.widget.LinearLayout//android.view.ViewGroup//android.widget.RelativeLayout//android.widget.RelativeLayout//android.widget.TextView")).getText();
        Assert.assertEquals(sentMessageText, "Hello from Appium");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
