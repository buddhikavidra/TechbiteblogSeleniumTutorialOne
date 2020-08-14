package Test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class SampleProject {
	
	String ChromeDriverLocation = System.getProperty("user.dir")+"\\Driver"+"\\chromedriver.exe";
	String URL = "https://opensource-demo.orangehrmlive.com/";
	public static WebDriver ChromeDriver;
	
	

	///@BeforeTest
	public void OpenChromeDriver() {
		
		
		System.setProperty("webdriver.chrome.driver",ChromeDriverLocation);
		ChromeDriver  = new ChromeDriver();
	}
	
	//@BeforeTest
	  public WebDriver getdriver(){
		    if (ChromeDriver == null){
		    	ChromeDriver = new ChromeDriver();
		      return ChromeDriver;
		    }else{
		      return ChromeDriver;
		    }
		  }
	/*@Test
	  public void ccc(WebDriver ChromeDriver) {
	//WebDriver ChromeDriver = new ChromeDriver();
		ChromeDriver.get(URL);
		//maximize window
		ChromeDriver.manage().window().maximize();
		//wait 60 seconds
		ChromeDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	
		
		
		// 
		WebElement element = ChromeDriver.findElement(By.xpath("//input[@name='txtUsername']"));
		
		element.clear();
		
		element.sendKeys("Admin");
		//.sendKeys("Admin")
		ChromeDriver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		//
		ChromeDriver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		System.out.println("afasgfaufvu");
		
	

		// 
		String title = ChromeDriver.getTitle();
		System.out.println(title);
		//
		WebElement element2 = ChromeDriver.findElement(By.xpath("//b"));
		//element.
		//
		ChromeDriver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		
	}*/
	
}
