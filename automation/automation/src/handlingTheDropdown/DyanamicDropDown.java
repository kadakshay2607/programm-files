package handlingTheDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("laptop");
		Thread.sleep(6000);
		List<WebElement> sugg=driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		for(WebElement we:sugg)
		{
			String getTe = we.getText();
			System.out.println(getTe);
		}
	   
		 
		  
	}

}
