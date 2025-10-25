package com.pageobjectmodel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.KeySkillsInterfaceElements;
import com.pageobjectmanager.PageObjectManager;

public class KeySkillsSection extends Base_Class implements KeySkillsInterfaceElements {
	
	@FindBy(xpath = keySkillsEditIcon_xpath)
	private WebElement keySkillsEditIcon;
	
	@FindBy(id = keySkillsTextArea_id)
	private WebElement keySkillsTextArea;
	
	@FindBy(id = keySkillsSaveButton_id)
	private WebElement keySkillsSaveButton;
	
	@FindBy(xpath = keySkillsValue_xpath)
	private WebElement keySkillsValue;
	
	@FindBy(xpath = keySkillsAddedValue_xpath)
	private List<WebElement> allKeySkillsAddedValue;
	
	
	
	public KeySkillsSection() {
		PageFactory.initElements(driver, this);
	}
	
	public void keySkills() throws IOException {
		implicityWait();
		scrollThePage(keySkillsEditIcon,"scrollup");
		waitForVisibilityOfElement(keySkillsEditIcon);
		elementClickByJavaScript(keySkillsEditIcon);
		waitForVisibilityOfElement(keySkillsTextArea);
		passInput(keySkillsTextArea, PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "Key Skills"));
		submit(keySkillsSaveButton);
		waitForVisibilityOfAllElements(allKeySkillsAddedValue);
		for (WebElement printSingleSkill : allKeySkillsAddedValue) {
		    System.out.println(printSingleSkill.getText());
		}
		
			}
	
	}
