package TestNG_PhotoStudio_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dependency {
	WebDriver driver;
	
  @Test
  public void StartApp() { 
	  
	  driver.get("http://photoshopdemo.webrelier.com/index.php");
	  driver.findElement(By.xpath("//*[@id=\"frmRLogin\"]/div/a[1]")).click();
  }
  
  @Test(dependsOnMethods = "StartApp")
  public void login_app() {
	    
	  	driver.findElement(By.id("txtUserName")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("mahi");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("btnLogin")).click();
		
		boolean status = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a/span")).isDisplayed();
		Assert.assertTrue(status);
	  
  }
  
  @Test(dependsOnMethods = "login_app") 
	  public void Stock() {
	  
	  driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[4]/a")).click();
	  driver.findElement(By.id("stock_name")).sendKeys("Flowers");
	  driver.findElement(By.id("stock_qty")).sendKeys("15");
	  driver.findElement(By.id("per_unit_sell_amt")).sendKeys("300");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.id("btnSaveStock")).click();
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\\\Prashant\\\\Selenium\\\\Chromedriver\\\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }
}
