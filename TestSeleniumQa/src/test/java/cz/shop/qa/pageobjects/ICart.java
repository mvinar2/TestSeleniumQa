package cz.shop.qa.pageobjects;

/**
 * General interface for shop cart page
 * @author vinar.marek@gmail.com
 */
public interface ICart extends IPage {
    /**
     * Navigate to shop cart
     */
    public void navigateToCart();

    /**
     * Add 1st product item at list to cart
     */
    public void addToCart1stProduct();

    /**
     * Check if cart contains expected number of products
     * @param numberOfProducts expected number of product at cart
     * @return true if number matched else false
     */
    public boolean isNumberOfProductAtCart(long numberOfProducts);

    /**
     * Clean up all items from cart
     */
    public void makeEmptyCart();

}
