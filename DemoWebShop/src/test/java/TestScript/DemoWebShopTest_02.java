package TestScript;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ObjectRepository.AccountSetting;
import ObjectRepository.Jewellery;
import ObjectRepository.LoginPage;
import ObjectRepository.Shoppingcart;
import ObjectRepository.WelcomePage;

public class DemoWebShopTest_02 {
	@Test
	public void jewellery_001() {

//open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage Login = new LoginPage(driver);
		Jewellery jewel = new Jewellery(driver);

// login
		welcome.getLoginLink().click();
// enter valid mail
		Login.getLoginmail().sendKeys("gprabhugee131@gmail.com");
// enter validmpasword
		Login.getPasswordlogin().sendKeys("Prabhu@123");
// enter submit buttn
		Login.getSubmitbtn().click();
// jewellery
		welcome.getJewelleryLink().click();
// black and diamond
		jewel.diamond.click();
		driver.quit();
	}

	@Test
	public void jewellery_WishList_002() {

//open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage Login = new LoginPage(driver);
		Jewellery jewel = new Jewellery(driver);

// login
		welcome.getLoginLink().click();
// enter valid mail
		Login.getLoginmail().sendKeys("gprabhugee131@gmail.com");
// enter validmpasword
		Login.getPasswordlogin().sendKeys("Prabhu@123");
// enter submit buttn
		Login.getSubmitbtn().click();
// jewellery
		welcome.getJewelleryLink().click();
// black and diamond
		jewel.diamond.click();
// add to wishlit
		jewel.wish.click();
		driver.quit();
	}

	@Test
	public void jewellery_Quantity_003() {

//open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage Login = new LoginPage(driver);
		Jewellery jewel = new Jewellery(driver);

// login
		welcome.getLoginLink().click();
// enter valid mail
		Login.getLoginmail().sendKeys("gprabhugee131@gmail.com");
// enter validmpasword
		Login.getPasswordlogin().sendKeys("Prabhu@123");
// enter submit buttn
		Login.getSubmitbtn().click();
// jewellery
		welcome.getJewelleryLink().click();
// black and diamond
		jewel.diamond.click();
// extra quantity
		jewel.qty.sendKeys("2");
		driver.quit();
	}

	@Test
	public void jewellery_custmize_004() {

//open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage Login = new LoginPage(driver);
		Jewellery jewel = new Jewellery(driver);

// login
		welcome.getLoginLink().click();
// enter valid mail
		Login.getLoginmail().sendKeys("gprabhugee131@gmail.com");
// enter validmpasword
		Login.getPasswordlogin().sendKeys("Prabhu@123");
// enter submit buttn
		Login.getSubmitbtn().click();
// jewellery
		welcome.getJewelleryLink().click();
// Own
		jewel.own.click();
// chosse material
		jewel.material.sendKeys("Gold (1 mm)");
//Length
		jewel.length.sendKeys("2");
// choose pendant
		jewel.pendant.click();
// addtocart
		jewel.addtocart.click();

		driver.quit();
	}

	@Test(dependsOnMethods = "jewellery_WishList_002")
	public void jewellery_wishlisttocart_005() {

		// open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage Login = new LoginPage(driver);
		Jewellery jewel = new Jewellery(driver);

		// login
		welcome.getLoginLink().click();
		// enter valid mail
		Login.getLoginmail().sendKeys("gprabhugee131@gmail.com");
		// enter validmpasword
		Login.getPasswordlogin().sendKeys("Prabhu@123");
		// enter submit buttn
		Login.getSubmitbtn().click();
		// jewellery
		welcome.getJewelleryLink().click();
		// black and diamond
		jewel.diamond.click();
		// add to wishlit
		jewel.wish.click();
//wishlist
		welcome.getWishlistlink().click();
//click the checkbox
		jewel.checkbxforcart.click();
//clickthe add to cart
		jewel.wishlistcart.click();
		driver.quit();

	}

	@Test // (dependsOnMethods = "jewellery_WishList_002")
	public void jewellery_removefromwishlist_006() {

//open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage Login = new LoginPage(driver);
		Jewellery jewel = new Jewellery(driver);

// login
		welcome.getLoginLink().click();
// enter valid mail
		Login.getLoginmail().sendKeys("gprabhugee131@gmail.com");
// enter validmpasword
		Login.getPasswordlogin().sendKeys("Prabhu@123");
// enter submit buttn
		Login.getSubmitbtn().click();
//wishlist
		welcome.getWishlistlink().click();
//remove
		jewel.removebutton.click();
//update wish lis
		jewel.updatewish.click();
		driver.quit();
	}

	@Test // (dependsOnMethods = "jewellery_wishlisttocart_005")
	public void jewellery_placeorder_007() throws InterruptedException {

		// open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage Login = new LoginPage(driver);
		Shoppingcart shop = new Shoppingcart(driver);

		// login
		welcome.getLoginLink().click();
		// enter valid mail
		Login.getLoginmail().sendKeys("gprabhugee131@gmail.com");
		// enter validmpasword
		Login.getPasswordlogin().sendKeys("Prabhu@123");
		// enter submit buttn
		Login.getSubmitbtn().click();
		// click shopping cart
		welcome.getShoppingCartLink().click();
		// click on termand condition buttton
		shop.term.click();
		// checkout button
		shop.checkout.click();

		// continue
		shop.Sacontinue.click();
		// shopping address continue
		shop.spcontinue.click();
		// shopping method
		shop.smcontinue.click();
		// payment
		shop.paycon.click();
		// payment info continue
		shop.payinc.click();
		// confirm button
		shop.confirm.click();
		driver.quit();
	}

	@Test
	public void editlastname_008() {

//open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage Login = new LoginPage(driver);
		AccountSetting acc = new AccountSetting(driver);

// login
		welcome.getLoginLink().click();
// enter valid mail
		Login.getLoginmail().sendKeys("gprabhugee131@gmail.com");
// enter validmpasword
		Login.getPasswordlogin().sendKeys("Prabhu@123");
// enter submit buttn
		Login.getSubmitbtn().click();
//click on user
		welcome.user.click();
//click on customer info
		acc.info.click();
//click on last name
		acc.lastname.clear();
//enter laste name
		acc.lastname.sendKeys("gov");
//click save button
		acc.save.click();
		driver.quit();
	}

	@Test
	public void checkthe_order_detasils_009() {

//open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage Login = new LoginPage(driver);
		AccountSetting acc = new AccountSetting(driver);

// login
		welcome.getLoginLink().click();
// enter valid mail
		Login.getLoginmail().sendKeys("gprabhugee131@gmail.com");
// enter validmpasword
		Login.getPasswordlogin().sendKeys("Prabhu@123");
// enter submit buttn
		Login.getSubmitbtn().click();
//click on user
		welcome.user.click();
//click order
		acc.order.click();
		driver.quit();
	}

	@Test//(dependsOnMethods = "jewellery_placeorder_007")
	public void download_the_invoice_010() {

//open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage Login = new LoginPage(driver);
		AccountSetting acc = new AccountSetting(driver);

// login
		welcome.getLoginLink().click();
// enter valid mail
		Login.getLoginmail().sendKeys("gprabhugee131@gmail.com");
// enter validmpasword
		Login.getPasswordlogin().sendKeys("Prabhu@123");
// enter submit buttn
		Login.getSubmitbtn().click();
//click on user
		welcome.user.click();
//click order
		acc.order.click();
//click the order details
		acc.orderdetails.click();
//click on pdf invoice
		acc.pdf.click();
		driver.quit();
	}

	@Test
	public void Re_order_011() {

//open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage Login = new LoginPage(driver);
		AccountSetting acc = new AccountSetting(driver);
		Shoppingcart shop = new Shoppingcart(driver);

// login
		welcome.getLoginLink().click();
// enter valid mail
		Login.getLoginmail().sendKeys("gprabhugee131@gmail.com");
// enter validmpasword
		Login.getPasswordlogin().sendKeys("Prabhu@123");
// enter submit buttn
		Login.getSubmitbtn().click();
//click on user
		welcome.user.click();
//click order
		acc.order.click();
//click the order details
		acc.orderdetails.click();
//click reordr button
		acc.reorder.click();
		// click on termand condition buttton
		shop.term.click();
		// checkout button
		shop.checkout.click();

		// continue
		shop.Sacontinue.click();
		// shopping address continue
		shop.spcontinue.click();
		// shopping method
		shop.smcontinue.click();
		// payment
		shop.paycon.click();
		// payment info continue
		shop.payinc.click();
		// confirm button
		shop.confirm.click();
		driver.quit();
	}

	@Test
	public void Add_New_Address_012() {

//open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage Login = new LoginPage(driver);
		AccountSetting acc = new AccountSetting(driver);

// login
		welcome.getLoginLink().click();
// enter valid mail
		Login.getLoginmail().sendKeys("gprabhugee131@gmail.com");
// enter validmpasword
		Login.getPasswordlogin().sendKeys("Prabhu@123");
// enter submit buttn
		Login.getSubmitbtn().click();
//click on user
		welcome.user.click();
// click address
		acc.Address.click();
//click add new address
		acc.addnew.click();
//enter first name
		acc.firstnameadd.sendKeys("Prabhu");
//enter last name
		acc.lastnameadd.sendKeys("govind");
//enter email
		acc.emailad.sendKeys("massdsdf@gmail.com");
//seelct country
		acc.countryadd.sendKeys("japan");
//enter city
		acc.cityadd.sendKeys("tokyo");
//enter address
		acc.addressadd.sendKeys("qsp");
//enter zipcode
		acc.zipadd.sendKeys("693140");
//enter mobileno
		acc.mobileadd.sendKeys("7894563210");
//click save button
		acc.saveadd.click();
		driver.quit();
	}

	@Test
	public void edit_address_013() {

//open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage Login = new LoginPage(driver);
		AccountSetting acc = new AccountSetting(driver);

// login
		welcome.getLoginLink().click();
// enter valid mail
		Login.getLoginmail().sendKeys("gprabhugee131@gmail.com");
// enter validmpasword
		Login.getPasswordlogin().sendKeys("Prabhu@123");
// enter submit buttn
		Login.getSubmitbtn().click();
//click on user
		welcome.user.click();
// click address
		acc.Address.click();
//edit an adddress
		acc.editadd.click();
//edit last name
		acc.lastnameadd.sendKeys("prabhu");
//save button
		acc.saveadd.click();
		driver.quit();
	}

	@Test
	public void delete_address_014() {

//open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage Login = new LoginPage(driver);
		AccountSetting acc = new AccountSetting(driver);

// login
		welcome.getLoginLink().click();
// enter valid mail
		Login.getLoginmail().sendKeys("gprabhugee131@gmail.com");
// enter validmpasword
		Login.getPasswordlogin().sendKeys("Prabhu@123");
// enter submit buttn
		Login.getSubmitbtn().click();
//click on user
		welcome.user.click();
// click address
		acc.Address.click();
//delete an adddress
		acc.deleteadd.click();
//action key
		Actions keyboard = new Actions(driver);
		keyboard.keyDown(Keys.ENTER);
		driver.quit();
	}

	@Test
	public void Check_Reward_015() {

//open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage Login = new LoginPage(driver);
		AccountSetting acc = new AccountSetting(driver);
	

// login
		welcome.getLoginLink().click();
// enter valid mail
		Login.getLoginmail().sendKeys("gprabhugee131@gmail.com");
// enter validmpasword
		Login.getPasswordlogin().sendKeys("Prabhu@123");
// enter submit buttn
		Login.getSubmitbtn().click();
// click on user
		welcome.user.click();
//click reward po8int
		acc.rewardpoint.click();
		driver.quit();
	}
	@Test
	public void Compare_product_016() {

//open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage Login = new LoginPage(driver);
	

// login
		welcome.getLoginLink().click();
// enter valid mail
		Login.getLoginmail().sendKeys("gprabhugee131@gmail.com");
// enter validmpasword
		Login.getPasswordlogin().sendKeys("Prabhu@123");
// enter submit buttn
		Login.getSubmitbtn().click();
//click comapre product
		welcome.comparelist.click();
		driver.quit();
	}
	@Test
	public void Recently_viewed_product_017() {

//open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage Login = new LoginPage(driver);
		

// login
		welcome.getLoginLink().click();
// enter valid mail
		Login.getLoginmail().sendKeys("gprabhugee131@gmail.com");
// enter validmpasword
		Login.getPasswordlogin().sendKeys("Prabhu@123");
// enter submit buttn
		Login.getSubmitbtn().click();
//click Recently viewd product
		welcome.recentlyviewed.click();
		driver.quit();
}
	@Test
	public void Appreal_Shoes_018() {

//open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage Login = new LoginPage(driver);
		

// login
		welcome.getLoginLink().click();
// enter valid mail
		Login.getLoginmail().sendKeys("gprabhugee131@gmail.com");
// enter validmpasword
		Login.getPasswordlogin().sendKeys("Prabhu@123");
// enter submit buttn
		Login.getSubmitbtn().click();
//apprea and shoes
		welcome.apparel.click();
//click next buton
		welcome.next.click();
		
		driver.quit();
	}
	@Test
	public void Password_change_019() {

//open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage Login = new LoginPage(driver);
		AccountSetting acc = new AccountSetting(driver);
	

// login
		welcome.getLoginLink().click();
// enter valid mail
		Login.getLoginmail().sendKeys("gprabhugee131@gmail.com");
// enter validmpasword
		Login.getPasswordlogin().sendKeys("Prabhu@123");
// enter submit buttn
		Login.getSubmitbtn().click();
// click on user
		welcome.user.click();
//change password
		acc.change.click();
//enter old password
		acc.oldpwd.sendKeys("Prabhu@123");
//enter new password
		acc.newpwd.sendKeys("Prabhu@123");
//enter confirm password
		acc.cnfrmpwd.sendKeys("Prabhu@123");
//change pasword button
		acc.chpwdbtn.click();
		driver.quit();
	}
}
