package com.interfaceelements;

public interface ITSkillsInterfaceElements {
	
	String itSkillAddButton_xpath = "//div[@class='widgetHead']/span[text()='Add details']";
	
	String itSkillsHeading_xpath = "//div[@class='editHeader']/child::div/span[text()='IT skills']";
	
	String skillName_id = "itSkillSugg";
	
	String softwareVersion_id = "version";
	
	String javaSkill_xpath = "(//div[@id='sugDrp_itSkillSugg']/ul/li/div[text()='Java'])[1]";
	
	String lastUser_id = "lastUsedDroopeFor";
	
	String lastUserOption_xpath = "//div[@id='ul_lastUsedDroope']/ul/li/a[@data-id='lastUsedDroope_2023']";
	
	String experienceYear_id = "expYearDroopeFor";
	
	String experienceYearOption_xpath = "//div[@id='ul_expYearDroope']/ul/li/a[@data-id='expYearDroope_1']";
	
	String experienceMonth_id = "expMonthDroopeFor";
	
	String experienceMonthOption_xpath="//div[@id='ul_expMonthDroope']/ul/li/a[@data-id='expMonthDroope_1']";
	
	String itSkillsSaveButton_id = "saveITSkills";

}
