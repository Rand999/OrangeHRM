package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P10_Directory {

    WebDriver driver;

    public P10_Directory(WebDriver driver) {
        this.driver = driver;
    }


    private final By LINK = By.xpath("//button[@type='submit']");




    public P10_Directory click_link() {
        driver.findElement(this.LINK).click();
        return this;
    }

    public String verify_url() {
        return   driver.getCurrentUrl();

    }

    public boolean verify_title(){
        return driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed();
    }
}
