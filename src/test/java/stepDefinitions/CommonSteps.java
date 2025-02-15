package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import base.BaseClass;
import io.cucumber.java.en.Given;

public class CommonSteps {
    private final WebDriver driver = BaseClass.getDriver();
    private final Logger logger = BaseClass.getLogger();

    @Given("I navigate to the application URL")
    public void navigateToApplicationURL() {
        String applicationUrl = BaseClass.getProperties().getProperty("appURL");
        driver.get(applicationUrl);
        logger.info("Navigated to application URL: {}", applicationUrl);
    }
    
    @Given("I print it")
    public void i_print_it(io.cucumber.datatable.DataTable dataTable) 
    {
       List<Map<String,String>>myList=dataTable.asMaps(String.class,String.class);
       for(Map<String,String> map:myList)
       {
    	   System.out.println( map.get("Name"));
    	      System.out.println(  map.get("Address"));
       }
    
       
       
      
    }
}
