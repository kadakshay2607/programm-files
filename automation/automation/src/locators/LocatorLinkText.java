package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorLinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
	     driver.get("file:///C:/Users/akshay%20kad/Desktop/wcsm5%20html/forinsta.html");
     driver.manage().window().maximize();
     driver.findElement(By.linkText("click here")).click();
	}

}
