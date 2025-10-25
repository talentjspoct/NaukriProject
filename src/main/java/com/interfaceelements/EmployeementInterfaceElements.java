package com.interfaceelements;

public interface EmployeementInterfaceElements {
	
	String addEmployment_id = "add-employment";
	
	String currentEmployee_xpath = "//span[text()='Is this your current employment?']";
	
	String currentEmploymentNo_id = "no";
	
	String intershipOption_id = "expType_Internship_I";
	
	String previousCompanyName_id = "companySugg";
	
	String location_id = "locationSugg";
	
	String department_id = "fareaDroopeFor";
	
	String departmentDropDownOptions_xpath = "//div[@id='dp_fareaDroope']/div/ul/li/a[text()=' Data Science & Analytics ']";
	
	String workingFromYear_id = "startedYearFor";
	
	String workingFromYearDropDownOptions_xpath = "//div[@id='ul_startedYear']/ul/li/a[@data-id='startedYear_2021']";
	
	String workingFromMonth_id = "startedMonthFor";
	
	String workingFromMonthDropDownOptions_xpath = "//div[@id='ul_startedMonth']/ul/li/a[@data-id='startedMonth_6']";
	
	String workedTillYear_id = "workedTillYearFor";
	
	String workedTillYearDropDownOptions_xpath = "//div[@id='ul_workedTillYear']/ul/li/a[@data-id='workedTillYear_2022']";
	
	String workedTillMonth_id = "workedTillMonthFor";
	
	String workedTillMonthDropDownOptions_xpath = "//div[@id='ul_workedTillMonth']/ul/li/a[@data-id='workedTillMonth_7']";
	
	String monthlyStipend_xpath= "//input[contains(@placeholder,'Eg')]";
	
	String employementSaveButton_id = "submitEmployment";

}
