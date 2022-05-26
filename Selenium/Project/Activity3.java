package alchemyJob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		WebElement element = driver.findElement(By.xpath("//div[@class='post-thumb-img-content post-thumb']//img"));
		String headerImgUrl = element.getAttribute("src");
		System.out.println(headerImgUrl); 
		driver.close();
	}
}
