package shared;

import Abstracts.BaseInitPage;

public class BasePage extends BaseInitPage {

    public void goToUrl() {
        driver.get(System.getProperty("url"));
    }
}
