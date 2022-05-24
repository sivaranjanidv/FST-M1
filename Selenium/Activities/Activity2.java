package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
	public static void main(String args[]) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title=driver.getTitle();
		System.out.println("Title"+title);
		WebElement idLoc =driver.findElement(By.id("about-link"));
		System.out.println(idLoc.getText());
		WebElement classLoc = driver.findElement(By.className("ui inverted huge green button"));
		System.out.println(classLoc.getText());
		WebElement linkLoc = driver.findElement(By.linkText("About Us"));
		System.out.println(linkLoc.getText());

		WebElement cssLoc=driver.findElement(By.cssSelector(".green"));
		System.out.println(cssLoc.getText());

		driver.close();
	}
}
