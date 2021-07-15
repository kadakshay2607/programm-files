package keyworddrivenframe;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeLogin  extends BaseTe{
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		
	
		Thread.sleep(3000);
		
		Flib flib = new Flib();
		
		driver.findElement(By.name("username")).sendKeys("admin");//from line 21
		driver.findElement(By.name("pwd")).sendKeys("manager");//from line 22
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		
		
		
		
		
	}

}
