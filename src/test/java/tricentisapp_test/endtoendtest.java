package tricentisapp_test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseDriver.driver;
import navigate_page.automobile_data;
import navigate_page.homepage;

public class endtoendtest extends driver{
	@Test
	public void endToendFlow() {
		homepage h1 = new homepage();
		h1.automobile.click();
		automobile_data a1 = new automobile_data();
		Select s1 = new Select(a1.model);
		s1.selectByIndex(3);
		a1.engineperformance.sendKeys("200");
		a1.dateofmanufacture.sendKeys("05/05/2015");
		Select s2 = new Select(a1.numberofseats);
		s2.selectByValue("4");
		Select s3 = new Select(a1.fuel);
		s3.selectByValue("Petrol");
		a1.listprice.sendKeys("3000");
		a1.licenseplatenumber.sendKeys("UP72J3010");
		a1.annualmileage.sendKeys("300");
		a1.nextenterinsurantdata.click();
		//insurantdata
		a1.firstname.sendKeys("Sandeep");
		a1.lastname.sendKeys("shukla");
		a1.birthdate.sendKeys("05/05/1999");
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()",a1.gendermale);
		a1.streetaddress.sendKeys("vaisno colony kunda");
		a1.zipcode.sendKeys("230204");
		a1.country.sendKeys("India");
		a1.city.sendKeys("Pratapgarh");
		Select s4 = new Select(a1.occupation);
		s4.selectByIndex(2);
		jse2.executeScript("arguments[0].click()",a1.speeding); 
		a1.nextenterproductdata.click();
		//product data
		a1.startdate.sendKeys("11/12/2024");
		Select s5 = new Select(a1.insurancesum);
		s5.selectByIndex(1);
		Select s6 = new Select(a1.meritrating);
		s6.selectByIndex(2);
		Select s7 = new Select(a1.damageinsurance);
		s7.selectByIndex(2);
		jse2.executeScript("arguments[0].click()",a1.EuroProtection); 
		Select s8 = new Select(a1.courtesycar);
		s8.selectByIndex(1);
		a1.nextselectpriceoption.click();
		//price option data
		jse2.executeScript("arguments[0].click()",a1.selectsilver);
		a1.nextsendquote.click();
		
		//userdata for sending quote
		a1.email.sendKeys("sandyshukla7052@gmail.com");
		a1.phone.sendKeys("6386551748");
		a1.username.sendKeys("Sandeep");
		a1.password.sendKeys("Sandy@123");
		a1.confirmpassword.sendKeys("Sandy@123");
		a1.sendemail.click();
		a1.confirm.click();
		
		
		
		
		

	}
}
