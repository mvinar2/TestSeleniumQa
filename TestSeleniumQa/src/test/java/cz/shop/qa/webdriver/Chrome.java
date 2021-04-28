package cz.shop.qa.webdriver;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.logging.Level;

public class Chrome extends Browser {
    protected Chrome(String driverPath) throws RuntimeException {
        System.setProperty("webdriver.chrome.driver", driverPath);

        LoggingPreferences pref = new LoggingPreferences();
        pref.enable(LogType.BROWSER, Level.OFF);
        pref.enable(LogType.DRIVER, Level.OFF);
        pref.enable(LogType.PERFORMANCE, Level.OFF);

        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--start-maximized", "--incognito", "--headless");
        options.addArguments("--start-maximized", "--incognito");

        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
        desiredCapabilities.setCapability(CapabilityType.LOGGING_PREFS, pref);
        desiredCapabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, options);

        driver = new ChromeDriver(desiredCapabilities);
    }
}
