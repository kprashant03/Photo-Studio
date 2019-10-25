package TestNG_PhotoStudio_Admin;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test
public class Cust_Test extends Login_Admin{
  
  public void f() throws InterruptedException {
	  
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[6]/a")).click();
	  
	  Thread.sleep(5000);
	  driver.close();
  }
}
