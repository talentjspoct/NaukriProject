package com.pageobjectmanager;

import com.pageobjectmodel.EducationDetailsSection;
import com.pageobjectmodel.EmployeementSection;
import com.pageobjectmodel.ITSkillsSection;
import com.pageobjectmodel.KeySkillsSection;
import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.ProfileSummarySection;
import com.pageobjectmodel.ProfileUpdatePage;
import com.pageobjectmodel.ResumeHeadlinePage;
import com.pageobjectmodel.ResumeUploadPage;
import com.utility.ExcelUtility;
import com.utility.FileReaderManager;

public class PageObjectManager {
	private FileReaderManager fileReaderManager;
	private static PageObjectManager pageObjectManager;
	private LoginPage loginPage;
	private ProfileUpdatePage profileUpdatePage;
	private ResumeUploadPage resumeUploadPage;
	private ResumeHeadlinePage resumeHeadlinePage;
	private KeySkillsSection keySkillsSection;
	private ExcelUtility excelUtility;
	private EmployeementSection employeementSection;
	private EducationDetailsSection educationDetailsSection;
	private ITSkillsSection itSkillsSection;
	private ProfileSummarySection profileSummarySection;
	
	public FileReaderManager getFileReaderManager() {
		if(fileReaderManager == null) {
			fileReaderManager = new FileReaderManager();
		}
		return fileReaderManager;
	}
	public static PageObjectManager getPageObjectManager() {
		if(pageObjectManager == null) {
			pageObjectManager = new PageObjectManager();
		}
		return pageObjectManager;
	}
	public LoginPage getLoginPage() {
		if(loginPage==null) {
			loginPage = new LoginPage();
		}
		return loginPage;
	}
	public ProfileUpdatePage getProfileUpdatePage() {
		if(profileUpdatePage == null) {
			profileUpdatePage = new ProfileUpdatePage();
		}
		return profileUpdatePage;
	}
	public ResumeUploadPage getResumeUploadPage() {
		if(resumeUploadPage == null) {
			resumeUploadPage = new ResumeUploadPage();
		}
		return resumeUploadPage;
	}
	public ResumeHeadlinePage getResumeHeadlinePage() {
		if(resumeHeadlinePage==null) {
			resumeHeadlinePage = new ResumeHeadlinePage();
		}
		return resumeHeadlinePage;
	}
	public KeySkillsSection getKeySkillsSection() {
		if(keySkillsSection==null) {
			keySkillsSection = new KeySkillsSection();
		}
		return keySkillsSection;
	}
	public ExcelUtility getExcelUtility() {
		if(excelUtility ==null) {
			excelUtility = new ExcelUtility();
		}
		return excelUtility;
	}
	public EmployeementSection getEmployeementScetion() {
		if(employeementSection==null) {
			employeementSection = new EmployeementSection();
		}
		return employeementSection;
	}
	
	public EducationDetailsSection getEducationDetailsSection() {
		if(educationDetailsSection==null) {
			educationDetailsSection = new EducationDetailsSection();
		}
		return educationDetailsSection;
	}
	public ITSkillsSection getItSkillsSection() {
		if(itSkillsSection == null) {
			itSkillsSection = new ITSkillsSection();
		}
		return itSkillsSection;
	}
	public ProfileSummarySection getProfileSummarySection() {
		if(profileSummarySection == null) {
			profileSummarySection = new ProfileSummarySection();
		}
		return profileSummarySection;
	}
	

}
