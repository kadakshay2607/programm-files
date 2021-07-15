package mouseActions;

import java.util.List;
//import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class UrbanLadder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		Thread.sleep(3000);
		 List<WebElement> target=driver.findElements(By.xpath("//span[@class='topnav_itemname']"));
		 //TreeSet<String> s = new TreeSet<String>();
		//	Actions act = new Actions(driver);
		 for(int i=1;i<target.size();i++)
		 {
			// target.get(i)
			// String textToinssert = ops.get(i).getText();
			// s.add(textToinssert);
				Thread.sleep(3000);;

		 }

		//act.moveToElement(target).perform();
		
	}

}
