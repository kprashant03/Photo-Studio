package TestNG_PhotoStudio_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test_DelStock extends Login_Admin{
  
	@Test
  public void view() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[4]/a")).click();
		
  }
	
	@Test (priority = 2)
	public void del() {
		driver.findElement(By.xpath("//*[@id=\"example1\"]/tbody/tr[1]/td[5]/a[1]")).click();
		driver.switchTo().alert().accept();
	}
	
	@AfterTest 
	public void close() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
