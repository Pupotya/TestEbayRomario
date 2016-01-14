package Testebay;

/**
 * Created by admin on 24.12.2015.
 */

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyTestEbay {
    private FirefoxDriver driver;
    private HomePage homePage;

    @Before
    public void precondition() {
        driver = new FirefoxDriver();
        homePage = new HomePage(driver);
    }

    @Test
    public void TestEbay() {
        homePage.openHomePage()
                .enterSearchText("lightsaber")
                .clickSearchButton();
        searchResultPage.

        driver.findElement(By.cssSelector("[title=\"Buy It Now\"]")).click();
        driver.findElement(By.cssSelector("#item33af100a32>h3>a.vip")).click();
        driver.findElement(By.cssSelector("#binBtn_btn")).click();
        Assert.assertTrue(driver.findElement(By.id("sgnBt")).isDisplayed());
    }

    @After
    public void postcondition() {
        driver.quit();
    }
}
