package TestNG_PhotoStudio_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class TestSearch extends Login_Admin{
  
  public void f() throws InterruptedException {
	  
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[6]/a")).click();
	  
	  driver.findElement(By.id("candidateName")).click();
	  driver.findElement(By.id("candidateName")).sendKeys("Kumar");
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.id("searchcand")).click();
  }
  
  @AfterTest
  public void edit() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//*[@id=\"example1\"]/tbody/tr/td[4]/a[2]")).click();
	  driver.findElement(By.id("txtEmailId")).sendKeys("kumar2056@yahoo.com");
	  
	//birth_date
			driver.findElement(By.id("birthDate")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[1]/th[2]")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/table/thead/tr/th[2]")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/table/thead/tr/th[2]")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/table/thead/tr/th[1]")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/table/thead/tr/th[1]")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/table/tbody/tr/td/span[2]")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/table/tbody/tr/td/span[4]")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//anniversary_date
			driver.findElement(By.id("anivarsaryDate")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[1]/th[2]")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/table/thead/tr/th[2]")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/table/tbody/tr/td/span[6]")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/table/tbody/tr/td/span[8]")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[4]/td[4]")).click();
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.id("btnUpdateCust")).click();
			
			Thread.sleep(5000);
			  driver.close();
	  
  } 
}
