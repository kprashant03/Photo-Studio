package TestNG_PhotoStudio_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_PrintInv extends Login_Admin{
  
	@Test (priority = 1)
  public void view() {
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/ul/li[3]/a")).click();
	}
	
	@Test (priority = 2)
	public void name() {
		driver.findElement(By.xpath("//*[@id=\"CustomerName\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"CustomerName\"]")).sendKeys("Avinash");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"searchCustomer\"]")).click();
	}
	
	@Test (priority = 3)
	public void id() {
		driver.findElement(By.xpath("//*[@id=\"CustomerName\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"CustomerName\"]")).sendKeys("15");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"searchCustomer\"]")).click();
	}
	
	@Test (priority = 4)
	public void number() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"CustomerName\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"CustomerName\"]")).sendKeys("9764373987");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"searchCustomer\"]")).click();
	
		Thread.sleep(5000);
		  driver.close();
	
	}
}

