package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P11_Maintenance {

    WebDriver driver;

    public P11_Maintenance(WebDriver driver) {
        this.driver = driver;
    }


    private final By LINK = By.xpath("//span[normalize-space()='Maintenance']");

    private final By PASS = By.xpath("//input[@name='password']");

    private final By CONFIRM = By.xpath("//button[@type='submit']");


    public P11_Maintenance click_link() {
        driver.findElement(this.LINK).click();
        return this;
    }

    public P11_Maintenance input_pass(String pass) {
        driver.findElement(this.PASS).sendKeys(pass);
        return this;
    }

    public P11_Maintenance confirm_button() {
        driver.findElement(this.CONFIRM).click();
        return this;
    }

    public String verify_url() {
        return   driver.getCurrentUrl();

    }

    public boolean verify_title(){
        return driver.findElement(By.xpath("//h6[normalize-space()='Maintenance']")).isDisplayed();
    }
}
