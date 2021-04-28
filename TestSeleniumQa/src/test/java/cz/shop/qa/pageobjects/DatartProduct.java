package cz.shop.qa.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class DatartProduct extends Page implements IProduct {

    private static final Logger LOGGER = Logger.getLogger(DatartProduct.class.getName());

    private final static List<String> supportedSorting = Arrays.asList("PRICE_DESC", "PRICE_ASC");

    public DatartProduct(WebDriver drv) {
        super(drv);
    }

    /**
     * PRIVATE helper method for checking supported products sort options
     * @param sortCriteria sort criteria
     * @throws IllegalStateException if sort criteria does NOT match with supported criteria
     */
    private void checkSupportedProductSorting(String sortCriteria) throws IllegalStateException {
        if (!supportedSorting.contains(sortCriteria)) {
            String errMsg = "No supported sorting: " + sortCriteria + " Supported values: " + supportedSorting;
            LOGGER.warning(errMsg);
            throw new IllegalStateException(errMsg);
        }
    }

    /**
     * Navigate to specific product category specified by category name
     *
     * @param categoryName product category name
     * @throws IllegalStateException exception if category does not exist et given shop
     */
    @Override
    public void navigateToProductCategory(String categoryName) throws IllegalStateException {
        drv.findElement(By.cssSelector("a[title='" + categoryName + "']")).click();


    }

    /**
     * Check if web browser simulation is currently stay at expected product category
     *
     * @param categoryName product category
     * @return true if category matching else false
     * @throws IllegalStateException exception if category name is not valid for example: empty string
     */
    @Override
    public boolean isStayAtProductCategory(String categoryName) throws IllegalStateException {
        String category = drv.findElement(By.cssSelector("h1")).getText();
        return category.equals(categoryName);
    }

    /**
     * Navigate to specific product 1st subcategory specified by subcategory name
     *
     * @param subCategoryName product 1st subcategory name
     * @throws IllegalStateException exception if subcategory does not exist at given shop
     */
    @Override
    public void navigateToProduct1stSubCategory(String subCategoryName) throws IllegalStateException {
        drv.findElement(By.linkText(subCategoryName)).click();
    }

    /**
     * Check if web browser simulation is currently stay at expected product 1st
     * subcategory
     *
     * @param subCategoryName product 1st subcategory
     * @return true if subcategory matching else false
     * @throws IllegalStateException exception if subcategory name is not valid for example: empty
     *                               string
     */
    @Override
    public boolean isStayAtProduct1stSubCategory(String subCategoryName) throws IllegalStateException {
        String category = drv.findElement(By.cssSelector("h1")).getText();
        return category.contains(subCategoryName);
    }

    /**
     * Sort products list by sort criteria
     *
     * @param sortCriteria sort criteria
     * @throws IllegalStateException rise if shop not support sorting or invalid sort criteria. Detail
     *                               of behaviour depends shop test implementation.
     */
    @Override
    public void sortProductsBy(String sortCriteria) throws IllegalStateException {
        checkSupportedProductSorting(sortCriteria);
        this.waitForPageLoad();
        WebElement sortSelect = drv.findElement(
                By.xpath("//*[@id=\"category-items\"]/div[2]/div[2]/div[1]/div/div/div/label/select"));
        new Select(sortSelect).selectByValue(sortCriteria);
        sortSelect.sendKeys(Keys.ENTER);
        this.waitForPageLoad();
    }

    /**
     * Check if web simulation properly sorted products
     *
     * @param sortCriteria sort criteria
     * @return tru is products have sorted else false
     * @throws IllegalStateException rise if shop not support sorting or invalid sort criteria. Detail
     *                               of behaviour depends shop test implementation.
     */
    @Override
    public boolean isProductsProperlySorted(String sortCriteria) throws IllegalStateException {
        checkSupportedProductSorting(sortCriteria);
        this.forceSleep(5000);
        this.waitForPageLoad();
        Select selectedSortCriteria = new Select(
                drv.findElement(
                        By.xpath("//*[@id=\"category-items\"]/div[2]/div[2]/div[1]/div/div/div/label/select")));
        return selectedSortCriteria.getFirstSelectedOption().getAttribute("value").equals(sortCriteria);
    }
}
