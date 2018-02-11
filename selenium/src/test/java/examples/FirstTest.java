package examples;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest 
{
	
	WebDriver driver=null;
	
	@BeforeTest
	
	public void initialize()
	{
		
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	
	public void launch() throws InterruptedException
	{
		
		driver.get("http://localhost/login.html");
		
		Thread.sleep(100);
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
	}
	
	
	@AfterTest
	
	public void tearDown()
	{
		
		driver.close();
	}

}
