package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProvidersPage {

	WebDriver driver;

	public ProvidersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='js-form-item form-item js-form-type-search-api-autocomplete form-item-s js-form-item-s form-no-label']//input[@id='edit-s']")
	public WebElement searchField;

	@FindBy(xpath = "//a[@href='https://e.uclahealth.org/new-patient-appointment-request?utm_source=uclah_organic&utm_content=shira-grock&utm_campaign=endocrinology_aq_request-appointment&utm_medium=search-provider']")
	public WebElement requestAppointment;

	public void searchField() {
		searchField.sendKeys("Male Doctors", Keys.ENTER);
	}

	public void requestAppointment() {
		requestAppointment.click();
	}

}
