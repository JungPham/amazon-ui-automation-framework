package amazonSales;


import common.CommonRunnerConfig;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/amazonSales/features"},
        glue = {"amazonSales/steps"})
public class AmazonSalesRegressionTestRunner extends CommonRunnerConfig {
}
