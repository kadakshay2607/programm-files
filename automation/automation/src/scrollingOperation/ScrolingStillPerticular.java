package scrollingOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolingStillPerticular {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		Thread.sleep(3000);
		WebElement target=driver.findElement(By.xpath("//h2[.='Urban Ladder offers gorgeous furniture online to fuel your creativity:']"));
		Point po = target.getLocation();
		int xaxis = po.getX();
		int yaxis = po.getY();
		System.out.println("xaxis ="+ xaxis);
		System.out.println("yaxis ="+ yaxis);

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		Thread.sleep(3000);

	}

}
