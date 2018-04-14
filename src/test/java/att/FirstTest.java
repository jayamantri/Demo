package att;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTest {
	
	  @Test
	  public void f() {
		  
	   	System.setProperty("webdriver.firefox.marionette","C:\\Users\\Jaya\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		  
		  driver.manage().window().maximize();
		   
		  driver.get("http://www.facebook.com");
		   
		  driver.quit();
	  }
	  
	  @Test
	  public void jse() {
		  
	   	System.setProperty("webdriver.firefox.marionette","C:\\Users\\Jaya\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		  driver.get("http://www.yahoo.com");
		  
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("window.location = 'http://demo.guru99.com/' ");
		  
		  driver.manage().window().maximize();
		   
		   
		  driver.close();
	  }
	 
//	      @Test

//	      public void testSiblingAndParentInXpath(){
	//
//	      	WebDriver driver;
//	      	String driverPath = "C:\\geckodriver.exe";
//	      	System.setProperty("webdriver.firefox.marionette", driverPath);
//	          driver = new FirefoxDriver();        
//	          
//	          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	          driver.get("http://demo.guru99.com/test/guru99home/");
	//
//	          //Search element inside 'Popular course' which are sibling of control 'SELENIUM' ,
//	          //Here first we will find a h2 whose text is ''A few of our most popular courses' ,then we move to its parent element which is a 'div' , inside this div we will find a link whose text is 'SELENIUM' 
//	          //then at last we will find all of the sibling elements of this link('SELENIUM')         
//	          
//	          driver.findElements(By.)
//	          
//	          
	//
//	          List <WebElement> dateBox = driver.findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));
	//
//	          //Print all the which are sibling of the the element named as 'SELENIUM' in 'Popular course'
//	          for (WebElement webElement : dateBox) {
//	              System.out.println(webElement.getText());
//	          }     
	//
//	          driver.close();
//	      }
	  }
	  
	  
	  
	  
	  

