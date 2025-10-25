package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.base.Base_Class;
import com.interfaceelements.LoginPageInterfaceElements;
import com.pageobjectmanager.PageObjectManager;

public class LoginPage extends Base_Class implements LoginPageInterfaceElements {
	
	@FindBy(id = usernameField_id )
	private WebElement username;
	
	@FindBy(id = passwordField_id )
	private WebElement password;
	
	@FindBy(xpath = loginButton_xpath)
	private WebElement loginButton;
	
	@FindBy(xpath = profileName_xpath)
	private WebElement profileName;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	} 
	
	public boolean validLogin(ExtentTest extentTest) {
		try {
		implicityWait();
	    passInput(username, PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("emailid"));
		passInput(password, PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("password"));
		submit(loginButton);
		waitForVisibilityOfElement(profileName);
		String exceptedText = PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "Title");
		hardAssert(profileName, exceptedText);
		System.out.println("PROFILE NAME AND USERNAME VALIDATION DONE");
		extentTest.log(Status.PASS,"Login Successful");
		}
		catch(Exception e) {
			extentTest.log(Status.FAIL,"Login Successful");
			return false;
		}
		return true;
		
	}

}
