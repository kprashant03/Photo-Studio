package TestNG_PhotoStudio_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Settings_1 extends Login_Admin{
  
	@Test (priority = 1)
  public void view() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/ul/li[2]/div[2]/a")).click();
		
		Thread.sleep(5000);
		driver.close();
  }
}
