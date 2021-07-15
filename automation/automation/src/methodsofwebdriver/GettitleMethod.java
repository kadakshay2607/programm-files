package methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GettitleMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		 String titleOfthePage = driver.getTitle();
		System.out.println(titleOfthePage);
		driver.close();

	}

}
