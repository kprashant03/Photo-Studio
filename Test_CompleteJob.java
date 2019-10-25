package TestNG_PhotoStudio_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_CompleteJob extends Login_Admin{
  
	@Test (priority = 1)
  public void view() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[8]/a")).click();
  }
	
	@Test (priority = 2)
	public void pending() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"example1\"]/tbody/tr[5]/td[11]/a")).click();
	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		  driver.close();
	}
	
 /*	@Test (dependsOnMethods = "pending") 
		public void next() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/div/div/a[5]")).click();
		} 
		*/
	}

