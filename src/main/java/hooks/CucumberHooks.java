package hooks;

import drivers.DriverSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CucumberHooks {
    public static WebDriver driver = null;

   @Before(order = 0)
    public void initialSetUp() {
        driver = DriverSetup.driverSetup();
    }

    @Before(order = 1)
    public void addImplicitWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void closeBrowserTab() {
        driver.close();
    }
}
