package servicenowapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OrderingMobile extends ServiceNowApplication {

	@Test
	public void runOrderingMobile() {
		
		
		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		
		WebElement frames = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frames);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		
		WebElement click = driver.findElement(By.xpath("(//strong[contains(text(),'Apple iPhone 13')])[1]"));
		driver.executeScript("arguments[0].click();",click );
		
		driver.findElement(By.xpath("(//label[@class='radio-label'])[2]")).click();
		driver.findElement(By.xpath("(//label[@class='radio-label'])[5]")).click();
		driver.findElement(By.xpath("(//label[@class='radio-label'])[10]")).click();
		
		WebElement selects = driver.findElement(By.xpath("//select[@name='IO:33494b069747011021983d1e6253af45']"));
		Select select=new Select(selects);
		select.selectByIndex(2);
		
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		
		String text = driver.findElement(By.xpath("//span[@aria-live='assertive']")).getText();
		if(text.contains("submitted")) {
		System.out.println(text);
	}
		
		String text2 = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println("Request Number:  " + text2);
		
		
}
}

/*
Assignment 1:Ordering mobile
"1. Launch ServiceNow application
2. Login with valid credentials username as admin and password as India@123
3. Click-AllEnter Service catalog in filter navigator and press enter 
4. Click on  mobiles
5.Select Apple iphone6s
6.Update color field to rose gold and storage field to 128GB
7.Select  Order now option
8.Verify order is placed and copy the request number"
*/