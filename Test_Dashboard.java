package TestNG_PhotoStudio_Admin;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Dashboard extends Login_Admin{
  
	@Test (priority = 1)
  public void view() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[4]/a")).click();
		Thread.sleep(5000);
  }
	
	@Test (priority = 2)
	public void Dashboard() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[2]/a")).click();
		
		Thread.sleep(5000);
		driver.close();
	}
}
