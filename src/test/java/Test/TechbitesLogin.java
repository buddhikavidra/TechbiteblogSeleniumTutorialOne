package Test;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class TechbitesLogin {
 
  	static WebDriver ChromeDriver;
  	static String ChromeDriverLocation = System.getProperty("user.dir")+"\\Driver"+"\\chromedriver.exe";
  
	@BeforeTest
  	public static void OpenBrowser(){
         
  	 System.setProperty("webdriver.chrome.driver", ChromeDriverLocation);
  	ChromeDriver = new ChromeDriver();
  	ChromeDriver.manage().window().maximize();
  	ChromeDriver.get("https://opensource-demo.orangehrmlive.com/");
  	}
  	
  	@Test(priority = 1)
  	public void Login(){
  		
  			// web element for user name
         	WebElement element = ChromeDriver.findElement(By.xpath("//input[@name='txtUsername']"));
    		//clear text field value
    		element.clear();
    		//type "Admin" in web element
    		element.sendKeys("Admin");
    		//web element for password
    		ChromeDriver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
    		//click on button
    		ChromeDriver.findElement(By.xpath("//input[@value='LOGIN']")).click();
    		
    		System.out.println("End of login");
    		
  	}
	
	 
  	@Test(priority = 2)
	public static void tearDown() {
		
		//wait timu unites (60)
		ChromeDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//set locator type
		By mySelector = By.xpath("//div[@id='mainMenu']/ul/li/descendant::b");
		//create list
		List<WebElement> myElements = ChromeDriver.findElements(mySelector);
		// loop through element count
		for (int a = 1; a <= myElements.size(); a++) {
			//iniger convert to String
			String number = Integer.toString(a);
			System.out.println(number.toString());
			//pause time
			ChromeDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			//web element for read value of attribute
			WebElement name = ChromeDriver
					.findElement(By.xpath("(//div[@id='mainMenu']/ul/li/descendant::b)[" + a + "]"));
			//extract text in web element
			String output = name.getText();
			System.out.println(output);
		}
	
	 }
	@AfterTest
	public void Close() {ChromeDriver.quit();}
		}
