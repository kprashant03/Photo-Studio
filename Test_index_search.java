package TestNG_PhotoStudio_Admin;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_index_search extends Login_Admin{
  
	@Test
  public void view() throws InterruptedException {
		
		driver.findElement(By.id("CustomerNameone")).click();
		driver.findElement(By.id("CustomerNameone")).sendKeys("Mahesh");
		driver.findElement(By.id("search-btn")).click();
		
		Thread.sleep(5000);
		driver.close();
  }
}
