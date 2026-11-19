package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	WebDriver driver;
//constructor
	public HomePage(WebDriver driver)
	{
		//passing driver to parent class
		super(driver);
	}
	
//locator
@FindBy(xpath="//span[normalize-space()='My Account']") 
WebElement lnkMyaccount;

@FindBy(xpath="//a[normalize-space()='Register']") 
WebElement lnkRegister;


@FindBy(linkText = "Login")   // Login link added in step5
WebElement linkLogin;
//we dont need login for registering

//action
public void clickMyAccount()
{
	lnkMyaccount.click();
}

public void clickRegister()
{
	lnkRegister.click();
}

public void clickLogin()    // added in step5
{
	linkLogin.click();
}
}
