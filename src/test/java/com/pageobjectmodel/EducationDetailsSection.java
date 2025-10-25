package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.EducationDetails;
import com.pageobjectmanager.PageObjectManager;

public class EducationDetailsSection extends Base_Class implements EducationDetails {
	
	@FindBy(xpath = addEducation_xpath)
	private WebElement addEducationButton;
	
	@FindBy(xpath = educationHeading_xpath)
	private WebElement educationHeading;

	@FindBy(id = education_id)
	private WebElement education;
	
	@FindBy(xpath = educationDropDownOptions_xpath)
	private WebElement educationDropDownOptions;
	
	@FindBy(id = institute_id)
	private WebElement institute;
	
	@FindBy(xpath = annaUniversity_xpath)
	private WebElement annaUniversity;
	
	@FindBy(id = course_id)
	private WebElement course;
	
	@FindBy(xpath = courseDropDownOptions_xpath)
	private WebElement courseDropDownOptions;
	
	@FindBy(id = specialization_id)
	private WebElement specialization;
	
	@FindBy(xpath = specializationDropDownOptions_xpath)
	private WebElement specializationDropDownOptions;
	
	@FindBy(xpath = courseType_xpath)
	private WebElement courseType;
	
	@FindBy(xpath = courseStartingYear_xpath)
	private WebElement courseStartingYear;
	
	@FindBy(xpath = courseStartingYearOption_xpath)
	private WebElement courseStartingYearOption;
	
	@FindBy(xpath = courseEndingYear_xpath)
	private WebElement courseEndingYear;
	
	@FindBy(xpath = courseEndingYearOption_xpath)
	private WebElement courseEndingYearOption;
	
	@FindBy(id = grading_id)
	private WebElement grading;
	
	@FindBy(xpath = gradingSystem_xpath)
	private WebElement gradingSystem;
		
	@FindBy(id = marks_id)
	private WebElement marks;
	
		
	@FindBy(id = saveButton_id)
	private WebElement saveButton;
	
	public EducationDetailsSection() {
		PageFactory.initElements(driver, this);
	}
	
	public void educationDetail() throws IOException, InterruptedException {
		
              implicityWait();
              elementClickByJavaScript(addEducationButton);
              waitForVisibilityOfElement(educationHeading);
              elementClickByJavaScript(educationDropDownOptions);
              institute.click();
              passInput(institute, PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "University"));
              Thread.sleep(3000);
              mouseOverActions(annaUniversity, "mouseover");
              Thread.sleep(5000);
              elementClickByJavaScript(course);
              elementClickByJavaScript(courseDropDownOptions);
              waitForVisibilityOfElement(specialization);
              elementClickByJavaScript(specialization);
              elementClickByJavaScript(specializationDropDownOptions);
              waitForVisibilityOfElement(courseType);
              elementClickByJavaScript(courseType);
              waitForVisibilityOfElement(courseStartingYear);
              elementClickByJavaScript(courseStartingYear);
              elementClickByJavaScript(courseStartingYearOption);
              elementClickByJavaScript(courseEndingYear);
              elementClickByJavaScript(courseEndingYearOption);
              elementClickByJavaScript(grading);
              elementClickByJavaScript(gradingSystem);
              passInput(marks, PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "Marks"));
              submit(saveButton);
              
              
              
              
              
              
	}
	
	}
