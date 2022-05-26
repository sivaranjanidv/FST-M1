package alchemyJob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		WebElement element = driver.findElement(By.xpath("//div[@class='entry-content clear']//h2"));
	String secondHeading = element.getText();
		if(secondHeading.equals("Quia quis non")) {
		driver.close();
		System.out.println("Second Heading matched,so browser closed");
	}
		
	}
}
