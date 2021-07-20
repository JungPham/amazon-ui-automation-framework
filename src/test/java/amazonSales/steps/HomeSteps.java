package amazonSales.steps;

import amazonSales.pages.HomePage;
import common.steps.BaseSteps;
import io.cucumber.java.en.When;
import utils.TestContext;

public class HomeSteps extends BaseSteps {

    private final HomePage homePage = new HomePage();

    public HomeSteps(TestContext testContext) {
        super(testContext);
    }

    //region When
    @When("User hovers on Account")
    public void userHoversOnAccount(){

    }
    //end Region
}
