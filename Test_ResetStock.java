package TestNG_PhotoStudio_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test_ResetStock extends Login_Admin{
  
	@Test (priority = 1)
  public void view() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[4]/a")).click();
		
	}
	
	@Test (priority = 2)
	public void reset() {
		driver.findElement(By.id("stock_name")).clear();
		driver.findElement(By.id("stock_name")).sendKeys("Photos");
		
		driver.findElement(By.id("stock_qty")).clear();
		driver.findElement(By.id("stock_qty")).sendKeys("20");
		
		driver.findElement(By.id("per_unit_sell_amt")).clear();
		driver.findElement(By.id("per_unit_sell_amt")).sendKeys("200");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("btnResetStock")).click(); 
  }
	
	@AfterTest
	public void close() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
