package activities;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Activity1 {
    // Declare Android driver
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "139ec4af");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.miui.calculator");
        caps.setCapability("appActivity", ".cal.CalculatorActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
    }

    @Test
    public void add() {
        // Using resource-id
        driver.findElementById("btn_5_s").click();
        // Using Accessibility ID
        driver.findElementByAccessibilityId("multiply").click();
        // Using XPath
        driver.findElementByXPath("//android.widget.TextView[@text='9']").click();

        // Perform Calculation
        driver.findElementById("btn_equal_s").click();

        // Display Result
       // String result = driver.findElement(MobileBy.id("result[3]")).getText();
        String result = driver.findElementByXPath("//android.widget.LinearLayout[4]//android.widget.TextView").getText();
        String[] res = result.split(" ");
        System.out.println(res[1]);

        // Assertion
        Assert.assertEquals(res[1], "45");
    }

    @AfterClass
    public void tearDown() {
        // Close app
       // driver.quit();
    }
}
