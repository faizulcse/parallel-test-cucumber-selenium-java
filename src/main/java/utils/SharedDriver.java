package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SharedDriver {
    public static WebDriver startDriver() {
        System.setProperty("webdriver.gecko.driver", AppConstant.FIREFOX_DRIVER_PATH);
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(false);
        WebDriver webDriver = new FirefoxDriver(options);
        webDriver.manage().window().maximize();
        webDriver.get("https://google.com");
        return webDriver;
    }

    public static void closeDriver(WebDriver webDriver) {
        webDriver.quit();
    }
}
