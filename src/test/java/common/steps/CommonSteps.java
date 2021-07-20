package common.steps;

import io.cucumber.java.en.When;
import shared.BasePage;
import utils.TestContext;

public class CommonSteps extends BaseSteps{

    private final BasePage basePage = new BasePage();

    public CommonSteps(TestContext testContext) {
        super(testContext);
    }

    //region When
    @When("User goes to Url")
    public void userGoesToUrl(){
        basePage.goToUrl();
    }
    //end Region
}
