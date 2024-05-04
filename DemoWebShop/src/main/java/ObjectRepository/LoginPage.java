package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//		enter email
		@FindBy(id = "Email")
		private WebElement loginmail;
		
//		enter password	
		@FindBy(id = "Password")
		private WebElement passwordlogin;

//		submit button
		@FindBy(xpath = "//input[@class='button-1 login-button']")
		private WebElement	submitbtn;
		
//		forgot button
		@FindBy(linkText = "Forgot password?")
		private WebElement	forgotbtn;

		public WebElement getLoginmail() {
			return loginmail;
		}

		public WebElement getPasswordlogin() {
			return passwordlogin;
		}

		public WebElement getSubmitbtn() {
			return submitbtn;
		}

		public WebElement getForgotbtn() {
			return forgotbtn;
		}
		
		
}

