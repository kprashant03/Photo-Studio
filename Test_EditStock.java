package TestNG_PhotoStudio_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_EditStock extends Login_Admin{
  
	@Test
  public void view() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[4]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"example1\"]/tbody/tr[1]/td[5]/a[2]")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("stock_qty")).clear();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("stock_qty")).sendKeys("200");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("btnUpdateStock")).click();
		
		Thread.sleep(5000);
		driver.close();
  }
}
