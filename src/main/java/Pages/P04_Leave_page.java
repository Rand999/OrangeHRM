package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_Leave_page {
    WebDriver driver;

    public P04_Leave_page(WebDriver driver) {
        this.driver = driver;
    }


    private final By LINK = By.xpath("//span[normalize-space()='Leave']");




    public P04_Leave_page click_link() {
        driver.findElement(this.LINK).click();
        return this;
    }
    public String verify_url() {
        return   driver.getCurrentUrl();

    }

    public boolean verify_title(){
        return driver.findElement(By.xpath("//h6[normalize-space()='Leave']")).isDisplayed();
    }

}
