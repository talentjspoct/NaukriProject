package com.interfaceelements;

public interface EducationDetails {
	
	String addEducation_xpath = "//span[text()='Add education']";
	
	String educationHeading_xpath = "//span[text()='Education' and @class='widgetTitle']";
	
	String education_id = "highEduFor";
	
	String educationDropDownOptions_xpath = "//div[@id='ul_highEdu']/ul/li/a[text()=' Graduation/Diploma ']";
	
	String institute_id = "institute";
	
	String annaUniversity_xpath = "(//div[@id='sugDrp_institute']/ul/li/div[text()='Anna University'])[1]";
	
	String course_id = "crsFor";
	
	String courseDropDownOptions_xpath = "//div[@id='ul_crs']/ul/li/a[text()=' B.Com ']";
	
	String specialization_id = "specializationFor";
	
	String specializationDropDownOptions_xpath = "//div[@id='ul_specialization']/ul/li/a[text()=' IT ']";
	
	String courseType_xpath = "//label[@for='part_time']";
	
	String courseStartingYear_xpath = "//input[@placeholder='Starting year']";
	
	String courseStartingYearOption_xpath = "//div[@id='ul_yosField']/ul/li/a[text()=' 2019 ']";
	
	String courseEndingYear_xpath = "//input[@placeholder='Ending year']";
	
	String courseEndingYearOption_xpath = "//div[@id='ul_yopField']/ul/li/a[text()=' 2023 ']";
	
	String grading_id = "gradeFieldFor";
	
	String gradingSystem_xpath= "//div[@id='ul_gradeField']/ul/li/a[text()=' Scale 4 Grading System ']";
	
	String marks_id = "gradeMarks";
	
	String saveButton_id = "saveEducation";
}
