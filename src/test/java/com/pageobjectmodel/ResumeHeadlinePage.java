package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.ResumeHeadlinePageInterfaceElements;
import com.pageobjectmanager.PageObjectManager;

public class ResumeHeadlinePage extends Base_Class implements ResumeHeadlinePageInterfaceElements {
	
	@FindBy(xpath=resumeHeadlineEditIcon_xpath)
	private WebElement resumeHeadlineEdit;
	
	@FindBy(id = resumeHeadlineTextArea_id)
	private WebElement resumeHeadlineTextArea;
	
	@FindBy(xpath = saveButton_xpath )
	private WebElement saveButton;
	
	
	public ResumeHeadlinePage() {
		PageFactory.initElements(driver,this);
	}
	
	public void resumeHeadline() throws IOException {
		scrollThePage(resumeHeadlineEdit,"scrollup");
		waitForVisibilityOfElement(resumeHeadlineEdit);
		elementClick(resumeHeadlineEdit);
		waitForVisibilityOfElement(resumeHeadlineTextArea);
		clear(resumeHeadlineTextArea);
		passInput(resumeHeadlineTextArea, PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "Resume headline"));
		submit(saveButton);
		
		
	}

}
