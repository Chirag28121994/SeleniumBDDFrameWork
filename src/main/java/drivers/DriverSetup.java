package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import utils.PropertiesReader;

public class DriverSetup {

    public static WebDriver driverSetup(){
        new PropertiesReader();
        if (PropertiesReader.getBrowser().equalsIgnoreCase("chrome")){
            return setUpChromeDriver();
        } else if (PropertiesReader.getBrowser().equalsIgnoreCase("safari")){
            return setUpSafariDriver();
        } else return null;
    }
    private static WebDriver setUpChromeDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(chromeOptions);
    }

    private static WebDriver setUpSafariDriver() {
        SafariOptions safariOptions = new SafariOptions();
        WebDriverManager.safaridriver().setup();
        return new SafariDriver(safariOptions);
    }

    private static void setUpChromeDriver(WebDriver driver, String version) {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().browserVersion(version).setup();
        driver = new ChromeDriver();
    }

    private static void setUpSafariDriver(WebDriver driver, String version) {
        SafariOptions safariOptions = new SafariOptions();
        WebDriverManager.safaridriver().browserVersion(version).setup();
        driver = new SafariDriver();
    }
}

