package servicenowapplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.sukgu.Shadow;

public class ServiceNowApplication {

	public ChromeDriver driver;
	public Shadow shadow;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preCondition(String url, String username, String password) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments(" --disable-notification");
		driver=new ChromeDriver(option);
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		shadow=new Shadow(driver);
		shadow.setImplicitWait(20);
		shadow.findElementByXPath("//div[text()='All']").click();
		
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
}
