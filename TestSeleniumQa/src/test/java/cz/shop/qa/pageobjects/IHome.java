package cz.shop.qa.pageobjects;

/**
 * General interface for shop home page
 * @author vinar.marek@gmail.com
 */
public interface IHome extends IPage {

    /**
     * Getter of shop name
     *
     * @return schop name
     */
    public String getShopName();

    /**
     * Setter of shop name
     *
     * @param shopName
     *            shop name
     */
    public void setShopName(String shopName);

    /**
     * Getter of shop home page url
     *
     * @return shop home page url
     */
    public String getHomeUrl();

    /**
     * Setter of shop home page urk
     *
     * @param homeUrl
     *            shop home page url
     */
    public void setHomeUrl(String homeUrl);

    /**
     * Getter of web expected page title defined at property file
     * @return web expected page title
     */
    public String getExpectedPageTitle();

    /**
     * Access shop home page
     */
    public void startAtHomePage();

    /**
     * Agreed that some websites asking of confirming of usage cookies and GDPR This
     * method has to be implement as optional step, because not all websites always
     * asking for this agreement. Method whithout specific option represents default
     * behaviour, which depends on method implementation
     */
    public void agreedCookiesAndGdpr();

    /**
     * Agreed that some websites asking of confirming of usage cookies and GDPR This
     * method has to be implement as optional step, because not all websites always
     * asking for this agreement.
     *
     * @param isMandatory
     *            is mandatory always confirm this aggrement
     */
    public void agreedCookiesAndGdpr(boolean isMandatory);

    /**
     * Navigate to specific product category specified by category name
     * @param categoryName product category name
     * @throws IllegalStateException exception if category does not exist et given shop
     */
    public void navigateToProductCategory(String categoryName) throws IllegalStateException;

    /**
     * Check if web browser simulation is currently stay at expected product category
     * @param categoryName product category
     * @return true if category matching else false
     * @throws IllegalStateException exception if category name is not valid for example: empty string
     */
    public boolean isStayAtProductCategory(String categoryName) throws IllegalStateException;

}
