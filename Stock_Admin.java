package TestNG_PhotoStudio_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


@Test
public class Stock_Admin extends Login_Admin{
	
  public void Stock() throws InterruptedException {
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[4]/a")).click();
	  driver.findElement(By.id("stock_name")).sendKeys("GlassFrame");
	  driver.findElement(By.id("stock_qty")).sendKeys("15");
	  driver.findElement(By.id("per_unit_sell_amt")).sendKeys("200");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.id("btnSaveStock")).click(); 
	  
  }
	  
	  @AfterTest
	  public void close() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
	  
  }
  
  
}
