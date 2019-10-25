package TestNG_PhotoStudio_Admin;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Compare_Stock extends Login_Admin{
  
	@Test
	public void view() {
		  
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/div[2]/div/a")).click();
	  
	}
		@Test (priority = 2)
		public void compare() throws InterruptedException {
		
		String actualval = "http://photoshopdemo.webrelier.com/index.php?msw=stock";
		
		String anotherval = "http://photoshopdemo.webrelier.com/index.php?msw=stock";
		
		if(actualval == anotherval) {
			System.out.println("Matched");
		}
		Thread.sleep(5000);
		driver.close();
  }
}
