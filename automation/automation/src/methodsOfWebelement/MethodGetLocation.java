package methodsOfWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodGetLocation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		WebElement button=driver.findElement(By.xpath("//button[contains(@class,'L3NKy   ')]"));
		Point loc=button.getLocation();
		int xaxis=loc.getX();
		int yaxis=loc.getX();
		System.out.println(xaxis);
		System.out.println(yaxis);
		

	}

}
