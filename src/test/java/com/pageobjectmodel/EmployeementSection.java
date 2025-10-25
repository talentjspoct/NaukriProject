package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.EmployeementInterfaceElements;
import com.pageobjectmanager.PageObjectManager;

public class EmployeementSection extends Base_Class implements EmployeementInterfaceElements {
	
	@FindBy(id = addEmployment_id)
	private WebElement  addEmployment;
	
	@FindBy(xpath=currentEmployee_xpath)
	private WebElement currentEmployee;
	
	@FindBy(id = currentEmploymentNo_id)
	private WebElement currentEmployeeNo;
	
	@FindBy(id = intershipOption_id)
	private WebElement intershipOption;
	
	@FindBy(id = previousCompanyName_id)
	private WebElement  previousCompanyName;
	
	@FindBy(id = location_id)
	private WebElement  location;
	
	@FindBy(id = department_id )
	private WebElement  department;
	
	@FindBy(xpath = departmentDropDownOptions_xpath)
	private WebElement  departmentDropDownOptions;
	
	@FindBy(id = workingFromYear_id)
	private WebElement  workingFromYear;
	
	@FindBy(xpath = workingFromYearDropDownOptions_xpath)
	private WebElement  workingFromYearDropDownOptions;
	
	@FindBy(id = workingFromMonth_id)
	private WebElement  workingFromMonth;
	
	@FindBy(xpath = workingFromMonthDropDownOptions_xpath)
	private WebElement  workingFromMonthDropDownOptions;
	
	@FindBy(id = workedTillYear_id)
	private WebElement  workedTillYear;
	
	@FindBy(xpath = workedTillYearDropDownOptions_xpath)
	private WebElement workedTillYearDropDownOptions;
	
	@FindBy(id = workedTillMonth_id)
	private WebElement  workedTillMonth;
	
	@FindBy(xpath = workedTillMonthDropDownOptions_xpath)
	private WebElement  workedTillMonthDropDownOptions;
	
	@FindBy(xpath = monthlyStipend_xpath)
	private WebElement  monthlyStipend;
	
	@FindBy(id = employementSaveButton_id)
	private WebElement employementSaveButton;
	
	public EmployeementSection() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void addEmployeement() throws IOException {
		implicityWait();
		scrollThePage(addEmployment,"scrollup");
		elementClickByJavaScript(addEmployment);
		waitForVisibilityOfElement(currentEmployee);
		elementClickByJavaScript(currentEmployeeNo);
		elementClickByJavaScript(intershipOption);
		passInput(previousCompanyName, PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "Previous company name"));
		passInput(location, PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "Location"));
		elementClickByJavaScript(department);
		elementClickByJavaScript(departmentDropDownOptions);
		elementClickByJavaScript(workingFromYear);
		elementClickByJavaScript(workingFromYearDropDownOptions);
		elementClickByJavaScript(workingFromMonth);
		elementClickByJavaScript(workingFromMonthDropDownOptions);
		elementClickByJavaScript(workedTillYear);
		elementClickByJavaScript(workedTillYearDropDownOptions);
		elementClickByJavaScript(workedTillMonth);
		elementClickByJavaScript(workedTillMonthDropDownOptions);
		passInput(monthlyStipend,PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "Monthly Stipend"));
		elementClickByJavaScript(employementSaveButton);
		
	}
	


}
