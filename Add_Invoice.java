package TestNG_PhotoStudio_Admin;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Add_Invoice extends Login_Admin{
  @Test
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
	  driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/ul/li[1]/a")).click();
	  
	  Thread.sleep(5000);
	  driver.close();
  
  }
}
