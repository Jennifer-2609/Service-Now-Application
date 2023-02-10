package servicenowapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreatenewProposal extends ServiceNowApplication{

	@Test
	public void runCreatenewProposal() throws InterruptedException {
		
		
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Proposal");//type proposal in filter
		WebElement click = shadow.findElementByXPath("//mark[text()='Proposal']");//click proposal
		driver.executeScript("arguments[0].click();",click );
		
		WebElement frames = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frames);
		
		driver.findElement(By.xpath("//button[text()='New']")).click();//click New
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Replace all toners");
		
		//driver.findElement(By.xpath("//button[@id='sysverb_insert']")).click();
		
		
		WebElement click1 = driver.findElement(By.xpath("(//span[text()='Change Request values'])[1]"));
		driver.executeScript("arguments[0].click();",click1 );
		
		driver.findElement(By.xpath("(//input[contains(@class,'filerTableInput')])[1]")).clear();
		driver.findElement(By.xpath("(//input[contains(@class,'filerTableInput')])[1]")).sendKeys("Okay");
				
		driver.findElement(By.xpath("(//textarea[contains(@class,'filerTableInput')])[1]")).clear();
		driver.findElement(By.xpath("(//textarea[contains(@class,'filerTableInput')])[1]")).sendKeys("Okay");
		
		driver.findElement(By.xpath("(//textarea[contains(@class,'filerTableInput')])[2]")).clear();
		driver.findElement(By.xpath("(//textarea[contains(@class,'filerTableInput')])[2]")).sendKeys("Okay");
		
		driver.findElement(By.xpath("(//textarea[contains(@class,'filerTableInput')])[3]")).clear();
		driver.findElement(By.xpath("(//textarea[contains(@class,'filerTableInput')])[3]")).sendKeys("Okay");
		
		driver.findElement(By.xpath("(//textarea[contains(@class,'filerTableInput')])[4]")).clear();
		driver.findElement(By.xpath("(//textarea[contains(@class,'filerTableInput')])[4]")).sendKeys("Okay");
		
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
		
		
		//WebElement selects = driver.findElement(By.xpath("(//select[@title='Choose option'])[1]"));
		//Select sel=new Select(selects);
		//sel.selectByVisibleText("Reason");
		//WebElement selects1 = driver.findElement(By.xpath("(//select[contains(@class,'filerTableSelect')])[3]"));
		//Select sel1=new Select(selects1);
		//sel1.selectByVisibleText("Problem resolution");
		//driver.findElement(By.xpath("(//a[@class='select2-choice'])[1]")).click();
		//driver.findElement(By.xpath("(//input[@type='text'])[15]")).sendKeys("Review Comments");
		//driver.findElement(By.xpath("(//textarea[contains(@class,'filerTableInput')])[1]")).sendKeys("Reason");
		
		//WebElement selects2 = driver.findElement(By.xpath("(//select[@title='Choose option'])[2]"));
		//Select sel2=new Select(selects2);
		//sel2.selectByVisibleText("Correlation ID");
		//driver.findElement(By.xpath("(//a[@class='select2-choice'])[2]")).click();
		//driver.findElement(By.xpath("(//input[@type='text'])[15]")).sendKeys("Contact type");
		//driver.findElement(By.xpath("(//textarea[contains(@class,'filerTableInput')])[2]")).sendKeys("Correlation ID");
		
		
		//WebElement selects3 = driver.findElement(By.xpath("(//select[@title='Choose option'])[3]"));
		//Select sel3=new Select(selects3);
		//sel3.selectByVisibleText("Escalation");
		//WebElement selects4 = driver.findElement(By.xpath("(//select[contains(@class,'filerTableSelect')])[8]"));
		//Select sel4=new Select(selects4);
		//sel4.selectByIndex(1);
		//driver.findElement(By.xpath("(//a[@class='select2-choice'])[3]")).click();
		//driver.findElement(By.xpath("(//input[@type='text'])[15]")).sendKeys("Delivery task");
		//driver.findElement(By.xpath("(//textarea[contains(@class,'filerTableInput')])[3]")).sendKeys("Escalation");
		
		//Thread.sleep(2000);
		//WebElement selects5 = driver.findElement(By.xpath("(//select[@title='Choose option'])[4]"));
		//Select sel5=new Select(selects5);
		//sel5.selectByVisibleText("Assignment group");
		//driver.findElement(By.xpath("(//a[@class='select2-choice'])[4]")).click();
		//driver.findElement(By.xpath("(//input[@type='text'])[15]")).sendKeys("Activity due");
		//driver.findElement(By.xpath("(//textarea[contains(@class,'filerTableInput')])[4]")).sendKeys("Assignment group");
		
		//WebElement selects6 = driver.findElement(By.xpath("(//select[@title='Choose option'])[5]"));
		//Select sel6=new Select(selects6);
		//sel6.selectByVisibleText("Sys ID");
		//driver.findElement(By.xpath("(//a[@class='select2-choice'])[5]")).click();
		//driver.findElement(By.xpath("(//input[@type='text'])[15]")).sendKeys("scope");
		//driver.findElement(By.xpath("(//textarea[contains(@class,'filerTableInput')])[5]")).sendKeys("Sys ID");
		
		//String text = driver.findElement(By.xpath("//table[@id='std_change_proposal_table']//tr[5]//td[5]")).getText();
		//if(text.contains("all toners")) {
		//	System.out.println("New Proposal Created Successfully");
		//}
		
		//String text = driver.findElement(By.xpath("(//a[@class='linked formlink'])[7]")).getText();
		//System.out.println("Number:  " +text);
		
		//String text2 = driver.findElement(By.xpath("(//td[@class='vt'])[38]")).getText();
		//System.out.println("Templete Description:  " + text2);
		
	}
}

/*
Asssignment 2:Create new Proposal
"1. Launch ServiceNow application
2. Login with valid credential 
3. Click All and Enter Proposal in filter navigator and press enter 
4. Click- new  and  fill mandatory fields and click 'Submit' Button.
5. Verify the successful creation of new Proposal"
*/