package Testebay;

/**
 * Created by admin on 24.12.2015.
 */

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyTestEbay {
    private FirefoxDriver driver;
    private HomePage homePage;
    private SearchResultPage searchResultPage;
    private ProductDetailPage productDetailPage;
    private LoginPage loginPage;

    @Before
    public void precondition() {
        driver = new FirefoxDriver();
        homePage = new HomePage(driver);
        searchResultPage = new SearchResultPage(driver);
        productDetailPage = new ProductDetailPage(driver);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void TestEbay() {
        homePage.openHomePage()
                .enterSearchText("lightsaber")
                .clickSearchButton();
        searchResultPage.switchToBuyItNow()
                .openSomeItem();
        productDetailPage.switchDatItem();
        loginPage.areUseeIt();
    }

    @After
    public void postcondition() {
        driver.quit();
    }
}
