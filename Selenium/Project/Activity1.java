package alchemyJob;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
	public static void main(String[] args) {
//Activity1
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		// boolean matches=pageTitle.equals("Alchemy Jobs – Job Board Application");
		if (pageTitle.equals("Alchemy Jobs – Job Board Application")) {
			driver.close();
			System.out.println("Title matched,so browser closed");
		}
	}
}
