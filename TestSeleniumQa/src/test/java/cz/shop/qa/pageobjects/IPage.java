package cz.shop.qa.pageobjects;

public interface IPage {

    /**
     * Getter of web real page title
     * @return web real page title
     */
    public String getPageTitle();

    /**
     * Take web page screenshot
     * @return page screenshot
     */
    public byte [] takePageScreenShot();
}
