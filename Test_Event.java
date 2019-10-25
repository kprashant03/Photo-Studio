package TestNG_PhotoStudio_Admin;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Event extends Login_Admin{
  
	@Test
  public void event() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[2]/div[3]/div/a")).click();
		
		Thread.sleep(5000);
		driver.close();
  }
}
