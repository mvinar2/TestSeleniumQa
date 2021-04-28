package cz.shop.qa.steps.gui;

import java.util.logging.Logger;

import cucumber.api.java.en.And;
import cz.shop.qa.ImplementationRegister;
import cz.shop.qa.pageobjects.ICart;
import org.junit.Assert;

import cucumber.api.java.en.When;
import cz.shop.qa.pageobjects.IProduct;
import cz.shop.qa.steps.Hooks;

public class Actions {

    private static final Logger LOGGER = Logger.getLogger(Actions.class.getName());

    @When("^navigate to product category \"([^\"]+)\"$")
    public void navigateToProductCategory(String categoryName) {
        LOGGER.info("Testing shop category: " + categoryName);
        try {
            IProduct product = ImplementationRegister.getProperProductImplementation(Hooks.drv);
            product.navigateToProductCategory(categoryName);
            Assert.assertTrue(
                    "Chek if we are at proper product category",
                    product.isStayAtProductCategory(categoryName)
            );
        } catch (IllegalStateException e) {
            Assert.fail(e.getMessage());
        }
    }

    @When("^navigate to product 1st subcategory \"([^\"]+)\"$")
    public void navigateToProduct1stSubCategory(String subCategoryName) {
        try {
            IProduct product = ImplementationRegister.getProperProductImplementation(Hooks.drv);
            product.navigateToProduct1stSubCategory(subCategoryName);
            Assert.assertTrue(
                    "Chek if we are at proper product subcategory",
                    product.isStayAtProduct1stSubCategory(subCategoryName)
            );
        } catch (IllegalStateException e) {
            Assert.fail(e.getMessage());
        }
    }

    @When("^sort products by \"([^\"]+)\"$")
    public void sortProductBy(String sortName) {
        try {
            IProduct product = ImplementationRegister.getProperProductImplementation(Hooks.drv);
            product.sortProductsBy(sortName);
            Assert.assertTrue(
                    "Chek if products have sorted",
                    product.isProductsProperlySorted(sortName)
            );
        } catch (IllegalStateException e) {
            Assert.fail(e.getMessage());
        }
    }

    @And("I add one top item from the list to the shopping cart")
    public void add1stTopProductToCart() {
        try {
            ICart cart = ImplementationRegister.getProperCartImplementation(Hooks.drv);
            cart.addToCart1stProduct();
        } catch (IllegalStateException e) {
            Assert.fail(e.getMessage());
        }
    }

    @And("navigate to shop cart")
    public void navigateToShopCart() {
        try {
            ICart cart = ImplementationRegister.getProperCartImplementation(Hooks.drv);
            cart.navigateToCart();
        } catch (IllegalStateException e) {
            Assert.fail(e.getMessage());
        }
    }
}
