package Testebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by admin on 12.01.2016.
 */
public class SearchResultPage {

    private WebDriver driver;


    private final By buyItNowSwitcher = By.cssSelector("[title=\"Buy It Now\"]");
    private final By someItem = By.cssSelector("h3.lvtitle>a");

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public SearchResultPage switchToBuyItNow() {
        driver.findElement(buyItNowSwitcher).click();
        return this;
    }

    public SearchResultPage openSomeItem() {
        driver.findElement(someItem).click();
        return this;
    }
}
