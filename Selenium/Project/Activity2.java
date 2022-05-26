package alchemyJob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		WebElement element = driver.findElement(By.className("entry-title"));
		String heading = element.getText();
		if (heading.equals("Welcome to Alchemy Jobs")) {
			driver.close();
			System.out.println("Heading matched,so browser closed");
		}
	}
}
