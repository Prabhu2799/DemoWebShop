package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jewellery {
	public Jewellery(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	//Black and white diamond
		@FindBy(linkText = "Black & White Diamond Heart")
		public WebElement diamond;
	//wishlist
		@FindBy(xpath  = "//input[@id='add-to-wishlist-button-14']")
		public WebElement wish;
	// add extra quantity
		@FindBy(xpath = "//input[@id='addtocart_14_EnteredQuantity']")
		public WebElement qty;
	// create own jewelery
		@FindBy(linkText = "Create Your Own Jewelry")
		public WebElement own;
	//material
		@FindBy(xpath = "(//select[@id='product_attribute_71_9_15'])[1]")
		public WebElement material;
	//pendant
		@FindBy(id = "product_attribute_71_11_17_49")
		public WebElement pendant;
	//add to cart
		@FindBy(xpath = "(//input[@ID='add-to-cart-button-71'])[1]")
		public WebElement addtocart;
	//length
		@FindBy(xpath = "(//input[@name='product_attribute_71_10_16'])[1]")
		public WebElement length;
	//button for add to cart
		@FindBy(xpath = "//input[@name='addtocart']")
		public WebElement checkbxforcart;
	//addto cart wishlist
		@FindBy(xpath = "//input[@class='button-2 wishlist-add-to-cart-button']")
		public WebElement wishlistcart;
	//remove buton
		@FindBy(xpath = "//input[@name='removefromcart']")
		public WebElement removebutton;
	//updatebutton
		@FindBy(xpath = "//input[@class='button-2 update-wishlist-button']")
		public WebElement updatewish;
	
}
