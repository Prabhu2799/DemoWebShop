package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shoppingcart {
 public Shoppingcart(WebDriver driver){
	 PageFactory.initElements(driver, this);
 }
//terms and condtionbutton
		@FindBy(xpath = "//input[@id='termsofservice']")
		public WebElement term;
	//click the check out button
		@FindBy(xpath = "//button[@id='checkout']")
		public WebElement checkout;
	//select country
		@FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
		public WebElement country;
	//enter city name
		@FindBy(xpath = "//input[@id='BillingNewAddress_City']")
		public WebElement city;
	//enter adrrss
		@FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
		public WebElement address;
	//zipcode
		@FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
		public WebElement zipcode;
	//mobile
		@FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
		public WebElement mbno;
	//shopping address continue
		@FindBy(xpath = "(//input[@class='button-1 new-address-next-step-button'])[1]")
		public WebElement Sacontinue;
	//shipping address continue
		@FindBy(xpath = "(//input[@class='button-1 new-address-next-step-button'])[2]")
		public WebElement spcontinue;
	//shipping metohd
		@FindBy(xpath = "(//input[@class='button-1 shipping-method-next-step-button'])")
		public WebElement smcontinue;
	//payment continue
		@FindBy(xpath = "(//input[@class='button-1 payment-method-next-step-button'])")
		public WebElement paycon;
	//paymentinfo 
		@FindBy(xpath = "(//input[@class='button-1 payment-info-next-step-button'])")
		public WebElement payinc;
	//confirm button
		@FindBy(xpath = "(//input[@class='button-1 confirm-order-next-step-button'])")
		public WebElement confirm;
}
