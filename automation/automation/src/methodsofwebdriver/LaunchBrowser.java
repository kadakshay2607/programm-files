package methodsofwebdriver;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	static WebDriver driver;
	private static Scanner sc;

	public static void main(String[] args) {
	sc = new Scanner(System.in);
System.out.println("please enter the browser name:");
String browserValue=sc.next();
System.out.println(browserValue);
if(browserValue.equalsIgnoreCase("chrome"));
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("htpps://www.instagram.com");
	}
 if(browserValue.equalsIgnoreCase("firefox"));
{
    	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("htpps://www.instagram.com");
	}

{
	System.out.println("enter valid correct browser name");
}
	}

}
