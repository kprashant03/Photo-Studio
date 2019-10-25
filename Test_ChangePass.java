package TestNG_PhotoStudio_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_ChangePass extends Login_Admin{
  
	@Test (priority = 1)
  public void view() {
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[14]/a")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	
	@Test (priority = 2)
	public void pass() {
		driver.findElement(By.id("txtCurrentPass")).click();
		driver.findElement(By.id("txtCurrentPass")).sendKeys("mahi");
		
		driver.findElement(By.id("txtNewpass")).sendKeys("mahi123");
		driver.findElement(By.id("txtconfirmPass")).sendKeys("mahi123");
	}

	@Test (priority = 3)
	public void reset() throws InterruptedException {
		driver.findElement(By.id("btnReset")).click();
		
		Thread.sleep(5000);
		  driver.close();
	}
  }

