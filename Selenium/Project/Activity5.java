package alchemyJob;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	List<WebElement> element = driver.findElements(By.xpath("//div[@class = 'main-navigation']//ul//li"));
	
	
	for(WebElement i:element) {
		String value="Jobs";
		if(value.equals(i.getText())) {
			i.click();
			break;
			
		}
	}
	String pageTitle = driver.getTitle();
	System.out.println(pageTitle);
	// boolean matches=pageTitle.equals("Alchemy Jobs – Job Board Application");
	if (pageTitle.equals("Jobs – Alchemy Jobs")) {
		driver.close();
		System.out.println("Title matched,so browser closed");
	}
	
	}
}
