package com.pageobjectmodel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.ResumeUploadPageInterfaceElements;

public class ResumeUploadPage extends Base_Class implements ResumeUploadPageInterfaceElements{
	
	@FindBy(xpath = resume_xpath)
	private WebElement resume;
	
	@FindBy(xpath = resumeUploadButton_xpath)
	private WebElement resumeUploadButton;
	
	@FindBy(xpath = updateResumeButton_xpath)
	private WebElement resumeUpdateButton;
	
	
	public ResumeUploadPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void uploadResume() throws AWTException {
		
		scrollThePage(resume, "scrollup");
		waitForVisibilityOfElement(resume);
		elementClickByJavaScript(resumeUpdateButton);
		/*
		 * if(resumeUploadButton.isDisplayed()){
		 * elementClickByJavaScript(resumeUploadButton); } else
		 * if(resumeUpdateButton.isDisplayed()){
		 * elementClickByJavaScript(resumeUpdateButton); } else {
		 * System.out.println("ERROR: OCCUR DURING UPLOADING RESUME"); }
		 */
		
		Robot robot = new Robot();
		robot.delay(3000);
		StringSelection ss = new StringSelection("D:\\Divya Resume\\DivyaResume.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		keyPress(KeyEvent.VK_CONTROL);
		keyPress(KeyEvent.VK_V);
		keyPress(KeyEvent.VK_ENTER);
		}
	

}
