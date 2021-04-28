package cz.shop.qa.steps.gui;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cz.shop.qa.ImplementationRegister;
import cz.shop.qa.ShopContext;
import cz.shop.qa.TestContext;
import cz.shop.qa.pageobjects.ICart;
import cz.shop.qa.pageobjects.IHome;
import org.junit.Assert;
import cz.shop.qa.steps.Hooks;
import java.util.logging.Logger;

public class Verifications {

    private static final Logger LOGGER = Logger.getLogger(Verifications.class.getName());

    @Given("^e-shop ([^ ]+) site is open$")
    public void e_shop_site_is_open(String shopName) {
        try {
            TestContext.registerScenarioShop(Thread.currentThread().getId(), new ShopContext(shopName));
            IHome home = ImplementationRegister.getProperHomeImplementation(Hooks.drv, shopName);
            home.startAtHomePage();
            // home.agreedCookiesAndGdpr();
            Assert.assertTrue(String.format(
                    "Check TITLE %s x %s", home.getPageTitle(), home.getExpectedPageTitle()),
                    home.getPageTitle().contains(home.getExpectedPageTitle())
            );
        } catch (IllegalStateException e) {
            Assert.fail(e.getMessage());
        }
    }

    @Then("check that cart contains items: \"([^\" ]+)\"$")
    public void checkCartContainsNumberItem(long items) {
        try {
            ICart cart = ImplementationRegister.getProperCartImplementation(Hooks.drv);
            Assert.assertTrue(
                    "Chek if cart contains " + items + " product",
                    cart.isNumberOfProductAtCart(items)
            );
        } catch (IllegalStateException e) {
            Assert.fail(e.getMessage());
        }
    }
}
