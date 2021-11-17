package utils;

public class AppConstant {
    public static final String USER_DIR = System.getProperty("user.dir") + "/";
    public static final String APP_PATH = USER_DIR + "apps/";
    public static final String SCREENSHOT_WEB = USER_DIR + "screenshots/";
    public static final String SCREENSHOT_MOBILE = USER_DIR + "screenshots/mobile/";
    private static final boolean OS_WINDOWS = System.getProperty("os.name").contains("Windows");
    public static final String CHROME_DRIVER_PATH = USER_DIR + "drivers/" + (OS_WINDOWS ? "chromedriver.exe" : "chromedriver");
    public static final String FIREFOX_DRIVER_PATH = USER_DIR + "drivers/" + (OS_WINDOWS ? "geckodriver.exe" : "geckodriver");
}
