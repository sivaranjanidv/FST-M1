package alchemyJob;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		List<WebElement> element = driver.findElements(By.xpath("//div[@class = 'main-navigation']//ul//li"));

		for (WebElement i : element) {
			String value = "Jobs";
			if (value.equals(i.getText())) {
				i.click();
				break;

			}
		}
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		// boolean matches=pageTitle.equals("Alchemy Jobs – Job Board Application");
		if (pageTitle.equals("Jobs – Alchemy Jobs")) {
			// driver.close();
			System.out.println("Title matched,so browser closed");
		}

		WebElement keyword = driver.findElement(By.id("search_keywords"));
		keyword.sendKeys("Banking");
		WebElement searchJobs = driver.findElement(By.xpath("//div[@class='search_submit']//input[1]"));
		searchJobs.click();

		Thread.sleep(3000);
		WebElement joblist = driver.findElement(By.xpath("//ul[@class='job_listings']//li[1]//a"));
		joblist.click();

		Thread.sleep(3000);
		WebElement applyForJob = driver.findElement(By.xpath("//div[@class='job_application application']//input"));
		applyForJob.click();

		WebElement emailtobeprinted = driver.findElement(By.xpath("//div[@class='application_details']//p//a"));
		System.out.println(emailtobeprinted.getText());
		driver.close();

	}
}
