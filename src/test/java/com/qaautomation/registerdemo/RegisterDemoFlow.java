package com.qaautomation.registerdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class RegisterDemoFlow {

	public WebDriver driver;
    private String baseUrl;

	// Parameterize all the Input Values
	String formTitleValue = "Register For Demo";
	String firstNameValue = "Vinoth";
	String lastNameValue = "R";
	String genderValue = "Male";  // Male or Female or Other	
	String streetAddressValue = "Saravana Flats";
	String aptBuildingValue = "S1";
	String cityValue = "Chennai";
	String stateValue = "Tamil Nadu";
	String postalCodeValue = "600100";
	String countryValue = "India";		
	String emailIdValue = "vinothrwins@gmail.com";
	String dateOfDemoValue = "01/27/2024";
	String timeInHourValue = "09";
	String timeInMinuteValue = "30";
	String mobileNumberValue = "6383544892";
	String enterYourQueryValue = "What is the duration for selenium training?";
	String successfulMessageTextValue = "Registration Form is Successfully Submitted.";

	// Parameterized all The WebElement Path - Not mandatory
	String firstNameLocator = "vfb-5";
	String lastNameLocator = "vfb-7";
	String maleGenderLocator = "vfb-31-1";
	String femaleGenderLocator = "vfb-31-2";
	String otherGenderLocator = "vfb-31-3";
	String addressNameLocator = "vfb-13[address]";
	String streetAddressNameLocator = "vfb-13-address-2";
	String cityLocator = "vfb-13[city]";
	String stateLocator = "vfb-13[state]";
	String postalCodeLocator = "vfb-13[zip]";
	String countryLocator = "vfb-13[country]";
	String emailIdLocator = "vfb-14";
	String dateOfDemoLocator = "vfb-18";
	String hourLocator = "vfb-16[hour]";
	String minuteLocator = "vfb-16[min]";
	String mobileNumberLocator = "vfb-19";
	String uftLocator = "//input[@id='vfb-20-1']";
	String seleniumWebDriverLocator = "//input[@id='vfb-20-0']";
	String enterYourQueryLocator = "//textarea[@id='vfb-23']";
	String enterTwoDigitsLocator = "vfb-3";
	String submitBtnLocator = "vfb-submit";
	String successfulMsgTextLocator = "elementor-widget-container";

	@Test(priority = 1)
	public void launchApplication() {	
		
	    // Get the base URL from the system properties
        baseUrl = System.getProperty("baseUrl", "https://vinothqaacademy.com/demo-site/");
        
		// Create the instance of Edge driver in Webdriver interface
		driver = new ChromeDriver();

		// implicity wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		// Launch the application
		driver.get(baseUrl);
		System.out.println("Url used for testing is "+ baseUrl);
		
		// Maximize the window
		driver.manage().window().maximize();
		System.out.println("Application is launched successfully");
		

	}
	
	@Test(priority = 2)
	public void registerDemo() {

		// Fill the Registration form by entering the all fields

		// Form Title 
		WebElement regTitle = driver.findElement(By.xpath("//*[@id=\"item-vfb-1\"]/div/h3")); 

		if(regTitle.isDisplayed()) {			
			System.out.println("Title is displayed");			
		}
		else
		{
			System.out.println("Title is not displayed");			
		}

		// Validating the form title 
		String actRegTitle = regTitle.getText();
		String expRegTitle = formTitleValue;
		if(actRegTitle.equals(expRegTitle)) {
			System.out.println("Actual and Expected Registration Form Titles are same");
			System.out.println("The Registration Form Title is "+ actRegTitle );
		}
		else
		{
			System.out.println("Actual and Expected Registration Form Titles are not same");
			System.out.println("The Actual Registration Form Title is "+ actRegTitle );
			System.out.println("The Actual Registration Form Title is "+ expRegTitle );
		}

		// First name
		WebElement firstName = driver.findElement(By.name(firstNameLocator));

		// Verify the First Name is displayed or not
		if (firstName.isDisplayed()) {
			System.out.println("First Name is Displayed");			
		} else {
			System.out.println("First Name is not Displayed");
		}

		// Verify the First Name is Enabled or not
		if (firstName.isEnabled()) {
			System.out.println("First Name is Enabled");
			// Enter First Name
			firstName.sendKeys(firstNameValue);
			System.out.println("First Name Value is " + firstNameValue);
		} else {
			System.out.println("First Name is not Enabled");
		}

		// Last Name
		WebElement lastName = driver.findElement(By.name(lastNameLocator));
		// Verify the First Name is displayed or not
		if (lastName.isDisplayed()) {
			System.out.println("Last Name is Displayed");
		} else {
			System.out.println("Last Name is not Displayed");
		}

		// Verify the First Name is Enabled or not
		if (lastName.isEnabled()) {
			System.out.println("Last Name is Enabled");
			// Enter Last Name
			lastName.sendKeys(lastNameValue);
			System.out.println("Last Name Value is " + lastNameValue);
		} else {
			System.out.println("Last Name is not Enabled");
		}

		// Gender
		// Male Radio Button
		WebElement maleradioBtn = driver.findElement(By.id(maleGenderLocator));
		WebElement femaleradioBtn = driver.findElement(By.id(femaleGenderLocator));
		WebElement otherradioBtn = driver.findElement(By.id(otherGenderLocator));

		if(genderValue.equals("Male")) {
			if(maleradioBtn.isDisplayed()) {
				System.out.println("Male Radio Button is Displayed");
				maleradioBtn.click();
				System.out.println("Male Radio Button is selected");
			}
			else {
				System.out.println("Male Radio Button is not Displayed");
			}
		}
		else if(genderValue.equals("Female")) {
			if(femaleradioBtn.isDisplayed()) {
				System.out.println("Female Radio Button is Displayed");
				femaleradioBtn.click();
				System.out.println("Female Radio Button is selected");
			}
			else {
				System.out.println("Female Radio Button is not Displayed");
			}
		}
		else
		{
			System.out.println("Other Radio Button is Displayed");
			otherradioBtn.click();
			System.out.println("Other Radio Button is selected");
		}


		// Address
		// Street Address
		WebElement streetAddr = driver.findElement(By.name(addressNameLocator));
		// Verify the Street Address is displayed or not
		if (streetAddr.isDisplayed()) {
			System.out.println("Street Address is Displayed");
		} else {
			System.out.println("Street Address is not Displayed");
		}

		// Verify the Street Address is enabled or not
		if (streetAddr.isEnabled()) {
			System.out.println("Street Address is Enabled");
			// Enter Street Address
			streetAddr.sendKeys(streetAddressValue);
			System.out.println("Street Address Value is " + streetAddressValue);
		} else {
			System.out.println("Street Address is not Enabled");
		}

		// Apartment Number
		WebElement apartmentNo = driver.findElement(By.id(streetAddressNameLocator));
		// Verify the Apartment Number is displayed or not
		if (apartmentNo.isDisplayed()) {
			System.out.println("Apartment Number is Displayed");
		} else {
			System.out.println("Apartment Number is not Displayed");
		}

		// Verify the Apartment Number is enabled or not
		if (apartmentNo.isEnabled()) {
			System.out.println("Apartment Number is Enabled");
			// Enter Apartment Number
			apartmentNo.sendKeys(aptBuildingValue);
			System.out.println("Apartment Number Value is " + aptBuildingValue);
		} else {
			System.out.println("Apartment Number is not Enabled");
		}

		// City
		WebElement cityName = driver.findElement(By.name(cityLocator));
		// Verify the City Name is displayed or not
		if (cityName.isDisplayed()) {
			System.out.println("City Name is Displayed");

		} else {
			System.out.println("City Name is not Displayed");
		}

		// Verify the City Name is enabled or not
		if (cityName.isEnabled()) {
			System.out.println("City Name is Enabled");
			// Enter City Name
			cityName.sendKeys(cityValue);
			System.out.println("City Value is " + cityValue);
		} else {
			System.out.println("City is not enabled");
		}

		// State
		WebElement stateName = driver.findElement(By.name(stateLocator));
		// Verify the State is displayed or not
		if (stateName.isDisplayed()) {
			System.out.println("State is Displayed");
		} else {
			System.out.println("State is not Displayed");
		}

		// Verify the State is enabled or not
		if (stateName.isEnabled()) {
			System.out.println("State is Enabled");
			// Enter State Name
			stateName.sendKeys(stateValue);
			System.out.println("State Value is " + stateValue);
		} else {
			System.out.println("State is not Enabled");
		}

		// Postal code
		WebElement postalCode = driver.findElement(By.name(postalCodeLocator));
		// Verify the Postal Code is displayed or not
		if (postalCode.isDisplayed()) {
			System.out.println("Postal Code is Displayed");
		} else {
			System.out.println("Postal Code is not Displayed");
		}

		// Verify the Postal Code is enabled or not
		if (postalCode.isEnabled()) {
			System.out.println("Postal Code is Enabled");
			// Enter Postal Code
			postalCode.sendKeys(postalCodeValue);
			System.out.println("Postal Code Value is " + postalCodeValue);
		} else {
			System.out.println("Postal Code is not Enabled");
		}

		// Country Drop Down
		WebElement countryDropDown = driver.findElement(By.name(countryLocator));
		// Verify Country Drop Down is displayed or not
		if (countryDropDown.isDisplayed()) {
			System.out.println("Country Drop Down is Displayed");
		} else {
			System.out.println("Country Drop Down is not Displayed");
		}

		// Verify Country Drop Down is enabled or not
		if (countryDropDown.isEnabled()) {
			System.out.println("Country Drop Down is Enabled");

			// Select the Item from country DropDown
			WebElement countryDD = driver.findElement(By.name(countryLocator));
			// Create the object of the select
			Select countryDropDownValue = new Select(countryDD);
			countryDropDownValue.selectByVisibleText(countryValue);
			System.out.println("Country Drop Down Value is "+ countryValue);

		} else {
			System.out.println("Country Drop Down is not Enabled");
		}


		// Email
		WebElement email = driver.findElement(By.name(emailIdLocator));
		// Verify the Email is Displayed or not
		if (email.isDisplayed()) {
			System.out.println("Email is Displayed");
		} else {
			System.out.println("Email is not Displayed");
		}

		// Verify the Email is enabled or not
		if (email.isEnabled()) {
			System.out.println("Email is Enabled");
			// Enter Email Id
			email.sendKeys(emailIdValue);
			System.out.println("Email Id value is " + emailIdValue);
		} else {
			System.out.println("Email is not Enabled");
		}

		// Date of Demo
		WebElement demoDate = driver.findElement(By.name(dateOfDemoLocator));
		// Verify the Demo Date is Displayed or not
		if (demoDate.isDisplayed()) {
			System.out.println("Date of Demo is Displayed");
		} else {
			System.out.println("Date of Demo is not Displayed");
		}

		// Verify the Date of Demo is enabled or not
		if (demoDate.isEnabled()) {
			System.out.println("Date of Demo is Enabled");
			// Enter Date of Demo Value
			demoDate.sendKeys(dateOfDemoValue);
			System.out.println("Date of Demo Value is " + dateOfDemoValue);
			demoDate.sendKeys(Keys.ENTER);
		} else {
			System.out.println("Date of Demo is not Enabled");
		}

		// Convenient Time
		// Hour Drop Down
		WebElement convenientTimeHour = driver.findElement(By.name(hourLocator));
		// Verify Convenient Time Hour Drop Down is Displayed or not
		if (convenientTimeHour.isDisplayed()) {
			System.out.println("Hour DropDown is Displayed");
		} else {
			System.out.println("Hour DropDown is not Displayed");
		}

		// Verify Convenient Time Hour Drop Down is Enabled or not
		if (convenientTimeHour.isEnabled()) {
			System.out.println("Hour DropDown is Enabled");

			Select hourDropDown = new Select(convenientTimeHour);
			// Select Using Visible Text
			hourDropDown.selectByVisibleText(timeInHourValue);
			System.out.println("Hour dropdown value is " + timeInHourValue);
		} else {
			System.out.println("Hour DropDown is not Enabled");
		}

		// Minute Drop Down
		WebElement convenientTimeMinute = driver.findElement(By.name(minuteLocator));
		// Verify MM Drop Down is Displayed or not
		if (convenientTimeMinute.isDisplayed()) {
			System.out.println("Minute DropDown is Displayed");
		} else {
			System.out.println("Minute DropDown is not Displayed");
		}

		// Verify Minute Drop Down is Enabled or not
		if (convenientTimeMinute.isEnabled()) {
			System.out.println("Minute DropDown is Enabled");

			// To Select the Item from Minute DropDown, Create the Select Object
			Select minuteDropDown = new Select(convenientTimeMinute);
			// Select Using Visible Text
			minuteDropDown.selectByVisibleText(timeInMinuteValue);
			System.out.println("Minute Drop Down Value is " + timeInMinuteValue);

		} else {
			System.out.println("Minute DropDown is not Enabled");
		}

		// Mobile Number
		WebElement mobileNum = driver.findElement(By.name(mobileNumberLocator));
		// Verify the Mobile Number is Displayed or not
		if (mobileNum.isDisplayed()) {
			System.out.println("Mobile Number is Displayed");
		} else {
			System.out.println("Mobile Number is not Displayed");
		}

		// Verify the Mobile Number is enabled or not
		if (mobileNum.isEnabled()) {
			System.out.println("Mobile Number is Enabled");
			// Enter Mobile Number
			mobileNum.sendKeys(mobileNumberValue);
			System.out.println("Mobile Number Value is " + mobileNumberValue);
		} else {
			System.out.println("Mobile Number is not Enabled");
		}

		// Course Interested
		// UFT Testing Check Box
		WebElement uftChk = driver.findElement(By.xpath(uftLocator));
		// Verify The Functional Testing Check Box is displayed or Not
		if (uftChk.isDisplayed()) {
			System.out.println("UFT Check Box is Displayed");
		} else {
			System.out.println("UFT Check Box is not Displayed");
		}

		// Verify UFT Check Box is Enabled or Not
		if (uftChk.isEnabled()) {
			System.out.println("UFT Check Box is Enabled");
		} else {
			System.out.println("UFT Check Box is NOT Enabled");
		}

		// Verify Functional Testing Check Box Selected or Not-Initial State(not
		// Selected)
		if (uftChk.isSelected()) {
			System.out.println("UFT Check Box is selected");
		} else {
			System.out.println("UFT Check Box is not selected");
			// Click on UFT check Box
			uftChk.click();
			System.out.println("UFT Check Box is selected");
		}

		// Selenium WebDriver Check Box
		WebElement seleniumWebDriverCheck = driver.findElement(By.xpath(seleniumWebDriverLocator));
		// Verify Selenium WebDriver Check Box is displayed or Not
		if (seleniumWebDriverCheck.isDisplayed()) {
			System.out.println("Selenium WebDriver Check Box is Displayed");
		} else {
			System.out.println("Selenium WebDriver Check Box is not Displayed");
		}

		// Verify Selenium WebDriver Check Box is Enabled or Not
		if (seleniumWebDriverCheck.isEnabled()) {
			System.out.println("Selenium WebDriver Check Box is Enabled");
		} else {
			System.out.println("Selenium WebDriver Check Box is not Enabled");
		}

		// Verify Selenium WebDriver Check Box Selected or Not
		if (seleniumWebDriverCheck.isSelected()) {
			System.out.println("Selenium WebDriver Check Box is Selected");
		} else {
			System.out.println("Selenium WebDriver Check Box is not selected");
			// Click on Selenium WebDriver check Box
			seleniumWebDriverCheck.click();
			System.out.println("Selenium WebDriver Check Box is Selected");
		}

		// Enter Your Query
		WebElement enterYourQuery = driver.findElement(By.xpath(enterYourQueryLocator));
		// Verify the Enter Your Query is Displayed or not
		if (enterYourQuery.isDisplayed()) {
			System.out.println("Enter Your Query is Displayed");
		} else {
			System.out.println("Enter Your Query is not Displayed");
		}

		// Verify the Enter Your Query is enabled or not
		if (enterYourQuery.isEnabled()) {
			System.out.println("Enter Your Query is Enabled");
			// Enter Your Query Value
			enterYourQuery.sendKeys(enterYourQueryValue);
			System.out.println("Enter Your Query is " + enterYourQueryValue);
		} else {
			System.out.println("Enter Your Query is not Enabled");
		}

		// Enter Any Two Digits
		WebElement enterTwoDigits = driver.findElement(By.id(enterTwoDigitsLocator));
		// Verify the Enter Any Two Digits is Displayed or not
		if (enterTwoDigits.isDisplayed()) {
			System.out.println("Enter Any Two Digits is Displayed");
		} else {
			System.out.println("Enter Any Two Digits is not Displayed");
		}

		// Verify whether Enter Any Two Digits is enabled or not
		if (enterTwoDigits.isEnabled()) {
			System.out.println("Enter Any Two Digits is Enabled");
			// Retrieve the Verification Number
			String verificationText = driver.findElement(By.xpath("//*[@id=\"item-vfb-2\"]/ul/li[1]/span/label"))
					.getText();
			String number[] = verificationText.split(":");
			enterTwoDigits.sendKeys(number[1].trim());
			// Remove spaces before and after digits and display 2 digits
			System.out.println("Enter Any Two Digits is " + number[1].trim());
		} else {
			System.out.println("Enter Any Two Digits is not Enabled");
		}

		// Submit button
		WebElement submitButton = driver.findElement(By.name(submitBtnLocator));

		if(submitButton.isDisplayed()) {
			System.out.println("Submit button is Displayed");
			// Click on Submit Button
			submitButton.click();
			System.out.println("Submit Button is Clicked");
		}
		else
		{
			System.out.println("Submit button is not displayed");
		}

	}

	@Test(priority = 3)
	public void validateSuccessfulMessage() {

		// Submit the Form
		WebElement successfulMsgText = driver.findElement(By.className(successfulMsgTextLocator));
		// Verify Successful message Text displayed or not
		if (successfulMsgText.isDisplayed()) {
			System.out.println("Successful Message Text is Displayed");
		} else {
			System.out.println("Successful Message Text is not Displayed");
		}

		// Validating Successful registration message text
		String actualSuccessfulMsgText = successfulMsgText.getText();
		String expectedSuccessfulMsgText = successfulMessageTextValue;

		if (actualSuccessfulMsgText.contains(expectedSuccessfulMsgText)) {
			System.out.println("Actual and expected Successful Msg Text are the same");
			System.out.println("The Successful Message Text is : " + actualSuccessfulMsgText);

			// Transaction Number 
			String transNum[] = actualSuccessfulMsgText.split(":");
			String transactionNumber = transNum[1].trim();
			System.out.println("Transaction ID : "+ transactionNumber);

		} else {
			System.out.println("Actual and expected Successful Msg Text are not same");
			System.out.println("Actual Text is : " + actualSuccessfulMsgText);
			System.out.println("Expected Text is : " + expectedSuccessfulMsgText);
		} 

	}

	@Test(priority = 4,alwaysRun = true)
	public void closeApplication() {
		driver.quit();
		System.out.println("Application is closed");
	}



}
