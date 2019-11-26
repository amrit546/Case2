package CaseStudy2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Case2 {
	 WebDriver driver;
     @Given("Open Site in browser")
     public void site() {
   	  System.setProperty("webdriver.chrome.driver","src/test/resources/driver_/chromedriver.exe");
	     driver	=new ChromeDriver();
	   	 driver.manage().window().maximize();
	   	 driver.get("http://10.232.237.143:443/TestMeApp/");
	   	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   	 
	   	 driver.findElement(By.partialLinkText("SignIn")).click();
	   	 
     }
     @And("Enter the {word} and {word}")
     public void userdetails(String id, String pw) {
    	 driver.findElement(By.id("userName")).sendKeys(id);
    	 driver.findElement(By.id("password")).sendKeys(pw);
     }
     
    @Then("Click on login")
     public void login()
     {
    	 driver.findElement(By.name("Login")).click();
     }
    
    @After
    
    public void windowClose() {
    	driver.close();
    }
     
}
