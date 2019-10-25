package TestNG_PhotoStudio_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test_Inv_Compare extends Login_Admin{
  
	@Test
  public void view() {
	  
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/div[1]/div/a")).click();
	  
	}
		@Test (priority = 2)
		public void compare() throws InterruptedException {
		
		String actualval = "http://photoshopdemo.webrelier.com/index.php?msw=invoice";
		
		String anotherval = "http://photoshopdemo.webrelier.com/index.php?msw=invoice";
		
		if(actualval == anotherval) {
			System.out.println("Matched");
		}
		
		Thread.sleep(5000);
		  driver.close();
  }
}
