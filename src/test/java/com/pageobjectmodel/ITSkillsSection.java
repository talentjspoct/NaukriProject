package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.ITSkillsInterfaceElements;
import com.pageobjectmanager.PageObjectManager;

public class ITSkillsSection extends Base_Class implements ITSkillsInterfaceElements {
	
	@FindBy(xpath = itSkillAddButton_xpath)
	private WebElement itSkillAddButton;
	
	@FindBy(xpath = itSkillsHeading_xpath)
	private WebElement itSkillsHeading;
	
	@FindBy(id = skillName_id)
	private WebElement skillName;
	
	@FindBy(id = softwareVersion_id)
	private WebElement softwareVersion;
	
	@FindBy(xpath = javaSkill_xpath)
	private WebElement javaSkill;
	
	@FindBy(id = lastUser_id)
	private WebElement lastUser;
	
	@FindBy(xpath = lastUserOption_xpath)
	private WebElement lastUserOption;
	
	@FindBy(id = experienceYear_id)
	private WebElement experienceYear;
	
	@FindBy(xpath = experienceYearOption_xpath)
	private WebElement experienceYearOption;
	
	@FindBy(id = experienceMonth_id)
	private WebElement experienceMonth;
	
	@FindBy(xpath = experienceMonthOption_xpath)
	private WebElement experienceMonthOption;
	
	@FindBy(id = itSkillsSaveButton_id )
	private WebElement itSkillsSaveButton;

	
	public ITSkillsSection() {
		PageFactory.initElements(driver, this);
	}
	
	public void itSkills() throws IOException{
		implicityWait();
		elementClickByJavaScript(itSkillAddButton);
		waitForVisibilityOfElement(itSkillsHeading);
		elementClick(skillName);
		passInput(skillName,PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "Software name"));
		mouseOverActions(javaSkill,"mouseOver");
		passInput(softwareVersion,PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "Software Versions"));
		elementClickByJavaScript(lastUser);
		elementClickByJavaScript(lastUserOption);
		elementClickByJavaScript(experienceYear);
		elementClickByJavaScript(experienceYearOption);
		elementClickByJavaScript(experienceMonth);
		elementClickByJavaScript(experienceMonthOption);
		elementClickByJavaScript(itSkillsSaveButton);
		
	}
	
	
	
	
		
	
	
	
}
