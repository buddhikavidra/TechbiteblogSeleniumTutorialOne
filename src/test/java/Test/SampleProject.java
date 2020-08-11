package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class SampleProject {

	
	String ChromeDriverLocation = System.getProperty("user.dir")+"\\Driver"+"\\chromedriver.exe";
	String URL = "https://techbitezzz.blogspot.com/";
	


	@Test
	public void OpenChromeDriver() {


		System.setProperty("webdriver.chrome.driver", ChromeDriverLocation);
		WebDriver ChromeDriver = new ChromeDriver();

		//open browser
		ChromeDriver.get(URL);
		//maximize window
		ChromeDriver.manage().window().maximize();
		//wait 60 seconds
		ChromeDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		
		//Det page source

		String Source = ChromeDriver.getPageSource();
		//Print
		System.out.println(Source);
		
		//Close Driver

		ChromeDriver.quit();		
		
	}
	
}
