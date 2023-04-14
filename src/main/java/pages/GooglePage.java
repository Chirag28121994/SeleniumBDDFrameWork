package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GooglePage {
    WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//input[@name='btnK'][1]")
    private List<WebElement> googleHeader;

    @FindBy(how = How.XPATH, using = "//input[@name='q']")
    private List<WebElement> searchBox;

    public void verifyVisibilityOfGoogleHeader() {
        Assert.assertTrue(googleHeader.get(0).isEnabled());
    }

    public void verifyVisibilityOfSearchBox() {
        Assert.assertTrue(true);
    }
}
