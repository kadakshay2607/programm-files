package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorFlipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("laptop",Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='Core i5']/preceding-sibling::div")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='HP']/preceding-sibling::div")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF' and .='Operating System']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='Windows 10']/preceding-sibling::div")).click();
		WebElement text=driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_25b18c']/div[@class='_30jeq3 _1_WHN1'])[1]"));
		String priceOfFirst= text.getText();
		System.out.println(priceOfFirst);
		driver.close();
	}

}
