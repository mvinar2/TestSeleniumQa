package cz.shop.qa.pageobjects;

import org.openqa.selenium.WebDriver;

public class MallProduct extends Page implements IProduct {

    public MallProduct(WebDriver drv) {
        super(drv);
    }

    /**
     * Navigate to specific product category specified by category name
     *
     * @param categoryName product category name
     * @throws IllegalStateException exception if category does not exist et given shop
     */
    @Override
    public void navigateToProductCategory(String categoryName) throws IllegalStateException {

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
        return false;
    }

    /**
     * Navigate to specific product 1st subcategory specified by subcategory name
     *
     * @param subCategoryName product 1st subcategory name
     * @throws IllegalStateException exception if subcategory does not exist at given shop
     */
    @Override
    public void navigateToProduct1stSubCategory(String subCategoryName) throws IllegalStateException {

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
        return false;
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
        return false;
    }
}
