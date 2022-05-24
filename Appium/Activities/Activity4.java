package activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity4 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "139ec4af");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.contacts");
        caps.setCapability("appActivity", ".activities.PeopleActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 5);
    }

    @Test
    public void addContact() {
        // Wait for app to load
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Contacts")));

        // Click on add new contact floating button
        driver.findElementByAccessibilityId("Contacts").click();
       // wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(" android:id/icon")));

        // Click on add new contact floating button
        driver.findElementById("android:id/icon").click();

        // Wait for fields to load
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.EditText[@text='Name']")));

        // Find the first name, last name, and phone number fields
        MobileElement Name = driver.findElementByXPath("//android.widget.EditText[@text='Name']");
        MobileElement Title = driver.findElementByXPath("//android.widget.EditText[@text='Title']");
        MobileElement phoneNumber = driver.findElementByXPath("//android.widget.EditText[@text='Phone']");

        // Enter the text in the fields
        Name.sendKeys("Rani");
        Title.sendKeys("IBM");
        phoneNumber.sendKeys("9991284782");

        // Save the contact
        driver.findElementById("android:id/button2").click();

        // Wait for contact card to appear
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.android.contacts:id/content_header")));

        // Assertion
        MobileElement mobileCard = driver.findElementById("com.android.contacts:id/content_header");
        Assert.assertTrue(mobileCard.isDisplayed());

        String contactName = driver.findElementById("com.android.contacts:id/custom_title").getText();
        Assert.assertEquals(contactName, "Rani");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
