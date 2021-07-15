package methodsOfWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodIsSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/akshay%20kad/Desktop/wcsm5%20html/checkbox.html");
		Thread.sleep(3000);
		WebElement button=driver.findElement(By.id("i1"));
		boolean status=button.isEnabled();
		System.out.println(status);

	}

}
