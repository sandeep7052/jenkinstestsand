package navigate_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseDriver.driver;

public class homepage extends driver{
	@FindBy(xpath = "//a[@id='nav_automobile']") public WebElement automobile;
	@FindBy(xpath = "//a[@id='nav_truck']") public WebElement truck;
	@FindBy(xpath = "//a[@id='nav_motorcycle']") public  WebElement motorcycle;
	@FindBy(xpath = "//a[@id='nav_camper']") public WebElement camper;
	
	public homepage() {
		PageFactory.initElements(driver, this);
	}
}
