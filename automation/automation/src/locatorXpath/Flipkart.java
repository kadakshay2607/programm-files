package locatorXpath;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {



	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 @SuppressWarnings("resource")
		Scanner sca = new Scanner(System.in);
			System.out.println("enter the value");
		String optionOfClick = sca.nextLine();
		WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(8000);
       driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
       Thread.sleep(3000);
       driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("laptop",Keys.ENTER);
       Thread.sleep(2000);
       driver.findElement(By.xpath("//span[@class='_2I9KP_' and .='"+optionOfClick+"']")).click();

	}

}
