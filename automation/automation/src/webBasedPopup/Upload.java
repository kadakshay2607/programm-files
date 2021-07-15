package webBasedPopup;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//b[.='PIM']")).click();
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
		driver.findElement(By.xpath("//input[@class='formInputText' and @name='firstName']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("abc123");
		WebElement target = driver.findElement(By.xpath("//input[@id='photofile']"));
		new Actions(driver).doubleClick(target).perform();
		
		//Runtime.getRuntime().exec("C:\\Users\\akshay kad\\Desktop\\eclipse project\\automation\\autoit\\upload1.exe");
		

	}

}
