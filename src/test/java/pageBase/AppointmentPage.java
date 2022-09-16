package pageBase;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AppointmentPage {

	WebDriver driver;

	public AppointmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='fe344']")
	public WebElement firstName;

	@FindBy(xpath = "//input[@id='fe345']")
	public WebElement lastName;

	@FindBy(xpath = "//input[@id='fe346']")
	public WebElement phoneNumber;

	@FindBy(xpath = "//input[@id='fe349']")
	public WebElement altPhoneNumber;

	@FindBy(xpath = "//input[@id='fe347']")
	public WebElement emailAddress;

	public void getEmailAddress() {
		emailAddress.sendKeys("shadyahmed01091997@outlook.com");
	}

	public void getTimeToCall() {
		Select callTime = new Select(timeToCall);
		callTime.selectByIndex(1);
	}

	public void getZipCode() {
		zipCode.sendKeys("44671");
	}

	public void getGender() {
		Select selectGender = new Select(gender);
		selectGender.selectByIndex(1);
//		gender.click();
	}

	public void getBirthday() {
		birthday.sendKeys("01/09/1997");
	}

	public void getReason() {
		reason.sendKeys("Very Patient");
	}

	public void getFirstTimeVisist() {
		firstTimeVisist.click();
	}

	public void getIssuanceType() {
		Select issuance = new Select(issuanceType);
		issuance.selectByIndex(1);
	}

	public void getReferringDoctorName() {
		referringDoctorName.sendKeys("DR. Shady Ahmed");
	}

	public void getToSeeDoctorName() {
		toSeeDoctorName.sendKeys("DR. Shady Ahmed", Keys.TAB, Keys.TAB);
	}

	public void getSubmitButton() {
		submitButton.click();
	}

	public void getCaptchaButton() {
		captha.click();
	}

	@FindBy(xpath = "//select[@id='fe350']")
	public WebElement timeToCall;

	@FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
	public WebElement captha;

	@FindBy(xpath = "//input[@id='fe387']")
	public WebElement zipCode;

	@FindBy(xpath = "//select[@id='fe1420']")
	public WebElement gender;

	@FindBy(xpath = "//input[@id='fe388']")
	public WebElement birthday;

	@FindBy(xpath = "//textarea[@id='fe389']")
	public WebElement reason;

	@FindBy(xpath = "//input[@id='radio-Yes_aztmnqap']")
	public WebElement firstTimeVisist;

	@FindBy(xpath = "//select[@id='fe807']")
	public WebElement issuanceType;

	@FindBy(xpath = "//input[@id='fe808']")
	public WebElement referringDoctorName;

	@FindBy(xpath = "//input[@id='fe809']")
	public WebElement toSeeDoctorName;

	@FindBy(xpath = "//input[@id='fe348']")
	public WebElement submitButton;

	public void getFirstName() {
		firstName.sendKeys("Shady");
	}

	public void getLastName() {
		lastName.sendKeys("Ahmed");
	}

	public void getPhoneNumber() {
		phoneNumber.sendKeys("01203199410");
	}

	public void getAltPhoneNumber() {
		altPhoneNumber.sendKeys("01023527158");
	}

}
