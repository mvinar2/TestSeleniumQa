package cz.shop.qa;

import cz.shop.qa.pageobjects.DatartCart;
import cz.shop.qa.pageobjects.DatartHome;
import cz.shop.qa.pageobjects.DatartProduct;
import cz.shop.qa.pageobjects.ICart;
import cz.shop.qa.pageobjects.IHome;
import cz.shop.qa.pageobjects.IProduct;
import cz.shop.qa.pageobjects.MallCart;
import cz.shop.qa.pageobjects.MallHome;
import cz.shop.qa.pageobjects.MallProduct;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class ImplementationRegister {

    private static final Logger LOGGER = Logger.getLogger(ImplementationRegister.class.getName());

    public static IHome getProperHomeImplementation(WebDriver drv, String shopName) throws IllegalStateException {
        LOGGER.info("Try to find 'IHome' implementation for: " + shopName );
        IHome home;
        switch (shopName) {
            case "Datart":
                home = new DatartHome(drv);
                break;
            case "Mall":
                home = new MallHome(drv);
                break;
            default:
                throw new IllegalStateException(
                        "Implementation register does know 'IHome' implementation for e-shop: " + shopName);
        }
        return home;
    }

    public static IProduct getProperProductImplementation(WebDriver webDriver) throws IllegalStateException {
        String shopName = TestContext.getScenarioShop(Thread.currentThread().getId()).getShopName();
        LOGGER.info("Try to find 'IProduct' implementation for: " + shopName );
        IProduct product;
        switch (shopName) {
            case "Datart":
                product = new DatartProduct(webDriver);
                break;
            case "Mall":
                product = new MallProduct(webDriver);
                break;
            default:
                throw new IllegalStateException(
                        "Implementation register does know 'IProduct' implementation for e-shop: " + shopName);
        }
        return product;
    }

    public static ICart getProperCartImplementation(WebDriver webDriver) throws IllegalStateException {
        String shopName = TestContext.getScenarioShop(Thread.currentThread().getId()).getShopName();
        LOGGER.info("Try to find 'ICart' implementation for: " + shopName );
        ICart cart;
        switch (shopName) {
            case "Datart":
                cart = new DatartCart(webDriver);
                break;
            case "Mall":
                cart = new MallCart(webDriver);
                break;
            default:
                throw new IllegalStateException(
                        "Implementation register does know 'ICart' implementation for e-shop: " + shopName);
        }
        return cart;
    }
}
