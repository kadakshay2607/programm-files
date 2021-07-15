package webBasedPopup;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiTimeUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://akshay/login.do");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[@class='content administration']")).click();
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
		WebElement target = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
		new Actions(driver).doubleClick(target).perform();
		Runtime.getRuntime().exec("C:\\Users\\akshay kad\\Desktop\\eclipse project\\automation\\autoit\\ActitimeUploa.exe");

	}

}
