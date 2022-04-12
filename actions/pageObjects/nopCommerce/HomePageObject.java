package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.HomePageUI;

public class HomePageObject extends BasePage {
	private WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public RegisterPageObject clickToRegisterLink() {
	waitForElementClickable(driver, HomePageUI.REGISTER_LINK);
	clickToElement(driver, HomePageUI.REGISTER_LINK);
	// 2
	//return new RegisterPageObject(driver);
	return PageGeneratorManager.getRegisterPage(driver);
		
	}

	public LoginPageObject clickToLoginLink() {
	waitForElementClickable(driver, HomePageUI.LOGIN_LINK);
	clickToElement(driver, HomePageUI.LOGIN_LINK);
	return PageGeneratorManager.getLoginPage(driver);
	
	}

	public boolean isMyAccountLinkDisplayed() {
		waitForElementVisible(driver, HomePageUI.MY_ACCOUNT_LINK);
		return isElementDisplayed(driver, HomePageUI.MY_ACCOUNT_LINK);
	}



}