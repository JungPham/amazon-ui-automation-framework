package amazonSales.pages;

import utils.Locator;
import utils.WebElementLocator;

public class CreateAccountPage {

    private final WebElementLocator
        yourNameTextbox = new WebElementLocator(Locator.Id, "ap_customer_name"),
        mobileNumberButton = new WebElementLocator(Locator.Id, "auth-country-picker-container"),
        mobileNumberDropdown = new WebElementLocator(Locator.Id, "//ul[@role='application']//li/a[contains(text(),'United States +1')]"),
        mobileNumberTextbox = new WebElementLocator(Locator.Id, "ap_phone_number"),
        passWordTextbox = new WebElementLocator(Locator.Id, "ap_password"),
        continueButton = new WebElementLocator(Locator.Id, "continue");
}
