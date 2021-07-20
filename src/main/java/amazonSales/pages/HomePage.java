package amazonSales.pages;

import shared.BasePage;
import utils.Locator;
import utils.WebElementLocator;

public class HomePage extends BasePage {

    private final WebElementLocator
        accountListButton = new WebElementLocator(Locator.Id, "nav-link-accountList"),
        startHereLinkText = new WebElementLocator(Locator.Xpath, "//a[text()='Start here.']");

    public HomePage hoverOnAccountListButton(){

    }

    public HomePage clickOnStartHereLinkText(){

    }
}
