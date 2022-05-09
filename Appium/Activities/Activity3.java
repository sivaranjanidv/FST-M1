package activities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity3 {
    // Declare Android driver
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "139ec4af");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.miui.calculator");
        caps.setCapability("appActivity", ".cal.CalculatorActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
    }

    @Test
    public void add() {
        driver.findElementById("btn_5_s").click();
        driver.findElementById("btn_plus_s").click();
        driver.findElementById("btn_9_s").click();
        // Perform Calculation
        driver.findElementById("btn_equal_s").click();

        // Display Result
        String result = driver.findElementById("result").getText();
        System.out.println(result);
        String[] res = result.split(" ");
        System.out.println(res[1]);
        Assert.assertEquals(res[1], "14");
    }

    @Test
    public void divide() {
        driver.findElementById("btn_5_s").click();
        driver.findElementById("btn_0_s").click();
        driver.findElementById("btn_div_s").click();
        driver.findElementById("btn_2_s").click();
        // Perform Calculation
        driver.findElementById("btn_equal_s").click();

        // Display Result
        String result = driver.findElementByXPath("//android.widget.LinearLayout[2]//android.widget.TextView").getText();
        System.out.println(result);
        String[] res = result.split(" ");
        System.out.println(res[1]);
        Assert.assertEquals(res[1], "25");
    }

    @Test
    public void multiply() {
        driver.findElementById("btn_5_s").click();
        driver.findElementById("btn_mul_s").click();
        driver.findElementById("btn_1_s").click();
        driver.findElementById("btn_0_s").click();
        driver.findElementById("btn_0_s").click();
        // Perform Calculation
        driver.findElementById("btn_equal_s").click();

        // Display Result
        String result = driver.findElementByXPath("//android.widget.LinearLayout[3]//android.widget.TextView").getText();
        System.out.println(result);
        String[] res = result.split(" ");
        System.out.println(res[1]);
        Assert.assertEquals(res[1], "500");
    }



    @Test
    public void subtract() {
        driver.findElementById("btn_1_s").click();
        driver.findElementById("btn_0_s").click();
        driver.findElementById("btn_minus_s").click();
        driver.findElementById("btn_5_s").click();
        // Perform Calculation
        driver.findElementById("btn_equal_s").click();

        // Display Result
        String result = driver.findElementByXPath("//android.widget.LinearLayout[4]//android.widget.TextView").getText();
        System.out.println(result);
        String[] res = result.split(" ");
        System.out.println(res[1]);
        Assert.assertEquals(res[1], "5");
    }
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
