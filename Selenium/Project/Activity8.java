package alchemyJob;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8 {
	  @Test
	  public void f() {
		  
		  WebDriver driver = new FirefoxDriver();
			WebDriverWait wait = new WebDriverWait(driver, 20);
			driver.get("https://alchemy.hguy.co/jobs/wp-admin");
			driver.findElement(By.id("user_login")).sendKeys("root");
			driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
			driver.findElement(By.id("wp-submit")).click();
			WebElement loginname= driver.findElement(By.xpath("(//span[@class='display-name'])[1]"));
			Assert.assertTrue(loginname.isDisplayed());
			System.out.println("Logged in sucecssfully");
			driver.close();
	  }
	}

