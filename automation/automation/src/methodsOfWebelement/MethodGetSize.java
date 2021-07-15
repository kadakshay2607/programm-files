package methodsOfWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodGetSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		WebElement button=driver.findElement(By.xpath("//button[contains(@class,'L3NKy   ')]"));
		Dimension dim = button.getSize();
		int height =dim.getHeight();
		int width =dim.getWidth();
		System.out.println(height);
		System.out.println(width);
	}

}
