package TestNG_PhotoStudio_Admin;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Compare_Bal extends Login_Admin{
  
	@Test
  public void view() {
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[3]/div/div/a")).click();
		  
	}
		@Test (priority = 2)
		public void compare() throws InterruptedException {
		
		String actualval = "http://photoshopdemo.webrelier.com/index.php?msw=balance_report";
		
		String anotherval = "http://photoshopdemo.webrelier.com/index.php?msw=balance_report";
		
		if(actualval == anotherval) {
			System.out.println("Matched");
		}
		
		Thread.sleep(5000);
		driver.close();
  }
}
