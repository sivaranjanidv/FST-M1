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

public class Activity1 {
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "139ec4af");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
    }
    @Test
    //Create list of Activities
    public void create() throws InterruptedException {
        driver.findElementById("tasks_fab").click();
        Thread.sleep(2000);
        driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Tasks");
        driver.findElementById("add_task_done").click();
        driver.findElementById("tasks_fab").click();
        Thread.sleep(2000);
        driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Keep");
        driver.findElementById("add_task_done").click();
        driver.findElementById("tasks_fab").click();
        Thread.sleep(2000);
        driver.findElementById("add_task_title").sendKeys("Complete the second Activity Google Keep");
        driver.findElementById("add_task_done").click();
List<MobileElement> element = driver.findElementsById("task_data");
int taskSize= element.size();
System.out.println("Size"+taskSize);
        Assert.assertEquals(taskSize,7);

    }
    @AfterClass
    public void tearDown() {
        // Close app
        driver.quit();
    }
}
