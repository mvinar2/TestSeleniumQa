package cz.shop.qa.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cz.shop.qa.TestContext;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import cz.shop.qa.api.ApiClient;
import cz.shop.qa.webdriver.Browser;
import cz.shop.qa.webdriver.BrowserFactory;

import java.io.IOException;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class Hooks {

    private static final Logger LOGGER = Logger.getLogger(Hooks.class.getName());

    private final static ResourceBundle testProperties = ResourceBundle.getBundle("tests");
    static Browser browser;
    public static WebDriver drv;
    public static ApiClient api;

    @Before("@gui")
    public void openWebPage() {
        browser = BrowserFactory.getDriverFactory(testProperties.getString("browser"), testProperties.getString("driver"));
        drv = browser.getDriver();
        LOGGER.info("###### Starting GUI test ######");
    }

    @Before("@api")
    public void createApiClientAndGetToken() throws IOException {
        api = new ApiClient(testProperties.getString("auth_url"), testProperties.getString("api_url"), testProperties.getString("client_id"), testProperties.getString("client_secret"));
        api.obtainBearerToken();
        LOGGER.info("###### Starting API test ######");
    }

    @After("@gui")
    public void guiTestTearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) drv).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
        drv.close();
        TestContext.removeScenarioShop(Thread.currentThread().getId());
        LOGGER.info("###### GUI test ended ######");
    }

    @After("@api")
    public void apiTestTearDown() {
        LOGGER.info("###### API test ended ######");
    }

}
