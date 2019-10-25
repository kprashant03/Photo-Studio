package TestNG_PhotoStudio_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_PendingJob extends Login_Admin{
  
	@Test (priority = 1)
  public void view() {
		//driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[7]/a")).click();
  }
	
	@Test (priority = 2)
	public void complete() {
		driver.findElement(By.xpath("//*[@id=\"example1\"]/tbody/tr[1]/td[11]/a")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
	}
	
	@Test (dependsOnMethods = "complete")
	public void next() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/div/div/a[9]")).click();
	
		Thread.sleep(5000);
		  driver.close();
	}
}
