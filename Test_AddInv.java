package TestNG_PhotoStudio_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.testng.annotations.Test;

public class Test_AddInv extends Login_Admin{
  @Test
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
	  driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/ul/li[1]/a")).click();
  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  driver.findElement(By.id("btnAddCompany")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//*[@id=\"itemName\"]")).click();
	  
	  driver.findElement(By.xpath("//*[@id=\"itemName\"]/option[26]")).click();
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id=\"stock_qty\"]")).sendKeys("4");
	  
	  driver.findElement(By.xpath("//*[@id=\"textCameraNo\"]")).sendKeys("DX_0843");
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//*[@id=\"btnSaveItem\"]")).click();
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  //driver.findElement(By.xpath("<input type=\"text\" name=\"txtEventNote\" id=\"txtEventNote\" class=\"form-control select2\" data-mask=\"\">")).sendKeys("Birthday");

	  //search-customer
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id=\"customername\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"customername\"]")).sendKeys("Avinash");
	  
	  //Event-note
	  driver.findElement(By.id("txtEventNote")).sendKeys("Birthday");
	  
	  //type
	  driver.findElement(By.xpath("//*[@id=\"jobtype\"]")).click();
	  
	  //discount
	  Thread.sleep(10000);
	  driver.findElement(By.xpath("//*[@id=\"discount\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"discount\"]")).sendKeys("800");
	  
	  //pay_amount
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id=\"payamount\"]")).click();
	  
	  //due_date
	  driver.findElement(By.xpath("//*[@id=\"duedate\"]")).click();
	  driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[6]")).click();
	  driver.findElement(By.xpath("//*[@id=\"payamount\"]")).sendKeys("10000");
	  
	  //Note
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.id("txtNote")).click();
	  driver.findElement(By.id("txtNote")).sendKeys("Thanks for giving us a chance");
	  
	  //save_invoice
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id=\"btnSaveInvoice\"]")).click();
	  
	  Thread.sleep(5000);
	  driver.close();
  }
}
