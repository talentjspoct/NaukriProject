package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.ProfileUpdateInterfaceElemets;
import com.pageobjectmanager.PageObjectManager;

public class ProfileUpdatePage extends Base_Class implements ProfileUpdateInterfaceElemets {
	
	@FindBy(xpath = profileImage_xpath )
	private WebElement profileImage;
	
	@FindBy(xpath = updateButton_xpath )
	private WebElement updateButton;
	
	@FindBy(css = profilePage_css)
	private WebElement profilePage;

	
	public ProfileUpdatePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void updatePage() {
		
	   waitForVisibilityOfElement(profileImage);
	   elementClick(profileImage);
       waitForVisibilityOfElement(updateButton);
       elementClick(updateButton);
       waitForVisibilityOfElement(profilePage);
       String exceptedText = "talentgroup486@gmail.com";
       hardAssert(profilePage, exceptedText);
       System.out.println("USER NAVIGATED INTO THE PROFILE PAGE");
	}
}
