package practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingletonTest 
{
	WebDriver driver;
	
	@Test
	public void setup()
	{
		SingletonDemo demo = SingletonDemo.getInstance();
		driver= demo.getDriver();
		driver.get("https://mvnrepository.com/");
	}
	
	

}
