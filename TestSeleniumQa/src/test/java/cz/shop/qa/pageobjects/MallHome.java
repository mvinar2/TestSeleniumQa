package cz.shop.qa.pageobjects;

import org.openqa.selenium.WebDriver;

public class MallHome extends Page implements IHome {

    private final String propertyPrefix = "mall";
    private final String pageTitle = testProperties.getString(propertyPrefix + ".home_title");
    private String shopName = testProperties.getString(propertyPrefix + ".shop_name");
    private String homeUrl = testProperties.getString(propertyPrefix + ".home_url");

    public MallHome(WebDriver drv) {
        super(drv);
    }

    /**
     * Getter of shop name
     *
     * @return shop name
     */
    @Override
    public String getShopName() {
        return shopName;
    }

    /**
     * Getter of shop home page url
     *
     * @return shop home page url
     */
    @Override
    public String getHomeUrl() {
        return homeUrl;
    }

    /**
     * Getter of web expected page title
     * @return web expected page title
     */
    @Override
    public String getExpectedPageTitle() { return pageTitle; }

    /**
     * Setter of shop name
     *
     * @param shopName shop name
     */
    @Override
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * Setter of shop home page urk
     *
     * @param homeUrl shop home page url
     */
    @Override
    public void setHomeUrl(String homeUrl) {
        this.homeUrl = homeUrl;
    }

    /**
     * Access shop home page
     */
    @Override
    public void startAtHomePage() {
        drv.get(this.getHomeUrl());

    }

    /**
     * Agreed that some websites asking of confirming of usage cookies and GDPR This
     * method has to be implement as optional step, because not all websites always
     * asking for this agreement. Method whithout specific option represents default
     * behaviour, which depends on method implementation
     */
    @Override
    public void agreedCookiesAndGdpr() {

    }

    /**
     * Agreed that some websites asking of confirming of usage cookies and GDPR This
     * method has to be implement as optional step, because not all websites always
     * asking for this agreement.
     *
     * @param isMandatory is mandatory always confirm this aggrement
     */
    @Override
    public void agreedCookiesAndGdpr(boolean isMandatory) {

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
}
