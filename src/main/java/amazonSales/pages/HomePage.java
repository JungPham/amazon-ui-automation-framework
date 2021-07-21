package amazonSales.pages;

import org.openqa.selenium.WebElement;
import shared.BasePage;
import utils.Locator;
import utils.WebElementLocator;

import static utils.SearchContextExtensions.*;

public class HomePage extends BasePage {

    private final WebElementLocator
        accountListButton = new WebElementLocator(Locator.Id, "%s"),
        startHereLinkText = new WebElementLocator(Locator.Xpath, "//a[text()='%s']");

    public void hoverOnAccountListButton(){
        WebElement element = getElement(driver, accountListButton.Format("nav-link-accountList"));
        hoverOnElement(driver, element);
    }

    public void clickOnStartHereLinkText(){
        getElement(driver, startHereLinkText.Format("Start here.")).click();
    }
}
