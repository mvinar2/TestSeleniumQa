package cz.shop.qa.pageobjects;

import org.openqa.selenium.WebDriver;

public class MallCart extends Page implements ICart {

    public MallCart(WebDriver drv) {
        super(drv);
    }

    /**
     * Navigate to shop cart
     */
    @Override
    public void navigateToCart() {

    }

    /**
     * Add 1st product item at list to cart
     */
    @Override
    public void addToCart1stProduct() {

    }

    /**
     * Check if cart contains expected number of products
     *
     * @param numberOfProducts expected number of product at cart
     * @return true if number matched else false
     */
    @Override
    public boolean isNumberOfProductAtCart(long numberOfProducts) {
        return false;
    }

    /**
     * Clean up all items from cart
     */
    @Override
    public void makeEmptyCart() {

    }
}
