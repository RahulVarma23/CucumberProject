package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Util.PropertyFileOperation;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PredefinedActions {
	protected static WebDriver driver;
	
	public void initialization(String url) {
		//System.setProperty("webdriver.chrome.driver", ConstantPath.CHROMEDRIVERexe);
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().version("78").setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void tearDown() {
		driver.quit();
	}
}
