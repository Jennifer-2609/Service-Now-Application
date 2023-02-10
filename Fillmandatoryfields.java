package servicenowapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Fillmandatoryfields extends ServiceNowApplication {

	@Test
	public void runFillmandatoryfields() {
		
		
		shadow.findElementByXPath("//span[text()='Knowledge']").click();
		
		WebElement frames = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frames);
		
		driver.findElement(By.xpath("//span[text()='Create an Article']")).click();
		
		driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_knowledge_base']")).sendKeys("IT");
		driver.findElement(By.xpath("(//span[text()='IT'])[1]")).click();
		
		/*driver.findElement(By.xpath("(//span[@class='icon icon-search'])[1]")).click();
		Set<String> window = driver.getWindowHandles();
		List<String> lst=new ArrayList<String>(window);
		driver.switchTo().window(lst.get(1));
		driver.findElement(By.xpath("//a[text()='IT']")).click();
		driver.switchTo().window(lst.get(0));*/
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Hello, Happy to learn!!");
		//driver.findElement(By.xpath("(//span[@class='icon icon-search'])[2]")).click();
		//driver.findElement(By.xpath("//span[text()='IT']")).click();
		//driver.findElement(By.xpath("//span[text()='Java']")).click();
		//driver.findElement(By.xpath("//button[@id='ok_button']")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		
	}
	}

/*
Assignment 4:Fill mandatory fields
"1. Launch ServiceNow application
2. Login with valid credentials 
3. Enter Knowledge  in filter navigator and press enter
4. Create new Article 
5.Select knowledge base as IT and category as IT- java and Click Ok
6.Update the other mandatory fields
7.Select the submit option
*/