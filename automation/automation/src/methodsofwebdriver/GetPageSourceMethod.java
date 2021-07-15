package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/akshay%20kad/Desktop/wcsm5%20html/checkbox.html");
	String PageSource = driver.getPageSource();
	System.out.println(PageSource);

	}

}
