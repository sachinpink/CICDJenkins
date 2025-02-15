package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingletonDemo 
{
	private static SingletonDemo Singleton_Demo;
	WebDriver driver;
	
	private SingletonDemo() {}
	
	public static SingletonDemo getInstance()
	{
		if(Singleton_Demo==null)
		{
			Singleton_Demo= new SingletonDemo();
			
		}
		return  Singleton_Demo;
	}
	
	public WebDriver getDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;
		
	}

}
