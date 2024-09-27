import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parent {
	WebDriver driver;
	
	
	@BeforeMethod
	
	public void getbrowser() throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);

	 driver.get("https://demowebshop.tricentis.com/");
	 Thread.sleep(2000);
	
	
	}
	
	@AfterMethod
	
	public void tearDown()
	{
		driver.quit();;
	}
}
