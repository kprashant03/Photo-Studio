package TestNG_PhotoStudio_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Expenses extends Login_Admin{
  
	@Test (priority = 1)
  public void view() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[10]/a")).click();
  }
	
	@Test (priority = 2)
	public void add( ) {
		driver.findElement(By.id("Party_name_add")).click();
		driver.findElement(By.id("Party_name_add")).sendKeys("Avinash");
		
		driver.findElement(By.id("expenses_ditalis")).click();
		driver.findElement(By.id("expenses_ditalis")).sendKeys("Photos");
		
		driver.findElement(By.id("Exp_Amount")).click();
		driver.findElement(By.id("Exp_Amount")).sendKeys("6000");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("btnaddExpenses")).click();
	}
	
	@Test (priority = 2)
	public void reset() throws InterruptedException {
		driver.findElement(By.id("Party_name_add")).click();
		driver.findElement(By.id("Party_name_add")).sendKeys("Avinash");
		
		driver.findElement(By.id("expenses_ditalis")).click();
		driver.findElement(By.id("expenses_ditalis")).sendKeys("Photos");
		
		driver.findElement(By.id("Exp_Amount")).click();
		driver.findElement(By.id("Exp_Amount")).sendKeys("6000");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("btnSaveResetexp")).click();
		
		Thread.sleep(5000);
		driver.close();
	}
}
