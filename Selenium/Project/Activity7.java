package alchemyJob;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7 {

	//public static void main(String[] args) throws InterruptedException {
		@Test
		public void f() {
			WebDriver driver = new FirefoxDriver();
			WebDriverWait wait = new WebDriverWait(driver, 20);
			driver.get("https://alchemy.hguy.co/jobs/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebElement postjob = driver.findElement(By.xpath("//*[@id=\"menu-item-26\"]/a"));
			postjob.click();
			driver.findElement(By.id("create_account_email")).sendKeys("abc70@gmail.com");
			driver.findElement(By.id("job_title")).sendKeys("testing207");
			driver.findElement(By.id("job_location")).sendKeys("India");
			WebElement jobtype = driver.findElement(By.id("job_type"));
			Select select = new Select(jobtype);
			select.selectByVisibleText("Part Time");
			WebElement iframe1 = driver.findElement(By.id("job_description_ifr"));
			driver.switchTo().frame(iframe1);
			driver.findElement(By.xpath("//*[@id=\"tinymce\"]")).sendKeys("description");
			driver.switchTo().defaultContent();
			driver.findElement(By.id("application")).sendKeys("abc@gmail.com");
			driver.findElement(By.id("company_name")).sendKeys("abc@gmail.com");
			driver.findElement(By.xpath("//input[@value='Preview']")).click();
			WebElement submit_list = driver.findElement(By.id("job_preview_submit_button"));
			wait.until(ExpectedConditions.visibilityOf(submit_list));
			submit_list.click();
			driver.findElement(By.xpath("//*[@id=\"menu-item-24\"]/a")).click();
			driver.findElement(By.id("search_keywords")).clear();
			driver.findElement(By.id("search_keywords")).sendKeys("testing207");
			System.out.println("Posted job is displayed "
					+ driver.findElement(By.xpath("//h3[contains(text(),'testing207')]")).isDisplayed());
			driver.close();
		}
		
		/*
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		List<WebElement> element = driver.findElements(By.xpath("//div[@class = 'main-navigation']//ul//li"));

		for (WebElement i : element) {
			String value = "Post a Job";
			if (value.equals(i.getText())) {
				i.click();
				break;

			}
		}
		Thread.sleep(3000);
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		WebElement urEmail = driver.findElement(By.id("create_account_email"));
		WebElement jobTitle = driver.findElement(By.id("job_title"));
		WebElement jobLocation = driver.findElement(By.id("job_location"));
		WebElement jobtype = driver.findElement(By.id("job_type"));

		WebElement descFrame = driver.findElement(By.id("job_description_ifr"));
		driver.switchTo().frame(descFrame);
		WebElement desc = driver.findElement(By.id("tinymce"));
		driver.switchTo().defaultContent();
		WebElement appEmail_Url = driver.findElement(By.id("application"));
		WebElement companyName = driver.findElement(By.id("company_name"));
		WebElement button = driver.findElement(By.xpath("//input[@class='button']"));

		urEmail.sendKeys("tes22t@gmail.com");
		jobTitle.sendKeys("IBM Quality Assurance ");
		jobLocation.sendKeys("Chennai");
		Select s = new Select(jobtype);
		s.selectByIndex(1);
		driver.switchTo().frame(descFrame);
		desc.sendKeys("Test test test");
		driver.switchTo().defaultContent();
		driver.switchTo().defaultContent();
		
		 * String pageTitle1 = driver.getTitle(); System.out.println(pageTitle1);
		 * driver.switchTo().window(pageTitle1);
		 
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(5000);
		appEmail_Url.sendKeys("testrough@test.com");
		companyName.sendKeys("IBM GBS");
		button.click();
		Thread.sleep(3000);
		WebElement submitListing = driver.findElement(By.xpath("//div[@class='job_listing_preview_title']//input[1]"));
		submitListing.click();
		WebElement clickHere = driver.findElement(By.xpath("//div[@class='entry-content clear']//a"));
		clickHere.click();

		List<WebElement> element1 = driver.findElements(By.xpath("//div[@class = 'main-navigation']//ul//li"));

		for (WebElement i : element1) {
			String value = "Jobs";
			if (value.equals(i.getText())) {
				i.click();
				break;

			}
		}
		Thread.sleep(3000);
		WebElement joblist = driver.findElement(By.xpath("//ul[@class='job_listings']//li[6]//a"));
	joblist.isDisplayed();
	driver.close();
	}
*/}
