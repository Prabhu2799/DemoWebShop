package ObjectRepository;



import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AccountSetting {
	public AccountSetting(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//shoppingcart remove product
	@FindBy(xpath = "//input[@name='removefromcart']")
	public WebElement removebtn;

//shopping cart updatebutton
	@FindBy(xpath = "//input[@class='button-2 update-cart-button']")
	public WebElement updatebtn;

	// customer ifo
	@FindBy(linkText = "Customer info")
	public WebElement info;
	// lastname
	@FindBy(xpath = "//input[@id='LastName']")
	public WebElement lastname;
	// save button
	@FindBy(xpath = "//input[@class='button-1 save-customer-info-button']")
	public WebElement save;
	//	order details
	@FindBy(linkText = "Orders")
	public WebElement order;
	//order detials button
	@FindBy(xpath = "(//input[@class='button-2 order-details-button'])[1]")
	public WebElement orderdetails;
	//pdf inovice
	@FindBy(linkText = "PDF Invoice")
	public WebElement pdf;
	//reorderbutton
	@FindBy(xpath = "//input[@class='button-1 re-order-button']")
	public WebElement reorder;
	//address
	@FindBy(linkText = "Addresses")
	public WebElement Address;
	//add new address
	@FindBy(xpath = "//input[@class='button-1 add-address-button']")
	public WebElement addnew;
	//addres fisrt name
	@FindBy(xpath = "//input[@id='Address_FirstName']")
	public WebElement firstnameadd;
	//lastname address
	@FindBy(xpath = "//input[@id='Address_LastName']")
	public WebElement lastnameadd;
	//email in address
	@FindBy(xpath = "//input[@id='Address_Email']")
	public WebElement emailad;
	//country address
	@FindBy(xpath = "//select[@id='Address_CountryId']")
	public WebElement countryadd;
	//city address
	@FindBy(xpath = "//input[@id='Address_City']")
	public WebElement cityadd;
	//address1
	@FindBy(xpath = "//input[@id='Address_Address1']")
	public WebElement addressadd;
	//zipcode
	@FindBy(xpath = "//input[@id='Address_ZipPostalCode']")
	public WebElement zipadd;
	//mobile
	@FindBy(xpath = "//input[@id='Address_PhoneNumber']")
	public WebElement mobileadd;
	//saveadd
	@FindBy(xpath = "//input[@value='Save']")
	public WebElement saveadd;
	//delete addres
	@FindBy(xpath = "(//input[@class='button-2 delete-address-button'])[2]")
	public WebElement deleteadd;
	//editaddress
	@FindBy(xpath = "(//input[@class='button-2 edit-address-button'])[2]")
	public WebElement editadd;
	//reward point
	@FindBy(linkText = "Reward points")
	public WebElement rewardpoint;
	//change password
	@FindBy(linkText = "Change password")
	public WebElement change;
	//old paddword
	@FindBy(xpath = "//input[@id='OldPassword']")
	public WebElement oldpwd;
	//new password
	@FindBy(xpath = "//input[@id='NewPassword']")
	public WebElement newpwd;
	@FindBy(xpath = "//input[@id='ConfirmNewPassword']")
	public WebElement cnfrmpwd;
	@FindBy(xpath = "//input[@class='button-1 change-password-button']")
	public WebElement chpwdbtn;
	
	
}
