package methodsOfWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodGetRect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		WebElement button=driver.findElement(By.xpath("//button[contains(@class,'L3NKy   ')]"));
		Rectangle rect = button.getRect();
		int height=rect.getHeight();
		int width=rect.getWidth();
		int xaxis=rect.getX();
		int yaxis=rect.getY();
		System.out.println(height);
		System.out.println(width);
		System.out.println(xaxis);
		System.out.println(yaxis);

	}

}
