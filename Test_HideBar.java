package TestNG_PhotoStudio_Admin;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_HideBar extends Login_Admin{
  
	@Test (priority = 1)
  public void f() throws InterruptedException {
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/a")).click();
		
		Thread.sleep(5000);
		  driver.close();
  }
}
