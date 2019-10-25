package TestNG_PhotoStudio_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_ExpensesSearch extends Login_Admin{
  
	@Test (priority = 1)
  public void view() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[10]/a")).click();
  
  }
	
	@Test (priority = 2)
	public void search() {
		driver.findElement(By.id("Exp_name")).click();
		driver.findElement(By.id("Exp_name")).sendKeys("mahesh");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("searchexp")).click();
	}
	/*
	@Test (priority = 3)
	public void edit() {
		driver.findElement(By.xpath("//*[@id=\"example1\"]/tbody/tr[2]/td[5]/a[2]")).click();
	}
	*/
	
	@Test (priority = 4)
	public void delete() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"example1\"]/tbody/tr[1]/td[5]/a[1]")).click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		  driver.close();
	}
}
