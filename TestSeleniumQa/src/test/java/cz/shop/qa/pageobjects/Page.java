package cz.shop.qa.pageobjects;

import java.util.ResourceBundle;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page  implements IPage {

    public static ResourceBundle testProperties = ResourceBundle.getBundle("tests");

    public WebDriver drv;

    public WebDriverWait wait;

    public Page(WebDriver drv) {
        this.drv = drv;
        this.wait = new WebDriverWait(drv, 10);
        PageFactory.initElements(drv, this);
    }

    /**
     * Getter of web page title
     *
     * @return web page title
     */
    @Override
    public String getPageTitle() {
        return drv.getTitle();
    }

    /**
     * Take web page screenshot
     *
     * @return page screenshot
     */
    @Override
    public byte[] takePageScreenShot() {
        return ((TakesScreenshot) drv).getScreenshotAs(OutputType.BYTES);
    }

    public void waitForPageLoad() {
        ExpectedCondition<Boolean> pageLoadCondition = driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState")
                                                                                              .equals("complete");
        WebDriverWait wait = new WebDriverWait(drv, 30);
        wait.until(pageLoadCondition);
    }

    public void tryClickWithTimeOut(By webElementBy, long timeOut, int sleepTime) {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + timeOut;
        while(true) {
            try {
                drv.findElement(webElementBy).click();
                break;
            } catch (Exception clickException) {
                if(System.currentTimeMillis() > endTime) {
                    throw clickException;
                }
                this.forceSleep(sleepTime);
            }
        }
    }

    public void forceSleep(long sleepMills) {
        try {
            Thread.sleep(sleepMills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
