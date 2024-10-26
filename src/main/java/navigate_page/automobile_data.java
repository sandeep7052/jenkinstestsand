package navigate_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseDriver.driver;

public class automobile_data extends driver{
	//vehicle data
	@FindBy(xpath = "//select[@id='make']") public WebElement model;
	@FindBy(xpath = "//input[@id='engineperformance']") public WebElement engineperformance;
	@FindBy(xpath = "//input[@id='dateofmanufacture']") public WebElement dateofmanufacture;
	@FindBy(xpath = "//select[@id='fuel']") public WebElement fuel;
	@FindBy(xpath = "//select[@id='numberofseats']") public WebElement numberofseats;
	@FindBy(xpath = "//input[@id='listprice']") public WebElement listprice;
	@FindBy(xpath = "//input[@id='licenseplatenumber']") public WebElement licenseplatenumber;
	@FindBy(xpath = "//input[@id='annualmileage']") public WebElement annualmileage;
	@FindBy(xpath = "//button[@id='nextenterinsurantdata']") public WebElement nextenterinsurantdata;
	//insurant data
	@FindBy(xpath = "//input[@id='firstname']") public WebElement firstname;
	@FindBy(xpath = "//input[@id='lastname']") public WebElement lastname;
	@FindBy(xpath = "//input[@id='birthdate']") public WebElement birthdate;
	@FindBy(xpath = "//input[@id='gendermale']") public WebElement gendermale;
	@FindBy(xpath = "//input[@id='genderfemale']") public WebElement genderfemale;
	@FindBy(xpath = "//input[@id='streetaddress']") public WebElement streetaddress;
	@FindBy(xpath = "//select[@id='country']") public WebElement country;
	@FindBy(xpath = "//input[@id='zipcode']") public WebElement zipcode;
	@FindBy(xpath = "//input[@id='city']") public WebElement city;
	@FindBy(xpath = "//select[@id='occupation']") public WebElement occupation;
	@FindBy(xpath = "//input[@id='speeding']") public WebElement speeding;
	@FindBy(xpath = "//button[@id='preventervehicledata']") public WebElement preventervehicledatas;
	@FindBy(xpath = "//button[@id='nextenterproductdata']") public WebElement nextenterproductdata;
	//product data
	@FindBy(xpath = "//input[@id='startdate']") public WebElement startdate;
	@FindBy(xpath = "//select[@id='insurancesum']") public WebElement insurancesum;
	@FindBy(xpath = "//select[@id='meritrating']") public WebElement meritrating;
	@FindBy(xpath = "//select[@id='damageinsurance']") public WebElement damageinsurance;
	@FindBy(xpath = "//input[@id='EuroProtection']") public WebElement EuroProtection;
	@FindBy(xpath = "//input[@id='LegalDefenseInsurance']") public WebElement LegalDefenseInsurance;
	@FindBy(xpath = "//select[@id='courtesycar']") public WebElement courtesycar;
	@FindBy(xpath = "//button[@id='preventerinsurancedata']") public WebElement preventerinsurancedata;
	@FindBy(xpath = "//button[@id='nextselectpriceoption']") public WebElement nextselectpriceoption;
	//price options
	@FindBy(xpath = "//input[@id='selectsilver']") public WebElement selectsilver;
	@FindBy(xpath = "//input[@id='selectgold']") public WebElement selectgold;
	@FindBy(xpath = "//input[@id='selectplatinum']") public WebElement selectplatinum;
	@FindBy(xpath = "//input[@id='selectultimate']") public WebElement selectultimate;
	@FindBy(xpath = "//button[@id='preventerproductdata']") public WebElement preventerproductdata;
	@FindBy(xpath = "//button[@id='nextsendquote']") public WebElement nextsendquote;
	//quote page elements
	@FindBy(xpath = "//input[@id='email']") public WebElement email;
	@FindBy(xpath = "//input[@id='phone']") public WebElement phone;
	@FindBy(xpath = "//input[@id='username']") public WebElement username;
	@FindBy(xpath = "//input[@id='password']") public WebElement password;
	@FindBy(xpath = "//input[@id='confirmpassword']") public WebElement confirmpassword;
	@FindBy(xpath = "//button[@id='prevselectpriceoption']") public WebElement prevselectpriceoption;
	@FindBy(xpath = "//button[@id='sendemail']") public WebElement sendemail;
	//confirm page
	@FindBy(xpath = "//button[@class='confirm']") public WebElement confirm;
	//constructor
	public automobile_data() {
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	
	
}
