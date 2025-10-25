package com.interfaceelements;

public interface KeySkillsInterfaceElements {
	
	String keySkillsEditIcon_xpath = "//span[text()='Key skills']//following-sibling::span[text()='editOneTheme']";
	
	String keySkillsTextArea_id = "keySkillSugg";
	
	String keySkillsSaveButton_id = "saveKeySkills";
	
	String keySkillsValue_xpath = "//div[@class='chipsContainer']";
	
	String keySkillsAddedValue_xpath = "//div[@class='widgetCont']/preceding::div[@class='keySkills']";
}
