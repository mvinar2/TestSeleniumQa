package cz.shop.qa.pageobjects;
import java.util.List;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatartCart extends Page implements ICart {


    private static final Logger LOGGER = Logger.getLogger(DatartCart.class.getName());
    private final String propertyPrefix = "datart";
    private final String cartUrl = testProperties.getString(propertyPrefix + ".home_url") + "/kosik";

    @FindBy(css = "div[class='product___2CV_E']")
    List<WebElement> cartProducts;

    public DatartCart(WebDriver drv) {
        super(drv);
    }

    /**
     * Navigate to shop cart
     */
    @Override
    public void navigateToCart() {
        LOGGER.info("Move to Datart cart");
        drv.get(this.cartUrl);
    }

    /**
     * Add 1st product item at list to cart
     */
    @Override
    public void addToCart1stProduct() {
        this.tryClickWithTimeOut(

                //*[@id="buyButton-1557305"]
                By.xpath("//*[contains(@id,'buyButton-')]"),
                10000,
                1000);
        // Waite here 10 sec soume time shop is responding really slow
        // TODO: add here some polling instead hard sleep
        this.forceSleep(10000);
    }

    /**
     * Check if cart contains expected number of products
     *
     * @param numberOfProducts expected number of product at cart
     * @return true if number matched else false
     */
    @Override
    public boolean isNumberOfProductAtCart(long numberOfProducts) {
        // Waite here 10 sec soume time shop is responding really slow
        // TODO: add here some polling instead hard sleep
        this.forceSleep(10000);
        return cartProducts.size() == numberOfProducts;
    }

    /**
     * Clean up all items from cart
     */
    @Override
    public void makeEmptyCart() {
        try {
            this.tryClickWithTimeOut(
                    By.linkText("Zahodit košík"),
                    10000,
                    1000);
        } catch (UnhandledAlertException f) {
            try {
                f.printStackTrace();
                drv.switchTo().alert().accept();
            } catch (NoAlertPresentException e) {
                e.printStackTrace();
            }
        }
    }
}
