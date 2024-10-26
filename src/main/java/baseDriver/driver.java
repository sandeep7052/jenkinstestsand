package baseDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driver extends objectRepo {
	public static WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeTest
	public static void launchDriver() {
		String url = "https://sampleapp.tricentis.com/101/";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to(url);
	}
	@AfterTest
	public static void exitBrowser() {
	driver.close();
	}
}
