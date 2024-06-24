package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P06_Recruitment {

    WebDriver driver;

    public P06_Recruitment(WebDriver driver) {
        this.driver = driver;
    }


    private final By LINK = By.xpath("//span[normalize-space()='Recruitment']");




    public P06_Recruitment click_link() {
        driver.findElement(this.LINK).click();
        return this;
    }

    public String verify_url() {
        return   driver.getCurrentUrl();

    }

    public boolean verify_title(){
        return driver.findElement(By.xpath("//h6[normalize-space()='Recruitment']")).isDisplayed();
    }

}
