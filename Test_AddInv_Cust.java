package TestNG_PhotoStudio_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_AddInv_Cust extends Login_Admin{
  @Test
	  
	  public void f() throws InterruptedException {
		  
		  driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		  driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/ul/li[1]/a")).click();
	  
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.findElement(By.id("btnAddCust")).click();
		  
		  String MainWindow = driver.getWindowHandle();
			Thread.sleep(1000);
			String s= driver.getWindowHandle();
			
			driver.switchTo().window(MainWindow);
			
			driver.findElement(By.id("txtCustomerName")).sendKeys("Avinash");
			driver.findElement(By.id("numberCustomer")).sendKeys("6547891230");
			driver.findElement(By.id("txtAddress")).sendKeys("Baner,Pune");
			
			//birthdate
			driver.findElement(By.id("birthDate")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[1]/th[2]")).click();
		     
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/table/thead/tr/th[2]")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[3]/table/thead/tr/th[1]")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[3]/table/thead/tr/th[1]")).click();
			
			driver.findElement(By.xpath("/html/body/div[4]/div[3]/table/tbody/tr/td/span[10]")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/table/tbody/tr/td/span[7]")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[3]/td[5]")).click();
			
			
			//anniversary_date
			driver.findElement(By.id("anivarsaryDate")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[1]/th[2]")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/table/thead/tr/th[2]")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[3]/table/tbody/tr/td/span[8]")).click();
			
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/table/tbody/tr/td/span[2]")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[3]/td[7]")).click();
			
			//add_cust
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//*[@id=\"btnAddCust\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"CustModal\"]/div/div/div[2]/div[4]/input[1]")).click();
			//*[@id="CustModal"]/div/div/div[2]/div[4]
			
			Thread.sleep(5000);
			driver.close();
	  }

  }

