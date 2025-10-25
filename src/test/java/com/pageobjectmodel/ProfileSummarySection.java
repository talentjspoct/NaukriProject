package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.ProfileSummaryInterfaceElements;
import com.pageobjectmanager.PageObjectManager;

public class ProfileSummarySection extends Base_Class implements ProfileSummaryInterfaceElements{
	@FindBy(xpath = profileSummarySection_xpath)
	private WebElement profileSummarySection;
	
	@FindBy(xpath = profileSummaryEditIcon_xpath)
	private WebElement profileSummaryEditIcon;
	
	@FindBy(xpath = profileAddSummaryButton_xpath)
	private WebElement profileAddSummaryButton;
	
	@FindBy(xpath = profileSummaryHeader_xpath)
	private WebElement profileSummaryHeader;
	
	@FindBy(id = profileSummaryTextArea_id)
	private WebElement profileSummaryTextArea;
	
	@FindBy(xpath = profileSummarySaveButton_xpath)
	private WebElement profileSummarySaveButton;
	
	
	
	public ProfileSummarySection() {
		PageFactory.initElements(driver, this);
	}
	
	public void profileSummary() throws IOException {
		
		implicityWait();
		scrollThePage(profileSummarySection, "scrollup");
		waitForVisibilityOfElement(profileSummarySection);
		try {
		if(profileSummaryEditIcon.isDisplayed()) {
			elementClickByJavaScript(profileSummaryEditIcon);
		}else if(profileAddSummaryButton.isDisplayed()) {
			elementClickByJavaScript(profileAddSummaryButton);
		}else {
			System.out.println("ERROR: OCCUR DURING CLICKING THE PROFILE SUMMARY BUTTON");
		}}
		catch(NoSuchElementException e) {
			System.out.println("Element not found: " + e.getMessage());
		}
		waitForVisibilityOfElement(profileSummaryHeader);
		elementClick(profileSummaryTextArea);
		passInput(profileSummaryTextArea, PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "Profile Summary"));
		elementClickByJavaScript(profileSummarySaveButton);
	}

}
