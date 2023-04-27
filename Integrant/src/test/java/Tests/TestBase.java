package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
public static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeSuite
	
	public void Start_Chrome () {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.navigate().to("https://subscribe.stctv.com/sa-ar?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}
	
	@AfterSuite
	
	public void Stop_Driver() throws InterruptedException {
	
		driver.quit();
	}
}
