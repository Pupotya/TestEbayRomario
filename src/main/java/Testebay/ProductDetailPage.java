package Testebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by admin on 12.01.2016.
 */
public class ProductDetailPage {

    private WebDriver driver;

    private final By ololo = By.id("binBtn_btn");

    public ProductDetailPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductDetailPage switchDatItem() {
        driver.findElement(ololo).click();
        return this;
    }
}
