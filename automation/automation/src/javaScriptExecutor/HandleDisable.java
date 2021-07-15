package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/akshay%20kad/Desktop/wcsm5%20html/disable.html");
		Thread.sleep(1000);
		 WebElement username = driver.findElement(By.id("i1"));
		 WebElement password = driver.findElement(By.id("i2"));

		 
		if(username.isEnabled())
		{
			username.sendKeys("aks");

		}
		else
		{
			JavascriptExecutor ef=(JavascriptExecutor)driver;
			ef.executeScript("document.getElementById('i1').value='aks'");
		}
		if(password.isEnabled())
		{
			password.sendKeys("kd");

		}
		else
		{
			JavascriptExecutor ef=(JavascriptExecutor)driver;
			ef.executeScript("document.getElementById('i2').value='kd'");
		}

	}

}
