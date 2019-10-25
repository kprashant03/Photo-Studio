package TestNG_PhotoStudio_Admin;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_index extends Login_Admin{
  
	@Test
  public void index() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/header/a")).click();
		
		Thread.sleep(5000);
		driver.close();
  }
}
