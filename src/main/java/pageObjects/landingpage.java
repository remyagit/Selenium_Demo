package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpage {

	public WebDriver driver;

	public landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	private By navbar = By.xpath("//div[@class='rd-navbar-wrap']//parent::div[@class='rd-navbar-inner']");

	public WebElement getnavbar() {
		return driver.findElement(navbar);
	}
}