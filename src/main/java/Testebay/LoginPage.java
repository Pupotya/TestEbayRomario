package Testebay;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by admin on 12.01.2016.
 */
public class LoginPage {

    private WebDriver driver;

    private final By jke = By.id("sgnBt");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage areUseeIt() {
        Assert.assertTrue(driver.findElement(jke).isDisplayed());
        return this;
    }
}

