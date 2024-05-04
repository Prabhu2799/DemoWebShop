package ObjectRepository;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	registerbutton
	@FindBy(linkText = "Register")
	private WebElement RegisterLink;

//	Login link
	@FindBy(linkText = "Log in")
	private WebElement LoginLink;

//	shoppingcart
	@FindBy(linkText = "Shopping cart")
	private WebElement ShoppingCartLink;

//	wishlist
	@FindBy(linkText = "Wishlist")
	private WebElement Wishlistlink;

//	bookslink
	@FindBy(linkText = "Books")
	private WebElement BooksLink;

//	jewellery link
	@FindBy(linkText = "Jewelry")
	private WebElement JewelleryLink;

//	newslettermail
	@FindBy(id = "newsletter-email")
	private WebElement NewsLetterTextBox;

//subsrcibebutton newletter
	@FindBy(id = "newsletter-subscribe-button")
	private WebElement NewsLetterSubButn;

//logout
	@FindBy(linkText = "Log out")
	public WebElement logout;

//user profile
	@FindBy(linkText = "gprabhugee131@gmail.com")
	public WebElement user;

//comapred list
	@FindBy(linkText = "Compare products list")
	public WebElement comparelist;
// recently viewd product
	@FindBy(linkText = "Recently viewed products")
	public WebElement recentlyviewed;
	// Appearl and shoes
	@FindBy(linkText = "Apparel & Shoes")
	public WebElement apparel;
	//next button for apparel
	@FindBy(linkText = "Next")
	public WebElement next;

//recently viewd product
	public WebElement getRegisterLink() {
		return RegisterLink;

	}

	// getters
	public WebElement getLoginLink() {
		return LoginLink;
	}

	public WebElement getShoppingCartLink() {
		return ShoppingCartLink;
	}

	public WebElement getWishlistlink() {
		return Wishlistlink;
	}

	public WebElement getBooksLink() {
		return BooksLink;
	}

	public WebElement getJewelleryLink() {
		return JewelleryLink;
	}

	public WebElement getNewsLetterTextBox() {
		return NewsLetterTextBox;
	}

	public WebElement getNewsLetterSubButn() {
		return NewsLetterSubButn;
	}

}
