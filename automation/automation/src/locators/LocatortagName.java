package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatortagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/akshay%20kad/Desktop/wcsm5%20html/search.html");
		   driver.findElement(By.tagName("username")).sendKeys("admin");		
		

	}

}
