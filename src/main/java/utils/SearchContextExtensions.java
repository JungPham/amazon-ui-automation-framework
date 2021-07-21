package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static utils.LocatorExtensions.toBy;

public class SearchContextExtensions {

    public static WebElement getElement(WebDriver driver, WebElementLocator locator){
        return driver.findElement(toBy(locator));
    }

    public static void hoverOnElement(WebDriver driver, WebElement element){
        Actions hover = new Actions(driver);
        hover.moveToElement(element);
        hover.perform();
    }
}
