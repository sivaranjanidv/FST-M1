package alchemyJob;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9 {
	  @Test
	  public void f() throws InterruptedException {
		  
		  WebDriver driver = new FirefoxDriver();
				WebDriverWait wait = new WebDriverWait(driver, 20);
				driver.get("https://alchemy.hguy.co/jobs/wp-admin");
				driver.manage().window().maximize();
				driver.findElement(By.id("user_login")).sendKeys("root");
				driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
				driver.findElement(By.id("wp-submit")).click();
				driver.findElement(By.xpath("//*[@id=\"menu-posts-job_listing\"]/a/div[3]")).click();
				driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[4]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"post-title-0\"]")).sendKeys("Tester");
				driver.findElement(By.id("_company_website")).sendKeys("abc302");
				driver.findElement(By.id("_company_twitter")).sendKeys("abc302");
				driver.findElement(By.xpath("//*[@id='_job_expires']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//td[contains(@class,'today')]")).click();
				driver.findElement(By.id("_job_location")).sendKeys("London");
				driver.findElement(By.id("_company_name")).sendKeys("abc405");
				driver.findElement(By.id("_company_tagline")).sendKeys("abc405");
				driver.findElement(By.xpath("//button[contains(@class,'upload')]")).click();
				Thread.sleep(4000);
				WebElement attachment=driver.findElement(By.xpath("//*[@id=\"__attachments-view-43\"]/li[1]/div/div"));
				wait.until(ExpectedConditions.visibilityOf(attachment)).click();
				driver.findElement(By.xpath("//*[@id=\"__wp-uploader-id-0\"]/div[4]/div/div[2]/button")).click();
				WebElement publish=driver.findElement(By.xpath("//button[contains(text(),'Publish')]"));
				publish.click();
				Thread.sleep(3000);
				Actions action = new Actions(driver);
				action.click(publish).perform();
				Thread.sleep(3000);
				WebElement joblisting = driver.findElement(By.xpath("//a[contains(text(),'Test')]"));
				Assert.assertTrue(joblisting.isDisplayed());
				System.out.println("Job listing was published and is displayed");
				driver.close();
	  }
}