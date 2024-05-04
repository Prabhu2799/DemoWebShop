package TestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.AccountSetting;
import ObjectRepository.BooksPage;
import ObjectRepository.LoginPage;
import ObjectRepository.RegisterPage;
import ObjectRepository.WelcomePage;

public class DemoWebShopTest {
	@Test
	public void RegisterTest_001() {
//		launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		Enter url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		RegisterPage register = new RegisterPage(driver);

//		Click on RegisterLink
		welcome.getRegisterLink().click();
//		click gender male 
		register.getGendermbtn().click();
//		enter first name
		register.getFrstName().sendKeys("Prabhu");
//		enter last name
		register.getLstname().sendKeys("govind");
//		enter mail
		register.getEmail().sendKeys("gprabhugee131@gmail.com");
//		enter password
		register.getPwd().sendKeys("Prabhu@123");
//		enter confirm password
		register.getCnfmpwd().sendKeys("Prabhu@123");
//		enter submit button
		register.getRegbtn().click();
		driver.quit();
	}

	@Test

	public void Login_002() {
//		launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		Enter URL
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);

//		click on Login button
		welcome.getLoginLink().click();
		driver.quit();
	}

	@Test
	public void lOgin_003() {
//		launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		Enter URL
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);

//		click on Login button
		welcome.getLoginLink().click();

//		enter valid mail id
		login.getLoginmail().sendKeys("gprabhugee131@gmail.com");

//		enter password
		login.getPasswordlogin().sendKeys("Prabhu@123");

//		click submit button
		login.getSubmitbtn().click();

		driver.quit();

	}

	@Test
	public void BookSOPen_004() {
//	launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//	Enter URL
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);

//	click on Login button
		welcome.getLoginLink().click();

//	enter valid mail id
		login.getLoginmail().sendKeys("gprabhugee131@gmail.com");

//	enter password
		login.getPasswordlogin().sendKeys("Prabhu@123");

//	click submit button
		login.getSubmitbtn().click();

//	Click books link
		welcome.getBooksLink().click();

//	close the browser
		driver.quit();
	}

	@Test
	public void BookSOPen_005() {
//	launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//	Enter URL
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		BooksPage book = new BooksPage(driver);

//	click on Login button
		welcome.getLoginLink().click();

//	enter valid mail id
		login.getLoginmail().sendKeys("gprabhugee131@gmail.com");

//	enter password
		login.getPasswordlogin().sendKeys("Prabhu@123");

//	click submit button
		login.getSubmitbtn().click();

//	Click books link
		welcome.getBooksLink().click();

//	click computing And Iternt bok link
		book.getCai().click();

//	close the browser
		driver.quit();
	}

	@Test
	public void BookSAddtocart_006() {
//	launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//	Enter URL
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		BooksPage book = new BooksPage(driver);

//	click on Login button
		welcome.getLoginLink().click();

//	enter valid mail id
		login.getLoginmail().sendKeys("gprabhugee131@gmail.com");

//	enter password
		login.getPasswordlogin().sendKeys("Prabhu@123");

//	click submit button
		login.getSubmitbtn().click();

//	Click books link
		welcome.getBooksLink().click();

//	click computing And Iternt bok link
		book.getCai().click();

//	Addtocart
		book.getAddtc().click();

//	close the browser
		driver.quit();
	}

	@Test
	public void BookSAddtocompare_007() {
//	launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//	Enter url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		BooksPage book = new BooksPage(driver);

//	click on Login button
		welcome.getLoginLink().click();

//	enter valid mail id
		login.getLoginmail().sendKeys("gprabhugee131@gmail.com");

//	enter password
		login.getPasswordlogin().sendKeys("Prabhu@123");

//	click submit button
		login.getSubmitbtn().click();

//	Click books link
		welcome.getBooksLink().click();

//	click computing And Iternt bok link
		book.getCai().click();

//	Addtocompare
		book.getAddtocompare().click();

//	close the browser
		driver.quit();
	}

	@Test
	public void BookSSharetoFriend_008() throws InterruptedException {
//	launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//	Enter url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		BooksPage book = new BooksPage(driver);

//	click on Login button
		welcome.getLoginLink().click();

//	enter valid mail id
		login.getLoginmail().sendKeys("gprabhugee131@gmail.com");

//	enter password
		login.getPasswordlogin().sendKeys("Prabhu@123");

//	click submit button
		login.getSubmitbtn().click();

//	Click books link
		welcome.getBooksLink().click();

//	click computing And Iternt bok link
		book.getCai().click();

//	Share to firend
		book.getSharetofireind().click();

//	fried mail
		book.getFriendmail().sendKeys("Prabhug@gmail.com");
		// Thread.sleep(2000);

//	your mail
//		book.getYourmail().sendKeys("gprabhugee131@gmail.com");
//submit button
		book.getSubmitbtn01().click();
//	close the browser
		driver.quit();
	}

	@Test
	public void BookSRelatedProduct_009() {
//	launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//	Enter url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		BooksPage book = new BooksPage(driver);

//	click on Login button
		welcome.getLoginLink().click();

//	enter valid mail id
		login.getLoginmail().sendKeys("gprabhugee131@gmail.com");

//	enter password
		login.getPasswordlogin().sendKeys("Prabhu@123");

//	click submit button
		login.getSubmitbtn().click();

//	Click books link
		welcome.getBooksLink().click();

//	click computing And Iternt bok link
		book.getCai().click();

//	show related product
		book.getRelatedrodut().click();

//	close the browser
		driver.quit();
	}

	@Test
	public void BookSsortbyoption_010() throws InterruptedException {
//	launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//	Enter url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		BooksPage book = new BooksPage(driver);

//	click on Login button
		welcome.getLoginLink().click();

//	enter valid mail id
		login.getLoginmail().sendKeys("gprabhugee131@gmail.com");

//	enter password
		login.getPasswordlogin().sendKeys("Prabhu@123");

//	click submit button
		login.getSubmitbtn().click();

//	Click books link
		welcome.getBooksLink().click();
// sort by option
		book.getSortoption().sendKeys("Price: High to Low");
		Thread.sleep(2000);

//	close the browser
		driver.quit();
	}

	@Test
	public void Bookdisplayoption_011() {
//	launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//	Enter url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		BooksPage book = new BooksPage(driver);
//	click on Login button
		welcome.getLoginLink().click();

//	enter valid mail id
		login.getLoginmail().sendKeys("gprabhugee131@gmail.com");

//	enter password
		login.getPasswordlogin().sendKeys("Prabhu@123");

//	click submit button
		login.getSubmitbtn().click();

//	Click books link
		welcome.getBooksLink().click();
// display option
		book.getDisplay().sendKeys("4");

//	close the browser
		driver.quit();
	}

	@Test
	public void BookSviewsoption_012() {
//	launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//	Enter url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		BooksPage book = new BooksPage(driver);
//	click on Login button
		welcome.getLoginLink().click();

//	enter valid mail id
		login.getLoginmail().sendKeys("gprabhugee131@gmail.com");

//	enter password
		login.getPasswordlogin().sendKeys("Prabhu@123");

//	click submit button
		login.getSubmitbtn().click();

//	Click books link
		welcome.getBooksLink().click();
// viewas soption
		book.getViews().sendKeys("List");

//	close the browser
		driver.quit();
	}
	@Test
	public void BookSpriceoption_013() throws InterruptedException {
//	launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//	Enter url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		BooksPage book = new BooksPage(driver);
//	click on Login button
		welcome.getLoginLink().click();

//	enter valid mail id
		login.getLoginmail().sendKeys("gprabhugee131@gmail.com");

//	enter password
		login.getPasswordlogin().sendKeys("Prabhu@123");

//	click submit button
		login.getSubmitbtn().click();

//	Click books link
		welcome.getBooksLink().click();
// price option
		book.getPriceoption().click();
		Thread.sleep(2000);

//	close the browser
		driver.quit();
	}
	@Test
	public void BooksNewsLetter_014()
	{
		//launch browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//enter url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage Welcome=new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		
//		click on Login button
			Welcome.getLoginLink().click();

//		enter valid mail id
			login.getLoginmail().sendKeys("gprabhugee131@gmail.com");

//		enter password
			login.getPasswordlogin().sendKeys("Prabhu@123");

//		click submit button
			login.getSubmitbtn().click();
		
	
		//newsletter
		Welcome.getNewsLetterTextBox().sendKeys("gprabhugee131@gmail.com");
		//newsletter submit button
		Welcome.getNewsLetterSubButn().click();
		//close the browser
		driver.quit();
	}
	@Test
	public void BookSreview_015() {
		//launch browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//enter url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage Welcome=new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		BooksPage book=new BooksPage(driver);
		
//		click on Login button
			Welcome.getLoginLink().click();

//	enter valid mail id
	login.getLoginmail().sendKeys("gprabhugee131@gmail.com");

//	enter password
	login.getPasswordlogin().sendKeys("Prabhu@123");

//	click submit button
		login.getSubmitbtn().click();

//	Click books link
		Welcome.getBooksLink().click();
// click on computer an internet
		book.getCai().click();
//click reviewbutton
		book.getReview().click();
//click review ttitle
		book.getReviewtitle().sendKeys("waste");
//click reviw text
	book.getReviewtext().sendKeys("dontbuy");
//click review rate
		book.getReviewbtn().click();
//clcik rebview submit button
		book.getReviewsbtbtn().click();
		driver.quit();
	}
	@Test
	public void BookSvreviewvote_016() {
		//launch browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//enter url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage Welcome=new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		BooksPage book=new BooksPage(driver);
		
//		click on Login button
			Welcome.getLoginLink().click();

//	enter valid mail id
	login.getLoginmail().sendKeys("gprabhugee131@gmail.com");

//	enter password
	login.getPasswordlogin().sendKeys("Prabhu@123");

//	click submit button
		login.getSubmitbtn().click();

//	Click books link
		Welcome.getBooksLink().click();
// click on computer an internet
		book.getCai().click();
//click reviewbutton
		book.getReview().click();
//click vote 
		book.getVote().click();
		driver.quit();
}
	@Test(dependsOnMethods = "BookSAddtocart_006")
	public void BookRemoveCart_017() {
		//launch browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//enter url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage Welcome=new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		AccountSetting shopping=new AccountSetting(driver);
		
//		click on Login button
			Welcome.getLoginLink().click();

//	enter valid mail id
	login.getLoginmail().sendKeys("gprabhugee131@gmail.com");

//	enter password
	login.getPasswordlogin().sendKeys("Prabhu@123");

//	click submit button
		login.getSubmitbtn().click();
		
//shoppingcarty
		Welcome.getShoppingCartLink().click();
		
//select check box
		shopping.removebtn.click();
		
//updatebutton
		shopping.updatebtn.click();
		
//close thebrowser
		driver.quit();
	
}
	@Test
	public void BookSTojewellery_018() {
//	launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//	Enter url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);

//	click on Login button
		welcome.getLoginLink().click();

//	enter valid mail id
		login.getLoginmail().sendKeys("gprabhugee131@gmail.com");

//	enter password
		login.getPasswordlogin().sendKeys("Prabhu@123");

//	click submit button
		login.getSubmitbtn().click();

//	Click books link
		welcome.getBooksLink().click();
//click on jewwlery 
		welcome.getJewelleryLink().click();

//	close the browser
		driver.quit();
	}
@Test
public void Logout_0019() {
///Launch briwser
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
//enter url
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WelcomePage welcome = new WelcomePage(driver);
	LoginPage login = new LoginPage(driver);
//	click on Login button
		welcome.getLoginLink().click();

//	enter valid mail id
		login.getLoginmail().sendKeys("gprabhugee131@gmail.com");

//	enter password
		login.getPasswordlogin().sendKeys("Prabhu@123");

//	click submit button
		login.getSubmitbtn().click();
//click logoutbutton
		welcome.logout.click();
		driver.quit();
}	
}
