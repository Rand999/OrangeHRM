package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_Login_Page {

    WebDriver driver;

    public P01_Login_Page(WebDriver driver) {
        this.driver = driver;
    }


    private final By USERNAME = By.xpath("//input[@name='username']");
    private final By PASSWORD = By.xpath("//input[@name='password']");
    private final By LOGIN_BUTTON = By.xpath("//button[@type='submit']");




    public P01_Login_Page input_username(String user) {
        driver.findElement(this.USERNAME).sendKeys(user);
        return this;
    }
    public P01_Login_Page input_password(String pass) {
        driver.findElement(this.PASSWORD).sendKeys(pass);
        return this;
    }

    public P01_Login_Page click_login_button() {
        driver.findElement(this.LOGIN_BUTTON).click();
        return this;
    }

    public String verify_url() {
      return   driver.getCurrentUrl();

    }

    public boolean verify_login_successfully(){
        return driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed();
    }



}
