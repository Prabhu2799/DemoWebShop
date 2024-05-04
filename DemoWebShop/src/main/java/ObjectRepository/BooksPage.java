package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {
	public BooksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	open computer & internt book link
	@FindBy(linkText = "Computing and Internet")
	private WebElement cai;

//Add to cart for Computing and internt
	@FindBy(id = "add-to-cart-button-13")
	private WebElement addtc;

// add to compare list
	@FindBy(xpath = "//input[@class='button-2 add-to-compare-list-button']")
	private WebElement addtocompare;

//	 share to email
	@FindBy(xpath = "//input[@class='button-2 email-a-friend-button']")
	private WebElement sharetofireind;

//	frend mail
	@FindBy(id = "FriendEmail")
	private WebElement friendmail;

//	yours mail
	@FindBy(id = "YourEmailAddress")
	private WebElement yourmail;

//	sumbitbuton to send mail
	@FindBy(xpath = "//input[@class='button-1 send-email-a-friend-button']")
	private WebElement submitbtn01;

//	Related product
	@FindBy(xpath = "//strong[.='Related products']")
	private WebElement Relatedrodut;

//	sortby option
	@FindBy(id = "products-orderby")
	private WebElement sortoption;

//	display option
	@FindBy(id = "products-pagesize")
	private WebElement display;

//	views as
	@FindBy(id = "products-viewmode")
	private WebElement views;
	
// price option
	@FindBy(xpath = "(//span[@class='PriceRange'])[4]")
	private WebElement priceoption;
	
//Add review
	@FindBy(linkText = "Add your review")
	private WebElement review;
	
//add review title
	@FindBy(id = "AddProductReview_Title")
	private WebElement reviewtitle;
	
//add review of the prodcut
	@FindBy(id = "AddProductReview_ReviewText")
	private WebElement reviewtext;
	
// review radio buton
	@FindBy(id = "addproductrating_3")
	private WebElement reviewbtn;
	
//review submitbutton
	@FindBy(xpath = "//input[@class='button-1 write-product-review-button']")
	private WebElement reviewsbtbtn;
	
//vote
	@FindBy(id = "vote-yes-305")
	private WebElement vote;

			//getters
	public WebElement getCai() {
		return cai;
	}

	public WebElement getAddtc() {
		return addtc;
	}

	public WebElement getAddtocompare() {
		return addtocompare;
	}

	public WebElement getSharetofireind() {
		return sharetofireind;
	}

	public WebElement getFriendmail() {
		return friendmail;
	}

	public WebElement getYourmail() {
		return yourmail;
	}

	public WebElement getSubmitbtn01() {
		return submitbtn01;
	}

	public WebElement getRelatedrodut() {
		return Relatedrodut;
	}

	public WebElement getSortoption() {
		return sortoption;
	}

	public WebElement getDisplay() {
		return display;
	}

	public WebElement getViews() {
		return views;
	}

	public WebElement getPriceoption() {
		return priceoption;
	}

	public WebElement getReview() {
		return review;
	}


	public WebElement getReviewtitle() {
		return reviewtitle;
	}

	

	public WebElement getReviewtext() {
		return reviewtext;
	}

	

	public WebElement getReviewbtn() {
		return reviewbtn;
	}

	

	public WebElement getReviewsbtbtn() {
		return reviewsbtbtn;
	}

	public WebElement getVote() {
		return vote;
	}

	public void setVote(WebElement vote) {
		this.vote = vote;
	}

	
	}


	


