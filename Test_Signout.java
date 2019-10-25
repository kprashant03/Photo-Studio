package TestNG_PhotoStudio_Admin;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Signout extends Login_Admin{
  
	@Test
  public void Signout() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[15]/a")).click();
		
		Thread.sleep(5000);
		  driver.close();
  }
}
