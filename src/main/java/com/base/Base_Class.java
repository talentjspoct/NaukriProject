package com.base;

import java.awt.Desktop;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.junit.Assert;


public class Base_Class {
	public static WebDriver driver;
	public static ExtentReports extentReports;

	public static File file;

	protected static WebDriver launchBrowser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();

			} else if (browserName.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING LAUCHING THE BROWSER");
		}
		driver.manage().window().maximize();
		return driver;

	}

	protected static void closeTheBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING CLOSING THE BROWSER");
		}
	}

	protected static void elementClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING CLICKING THE ELEMENT");
		}
	}
	protected static void submit(WebElement element) {
		try {
			element.submit();
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING CLICKING THE ELEMENT");
		}
	}


	protected static void passInput(WebElement element, String text) {
		try {
			element.sendKeys(text);

		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING SENDING THE TEXT");
		}
	}

	// navigate to() and get() methods are works similarly

	protected static void launchTheWebsite(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING LOADING THE WEBSITE");
		}

	}

	protected static void clear(WebElement element) {
		try {
			element.clear();
		}catch(Exception e) {
			Assert.fail("ERROR: OCCUR DURING CLEARING THE TEXT");
		}
	}
	protected static void alertOption(String action, String inputText) {
		try {
			Alert alert = driver.switchTo().alert();

			switch (action.toLowerCase()) {
			case "accept":
				alert.accept();
				break;

			case "dismiss":
				alert.dismiss();
				break;

			case "gettext":
				System.out.println("Alert Text: " + alert.getText());
				break;

			case "sendkeys":
				if (inputText != null && !inputText.isEmpty()) {
					alert.sendKeys(inputText);
					alert.accept();
				} else {
					System.out.println("No input provided for prompt alert.");
					alert.dismiss();
				}
				break;

			default:
				System.out.println("Invalid alert action: " + action);
			}

		} catch (Exception e) {
			Assert.fail("");
		}
	}

	protected static void selectOption(WebElement element, String type, String value) {
		try {
			Select select = new Select(element);
			if (type.equalsIgnoreCase("text")) {
				select.selectByVisibleText(value);
			} else if (type.equalsIgnoreCase("index")) {
				select.selectByIndex(Integer.parseInt(value));
			} else if (type.equalsIgnoreCase("value")) {
				select.selectByValue(value);
			} else if (type.equalsIgnoreCase("multipleselect")) {
				if (select.isMultiple()) {
					select.selectByIndex(Integer.parseInt(value));
					select.selectByIndex(Integer.parseInt(value));
				}

			}
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING SELECTING THE ELEMENT");
		}
	}

	protected static void deSelectAll(WebElement element, String type, String value) {
		try {
			Select select = new Select(element);
			if (type.equalsIgnoreCase("text")) {
				select.deselectByVisibleText(value);
			} else if (type.equalsIgnoreCase("index")) {
				select.deselectByIndex(Integer.parseInt(value));
			} else if (type.equalsIgnoreCase("value")) {
				select.deselectByValue(value);
			} else if (type.equalsIgnoreCase("multipleselect")) {
				select.deselectAll();
			}
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING DESELECT THE OPTIONS");
		}
	}

	protected static void navigation(String action) {
		try {
			if (action.equalsIgnoreCase("back")) {
				driver.navigate().back();

			} else if (action.equalsIgnoreCase("forward")) {
				driver.navigate().forward();
			} else if (action.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			}
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING NAVIGATION");
		}
	}

	protected static void mouseOverActions(WebElement element, String value) {
		try {
			Actions act = new Actions(driver);
			if (value.equalsIgnoreCase("mouseover")) {
				act.moveToElement(element).perform();
			} else if (value.equalsIgnoreCase("doubleclick")) {
				act.doubleClick(element).perform();
			} else if (value.equalsIgnoreCase("rightclick")) {
				act.contextClick(element).perform();
			}
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING MOUSE OVER ACTIONS ");
		}
	}

	protected static void dragAndDrop(WebElement sourceElement, WebElement targetElement) {
		try {
			Actions act = new Actions(driver);
			act.dragAndDrop(sourceElement, targetElement).perform();
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING DRAG AND DROP THE VALUES");
		}
	}

	protected static void validationOfButtonAndText(WebElement element, String value) {
		try {
			if (value.equalsIgnoreCase("isSelected")) {
				if (element.isSelected()) {
					System.out.println("Element is Selected");
				}
			} else if (value.equalsIgnoreCase("isDisplayed")) {
				if (element.isDisplayed()) {
					System.out.println("Element is displayed");
				}
			} else if (value.equalsIgnoreCase("isEnabled")) {
				if (element.isEnabled()) {
					System.out.println("Element is enabled");
				}
			}
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING VALIDATING THE BUTTONS AND TEXT");
		}
	}

	protected static void getOptions(WebElement element) {
		try {
			Select select = new Select(element);
			List<WebElement> allOptions = new ArrayList<>();
			allOptions = select.getOptions();
			for(WebElement option : allOptions){
				System.out.println("List of options : " + option.getText());

			}
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING GETTING THE LIST OF OPTIONS");
		}
	}

	protected static void getTitleAndCurrentUrl(String value, String text) {
		try {
			if (value.equalsIgnoreCase("gettitle")) {
				text = driver.getTitle();
				System.out.println("Title of the current page : " + text);
			} else if (value.equalsIgnoreCase("getcurrenturl")) {
				text = driver.getCurrentUrl();
				System.out.println("URL of the current page is " + text);
			}
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING GETTING THE TITLE OF PAGE OR GETTING THE CURRENTURL");
		}
	}

	protected static void getText(WebElement element) {
		try {

			String text = element.getText();
			System.out.println("Get the Text : " + text);

		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING GETTING THE TEXT");
		}
	}

	protected static void getAttribute(WebElement element, String text, String value) {
		try {

			text = element.getAttribute(value);
			System.out.println("Get the attribute for the given value : " + text);
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING GETTING ATTRIBUTE");
		}
	}

	protected static void implicityWait() {
		try {
			{
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
				
			}

		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING IMPLICITY WAIT");
		}
	}

	protected static void waitForVisibilityOfElement(WebElement element) {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
			wait.until(ExpectedConditions.visibilityOf(element));

		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING VISIBILITY OF ELEMENT LOCATED WAIT");
		}
	}
	protected static void waitForVisibilityOfAllElements(List<WebElement> elements) {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	    } catch (Exception e) {
	        Assert.fail("ERROR: OCCURRED DURING VISIBILITY OF ELEMENTS WAIT. " + e.getMessage());
	    }
	}
	

	protected static void waitForElementToBeClickable(WebElement element) {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING ELEMENT TO BE CLICKABLE WAIT");
		}
	}

	/*
	 * protected String static void takeScreenshot() { try { TakesScreenshot ts =
	 * (TakesScreenshot)driver; Date date = new Date(); String dateText =
	 * date.toString().replace(" ", "_").replace(":", "_"); Robot robot = new
	 * Robot(); Rectangle screenRect = new
	 * Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); BufferedImage
	 * desktopScreenshot = robot.createScreenCapture(screenRect); File desktopFile =
	 * new File(".//Screenshots//" + dateText + ".png");
	 * ImageIO.write(desktopScreenshot, "png", desktopFile);
	 * 
	 * } catch (Exception e) {
	 * Assert.fail("ERROR: OCCURE DURING TAKING THE SCREENSHOT"); } }
	 */

	protected static void scrollThePage(WebElement element, String actionType) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			switch (actionType.toLowerCase()) {
			case "scrollup":
				js.executeScript("arguments[0].scrollIntoView(false);", element);
				break;
			case "scrolldown":
				js.executeScript("arguments[0].scrollIntoView(true);", element);
			default:
				System.out.println("Unsupported action: " + actionType);

			}
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING SCROLLING THE PAGE");
		}

	}

	protected static void frames(WebElement element, String action, String value) {
		try {
			switch (action.toLowerCase()) {
			case "index":
				driver.switchTo().frame(Integer.parseInt(value));
				break;
			case "nameorid":
				driver.switchTo().frame(value);
				break;
			case "webelement":
				driver.switchTo().frame(element);
				break;
			case "default":
				driver.switchTo().defaultContent();
				break;
			default:
				System.out.println("Unsupported action: " + action);
			}

		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING SWITCHING TO THE FRAMES");
		}
	}

	protected static void checkboxOrRadioButton(WebElement element) {
		try {

			if (!element.isSelected()) {
				element.click();
			} else {
				System.out.println("Element was already selected");
			}

		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING SELECTING THE CHECKBOX OR RADIO BUTTON");
		}
	}

	protected static void windowHandling(String value) {
		try {

			Set<String> windowHandles = driver.getWindowHandles();

			List<String> windows = new ArrayList<>(windowHandles);

			driver.switchTo().window(windows.get(Integer.parseInt(value)));

		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING SWITCHING THE WINDOWS");
		}
	}

	protected static void keyPress(int keyCode) {
		try {
			Robot robot = new Robot();
			robot.keyPress(keyCode);
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING KEY PRESS");
		}
	}

	protected static void keyRelease(int keyCode) {
		try {
			Robot robot = new Robot();
			robot.keyRelease(keyCode);
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING KEY RELEASE");
		}
	}

	protected static void elementClickByJavaScript(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING CLICKING THE ELEMENT USING JAVASCRIPT EXECUTOR");
		}
	}
	protected static void hardAssert(WebElement element, String exceptedText) {
		try {
			String actualText = element.getText();
		Assert.assertEquals(actualText, exceptedText);
		
		}
		catch(Exception e) {
			Assert.fail("ERROR: OCCUR DURING ASSERTING THE VALUE");
		}
	}
	public static void extentReportStart(String location) {
		try {
			extentReports = new ExtentReports();
			file = new File(location);
			ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
			extentReports.attachReporter(sparkReporter);
			extentReports.setSystemInfo("OS", System.getProperty("os.name"));
			extentReports.setSystemInfo("Java version", System.getProperty("java.version"));
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING DOCUMENTING THE REPORT");
		}
	}
	public static void extentReportTearDown(String location) throws IOException {
		extentReports.flush();
		file = new File(location);
		Desktop.getDesktop().browse((file).toURI());
	}
	
	public String takeScreenshot() throws IOException {
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			String timeStamp = new SimpleDateFormat ("yyyyMMdd_HHmmss").format(new Date());
			File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
			File desfile = new File("Screenshot\\.png" + "_" + timeStamp + ".png");
			FileHandler.copy(scrfile, desfile);
			return desfile.getAbsolutePath();

	
}
	}
	



