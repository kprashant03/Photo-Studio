package TestNG_PhotoStudio_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test_MasterCompany_Edit extends Login_Admin{
  
	@Test (priority = 1)
  public void view() {
		
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[11]/a")).click();
  }
	
	@Test (priority = 2)
	public void company_edit() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div/section[3]/div/div/div/div/div[3]/table/tbody/tr[3]/td[5]/a[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"txtOwnerName\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"txtOwnerName\"]")).sendKeys("PhotoShop");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtShopName")).click();
		driver.findElement(By.id("txtShopName")).sendKeys("Anuradha");
		
		driver.findElement(By.id("numPhone1")).click();
		driver.findElement(By.id("numPhone1")).sendKeys("9096128989");
		
		driver.findElement(By.id("numPhone2")).click();
		driver.findElement(By.id("numPhone2")).sendKeys("7276347944");
		
		driver.findElement(By.id("txtLandline")).click();
		driver.findElement(By.id("txtLandline")).sendKeys("");
	
		driver.findElement(By.id("txtEmail")).click();
		driver.findElement(By.id("txtEmail")).sendKeys("anuradha123@gmail.com");
	
		driver.findElement(By.id("txtWebsite")).click();
		driver.findElement(By.id("txtWebsite")).sendKeys("www.photostudio.com");
	
		driver.findElement(By.id("txtrAddress")).click();
		driver.findElement(By.id("txtrAddress")).sendKeys("Kharadi");
	
		driver.findElement(By.id("txtEmail")).click();
		driver.findElement(By.id("txtEmail")).sendKeys("Pune");
		
		driver.findElement(By.id("selState")).click();
		driver.findElement(By.id("selState")).sendKeys("Maharashtra");
	
		driver.findElement(By.id("selCountry")).click();
		driver.findElement(By.id("selCountry")).sendKeys("India");
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"fileLogo\"]")).click();
		
		/* Thread.sleep(5000);
		
		WebElement uploadElement = driver.findElement(By.xpath("//*[@id=\\\"fileLogo\\\"]"));
		uploadElement.sendKeys("C:\\Users\\Abhineet\\Pictures\\photostud\\photostudiologo.jpg");
		
		*/
		Thread.sleep(5000);
		  driver.close();
	
	}
}
