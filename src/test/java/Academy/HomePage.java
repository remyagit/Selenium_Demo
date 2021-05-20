package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.landingpage;

public class HomePage extends base {

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test

	public void validateAppnavbar() throws IOException {

		// one is inheritance
		// creating object to that class and invoke methods of it
		System.out.println(driver.getTitle());
		landingpage l = new landingpage(driver);

		Assert.assertTrue(l.getnavbar().isDisplayed());
		System.out.println("Test completed");

	}

	@AfterTest
	public void teardown() {

		driver.close();

	}

}
