package TestNG_PhotoStudio_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.seleniumhq.jetty9.util.log.Log;
import org.testng.annotations.Test;

@Test
public class Reports extends Login_Admin{
 
	public void Report() throws InterruptedException {
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[5]/a")).click();
		  /*driver.findElement(By.id("stock_name")).sendKeys("GlassFrame");
		  driver.findElement(By.id("stock_qty")).sendKeys("15");
		  driver.findElement(By.id("per_unit_sell_amt")).sendKeys("200");
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.id("btnSaveStock")).click(); 
		  */
		  
		  Thread.sleep(5000);
		  driver.close();
	  }
	  
	  
}
