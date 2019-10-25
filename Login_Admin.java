package TestNG_PhotoStudio_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
@Test
public class Login_Admin {
	WebDriver driver;

  public void login() {
	  
	  	driver.findElement(By.xpath("//*[@id=\"frmRLogin\"]/div/a[1]")).click();
		driver.findElement(By.id("txtUserName")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("mahi");
		driver.findElement(By.id("btnLogin")).click();
		
		System.out.println("Logged in");
  }
  
  @BeforeTest
  public void bforetest() {
	  
	  	System.setProperty("webdriver.chrome.driver","D:\\Prashant\\Selenium\\Chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://photoshopdemo.webrelier.com/");
		driver.manage().window().maximize();
	  
  }
}
