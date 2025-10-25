package com.runner;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.Base_Class;
import com.listener.ExtentReport_Test;
import com.pageobjectmanager.PageObjectManager;
import com.listener.ITestListenerClass;

@Listeners(ITestListenerClass.class)
public class NaukriRunner extends Base_Class {

	@BeforeClass()
	public void launchBrowser() {
		launchBrowser(PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("browser"));
		launchTheWebsite(PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("url"));
	}

	@Test()
	private void validLogin() throws InterruptedException {
		ExtentReport_Test.extentTest = extentReports.createTest("Naukri Application Testing" + ":"
				+ Thread.currentThread().getStackTrace()[1].getMethodName().toString()).info("Valid Login");
		Assert.assertTrue(
				PageObjectManager.getPageObjectManager().getLoginPage().validLogin(ExtentReport_Test.extentTest));

	}

	@Test(priority = 1)
	public void profileUpdatePage() {
		PageObjectManager.getPageObjectManager().getProfileUpdatePage().updatePage();

	}

	@Test(priority = 2)
	public void updateResume() throws AWTException {
		PageObjectManager.getPageObjectManager().getResumeUploadPage().uploadResume();

	}

	@Test(priority = 3)
	public void resumeHeadlineEdit() throws IOException {
		PageObjectManager.getPageObjectManager().getResumeHeadlinePage().resumeHeadline();
	}

	@Test(priority = 4)
	public void keySkills() throws IOException {
		PageObjectManager.getPageObjectManager().getKeySkillsSection().keySkills();
	}

	@Test(priority = 5)
	public void employeementSection() throws IOException {
		PageObjectManager.getPageObjectManager().getEmployeementScetion().addEmployeement();
	}
	
	@Test(priority = 6)
	public void educationDetailsSection() throws IOException, InterruptedException {
		PageObjectManager.getPageObjectManager().getEducationDetailsSection().educationDetail();
		}
	
	@Test(priority = 7)
	public void itSkillsSection() throws IOException, InterruptedException {
		PageObjectManager.getPageObjectManager().getItSkillsSection().itSkills();
		}
	@Test(priority = 8)
	public void profileSummarySection() throws IOException, InterruptedException {
		PageObjectManager.getPageObjectManager().getProfileSummarySection().profileSummary();
		}

	@AfterClass()
	private void quit() {
		closeTheBrowser();
	}

	@BeforeSuite
	public void extentTestReportStartup() {

		extentReportStart(
				PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("extentStart"));

	}

	@AfterSuite
	public void extentTestReportEndup() {
		extentReportStart(PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("extentEnd"));
	}

}
