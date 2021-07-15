package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPartialLinkText {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
	     driver.get("file:///C:/Users/akshay%20kad/Desktop/wcsm5%20html/forinsta.html");
     driver.manage().window().maximize();
    driver.findElement(By.partialLinkText("instagram")).click();
	}

}
