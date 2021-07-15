package handlingTheDropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/akshay%20kad/Desktop/wcsm5%20html/dropdownmultiple.html");
		 Thread.sleep(3000);
		 WebElement dropdown=driver.findElement(By.id("menu"));
		 Select sel=new Select(dropdown);
		 for(int i=0;i<=4;i++)
		 {
			sel.selectByIndex(i); 
		 }
	     WebElement firstOption = sel.getFirstSelectedOption();
	     String option = firstOption.getText();
	     System.out.println(option);

	}

}
