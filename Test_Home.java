package TestNG_PhotoStudio_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Home extends Login_Admin{
  
	@Test (priority = 1)
  public void view() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[5]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[5]/ul/li[3]/a")).click();
		
		Thread.sleep(5000);
  }
	
	@Test (priority = 2)
	public void home() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/ol/li[1]/a")).click();
		
		Thread.sleep(5000);
		driver.close();
	}
}
