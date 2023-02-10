package servicenowapplication;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateNewCaller extends ServiceNowApplication {

	@Test
	public void runCreateNewCaller() {
		
		
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("callers");//enter callers
		WebElement click = shadow.findElementByXPath("//mark[text()='Callers']");//click proposal
		driver.executeScript("arguments[0].click();",click );
	
		WebElement frames = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frames);
		
		driver.findElement(By.xpath("//button[text()='New']")).click();//click New
		driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys("Jennifer");
		driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys("Jason");
		
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
		
		String text = driver.findElement(By.xpath("//div[@class='outputmsg_text']")).getText();
		
		if(text.contains("created")) {
			System.out.println(text);
		}
		
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]")).sendKeys("jenni",Keys.ENTER);
		
		List<String> lst=new ArrayList<String>();
		List<WebElement> callerlist = driver.findElements(By.xpath("//table[@id='sys_user_table']//tr//td[3]"));
		for (int i = 0; i < callerlist.size(); i++) {
			String text2 = callerlist.get(i).getText();
			lst.add(text2);
		}
		
		if(lst.contains("Jas")) {
		System.out.println("verified");
		
	}
		
}
}
/*
Assignment 3:Create New Caller
"1. Launch ServiceNow application
2. Login with valid credential
3. Click-All and Enter Callers in filter navigator and press enter 
4. Create new Caller by filling all the fields and click 'Submit'.
5. Search and verify the newly created Caller"
*/