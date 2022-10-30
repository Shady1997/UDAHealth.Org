package test_cases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

//import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AppointmentPage;
import pages.HomePage;
import pages.ProvidersPage;
import utility.Utility;

public class TestCase001_CheckHomePage extends TestBase {

	HomePage homePage;
	ProvidersPage providersPage;
	AppointmentPage appointmentPage;
	String currentHandle;
	Robot r;

	@Test(priority = 2, groups = "smoke", description = "Choose to Search Doctors")
	public void ChooseSearchPage() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.searchDoctors();
		// take screenshot to Provider page
		Utility.captureScreenshot(driver, "ProviderPage");
	}

	@Test(priority = 3, groups = "smoke", description = "Search for Male Doctors")
	public void searchForDoctor() throws InterruptedException {
		providersPage = new ProvidersPage(driver);
		providersPage.searchField();
		// take screenshot to Provider page
		Utility.captureScreenshot(driver, "SearchResult");
		for (int i = 0; i < 10; i++) {
			js.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(2000);
		}
		providersPage.requestAppointment();
		Thread.sleep(5000);
	}

	@Test(priority = 4, groups = "smoke", description = "Fill Patient Data and Reserve Appointment")
	public void reserveAppointment() throws InterruptedException, AWTException {
		appointmentPage = new AppointmentPage(driver);
		// Get all the handles currently available
		Set<String> handles = driver.getWindowHandles();
		currentHandle = driver.getWindowHandle();
		for (String actual : handles) {
			if (!actual.equalsIgnoreCase(currentHandle)) {
				// Switch to the opened tab
				driver.switchTo().window(actual);
			}
		}
		appointmentPage.getFirstName();
		appointmentPage.getLastName();
		appointmentPage.getPhoneNumber();
		appointmentPage.getAltPhoneNumber();
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(9000);
		appointmentPage.getTimeToCall();
		appointmentPage.getEmailAddress();
		appointmentPage.getZipCode();
		Thread.sleep(3000);
		appointmentPage.getGender();
		appointmentPage.getBirthday();
		appointmentPage.getReason();
		appointmentPage.getFirstTimeVisist();
		Thread.sleep(3000);
		appointmentPage.getIssuanceType();
		js.executeScript("window.scrollBy(0,400)", "");
		appointmentPage.getReferringDoctorName();
		Thread.sleep(2000);
		appointmentPage.getToSeeDoctorName();
		Thread.sleep(3000);
//		js.executeScript("var tempElement=document.getElementsByClassName('recaptcha-checkbox-border');tempElement[0].click();",null);
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		appointmentPage.getSubmitButton();
		Thread.sleep(9000);
	}
}
