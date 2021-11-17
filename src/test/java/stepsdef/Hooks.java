package stepsdef;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.SharedDriver;

public class Hooks extends SharedDriver {
    WebDriver webDriver;

    @Before
    public void setUp() {
        webDriver = SharedDriver.startDriver();
    }

    @After
    public void tearDown() {
        SharedDriver.closeDriver(webDriver);
    }
}
