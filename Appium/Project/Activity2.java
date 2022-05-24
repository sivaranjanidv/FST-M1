package liveProject.GoogleTask_Keeps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Activity2 {
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "139ec4af");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
    }
    @Test
    //Create list of Activities
    public void create() throws InterruptedException {
        driver.findElementById("new_note_button").click();
        Thread.sleep(2000);
        driver.findElementById("editable_title").sendKeys("Title1");
        driver.findElementById("edit_note_text").sendKeys("Use Google Keep Notes");

        driver.findElementByAccessibilityId("Navigate up").click();
        Thread.sleep(2000);
        driver.findElementById("com.google.android.keep:id/browse_note_interior_content").isDisplayed();
        String Title = driver.findElementById("com.google.android.keep:id/index_note_title").getText();
        System.out.println(Title);
        Assert.assertEquals("Title1",Title);
        String notes = driver.findElementById("com.google.android.keep:id/index_note_text_description").getText();
        System.out.println(notes);
        Assert.assertEquals("Use Google Keep Notes",notes);


    }
    @AfterClass
    public void tearDown() {
        // Close app
        driver.quit();
    }
}
