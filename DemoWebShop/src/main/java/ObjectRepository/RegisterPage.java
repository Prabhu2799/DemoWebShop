package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	male button
	@FindBy(id = "gender-male")
	private WebElement gendermbtn;

//	first Name
	@FindBy(id = "FirstName")
	private WebElement frstName;

//	LAstname
	@FindBy(id = "LastName")
	private WebElement lstname;

//	email
	@FindBy(id = "Email")
	private WebElement Email;

//	password	
	@FindBy(id = "Password")
	private WebElement pwd;

//	confrim password
	@FindBy(id = "ConfirmPassword")
	private WebElement cnfmpwd;

//	registerbutton
	@FindBy(id = "register-button")
	private WebElement regbtn;

	public WebElement getGendermbtn() {
		return gendermbtn;
	}

	public WebElement getFrstName() {
		return frstName;
	}

	public WebElement getLstname() {
		return lstname;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getCnfmpwd() {
		return cnfmpwd;
	}

	public WebElement getRegbtn() {
		return regbtn;
	}

}
