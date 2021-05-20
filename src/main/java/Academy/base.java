package Academy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	WebDriver driver;
	Properties prop;

	public WebDriver initializeDriver() throws IOException

	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\remya\\eclipse-workspace\\Selenium\\src\\main\\java\\Academy\\data.properties");
		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome"))
			;
		{

			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		// else if (browserName.equals("firefox"))
		{

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

}