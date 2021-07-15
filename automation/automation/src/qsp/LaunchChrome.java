package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("hi , i am demo");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
	     driver.get("https://www.google.com");
     driver.manage().window().maximize();
     Thread.sleep(7000);
     driver.close();
	}

}
