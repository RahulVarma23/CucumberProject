package stepDefination;

import java.util.List;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import base.PredefinedActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import Util.PropertyFileOperation;




public class stepLib extends PredefinedActions{
	
	
    @Given("^User open application \"([^\"]*)\"$")
    public void user_open_application(String key) throws Throwable {
    	
    	PropertyFileOperation propertyFileOperation= new PropertyFileOperation(".//src//main//resources//config//Config.properties");
    	String url = propertyFileOperation.getValue(key);
	    initialization(url);
    }
    
    @Then("^User logout from application$")
    public void user_logout_from_application() throws Throwable {
        tearDown();
    }
    
    @And("^User select value from dropdown and get all options$")
    public void user_select_value_from_dropdown_and_get_all_options() throws Throwable {
    	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	        //select year
    			Select oselect = new Select(driver.findElement(By.cssSelector("select[id='year']")));
    			oselect.selectByVisibleText("1993");
    			
    			//select day 
    			WebElement e1 = driver.findElement(By.cssSelector("select[id='day']"));
    			Select oselect1 = new Select(e1);
    			oselect1.selectByIndex(23);
    			
    			//select month
    			Select oselect2 = new Select(driver.findElement(By.cssSelector("select[id='month']")));
    			oselect2.selectByVisibleText("Feb");
    			
    			List<WebElement> year = oselect.getOptions();
    			
    			for(WebElement y :year) {
    				System.out.println("value of year is: "+y.getText());
    			}
    			
    }
    
    			 @Then("^User drag image from one location to another location$")
    			 public void user_drag_image_from_one_location_to_another_location() throws Throwable {
    				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 					driver.switchTo().frame(0);
 					WebElement from = driver.findElement(By.cssSelector("div[id='draggable']"));
 					WebElement to = driver.findElement(By.cssSelector("div[id=droppable]"));
 					Actions action = new Actions(driver);
 					action.clickAndHold(from).moveToElement(to).release().build().perform();
 					System.out.println("Element dropped on target");

 					WebElement drop = driver.findElement(By.cssSelector("div[id=droppable]"));
 					String ExpectedText= drop.getText();

 					String actualText= "Dropped!";
 					
 					Assert.assertEquals(ExpectedText, actualText);
    			 }
    			 
               @Then("^User handles multiple frames$")
               public void user_handle_multiple_frames() throws Throwable {
            	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            	driver.findElement(By.cssSelector("a[id='iframes']")).click();
            	
            	//switch to 1st frame
           		driver.switchTo().frame("site1");   
           		System.out.println("frame1 switch");
           		driver.findElement(By.xpath("//a[text()='Projects']")).click();
                 System.out.println("clicked on projects");
           	    //switch to main window
           		driver.switchTo().defaultContent();    
           		 
           	    //switch to 2nd frame
           		driver.switchTo().frame(2); 
           		driver.findElement(By.xpath("//a[@href='https://www.apache.org/licenses/']")).click();
               }
               
               @Then("^User verify if status code of \"([^\"]*)\" is \"([^\"]*)\"$")
               public void user_verify_if_status_code_of_is(String key, int ResponseCode) throws Throwable {
            	   PropertyFileOperation propertyFileOperation= new PropertyFileOperation(".//src//main//resources//config//Config.properties");
               	String url = propertyFileOperation.getValue(key);
            	   int ActualresponseCode =RestAssured.get(url).statusCode();
            	   System.out.println(ActualresponseCode);
            	   Assert.assertEquals(ResponseCode, ActualresponseCode);
               }
               
               @And("^User delete all cookies$")
               public void user_delete_all_cookies() throws Throwable {
                   driver.manage().deleteAllCookies();
               }
               
               @Then("^User verify value \"([^\"]*)\" in page source$")
               public void user_verify_value_in_page_source(String text) throws Throwable {
            	  boolean flag= driver.getPageSource().contains(text);
            	  System.out.println(flag);
            	  Assert.assertTrue(flag);
               }

              
   
}
	
    


	

