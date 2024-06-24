package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PageBase {


 WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }


    private final By SEARCH_BOX = By.xpath("//input[@id='small-searchterms']");





    public PageBase searchFunction(String keyword) {
        driver.findElement(this.SEARCH_BOX).sendKeys(keyword, Keys.ENTER);

        return this;
    }


    public String check_url() {
     return  driver.getCurrentUrl();
    }

    public PageBase scroll_down() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,360)", "");
        return this;
    }

    public PageBase Wait() throws InterruptedException {
        Thread.sleep(1300);
        return this;
    }



}
