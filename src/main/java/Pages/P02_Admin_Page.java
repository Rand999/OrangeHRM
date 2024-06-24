package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class P02_Admin_Page {

    WebDriver driver;

    public P02_Admin_Page(WebDriver driver) {
        this.driver = driver;
    }

    private final By ADMIN_LINK = By.xpath("//span[normalize-space()='Admin']");

    private final By ADD_ADMIN_BUTTON = By.xpath("//button[normalize-space()='Add']");

    private final By SELECT_USER_ROLE = By.xpath("(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[1]");

    private final By SELECT_STATUS = By.xpath("(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[1]");

    private final By EMPLOYEE_NAME = By.xpath("//input[@placeholder='Type for hints...']");

    private final By USERNAME = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By PASSWORD = By.xpath("(//input[@type='password'])[1]");

    private final By CONFIRM_PASS = By.xpath("(//input[@type='password'])[2]");

    private final By SAVE_BUTTON = By.xpath("//button[@type='submit']");


    private final By SEARCHED_NAME = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");

    private final By SEARCHE_BUTTON = By.xpath("//button[@type='submit']");



    public P02_Admin_Page click_admin_link() {
        driver.findElement(this.ADMIN_LINK).click();
        return this;
    }
    public P02_Admin_Page click_add_button( ) {
        driver.findElement(this.ADD_ADMIN_BUTTON).click();
        return this;
    }

    public P02_Admin_Page select_user_role() throws InterruptedException {
        driver.findElement(this.SELECT_USER_ROLE).click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        return this;
    }

    public P02_Admin_Page input_employee_name(String em_name) throws InterruptedException {
        driver.findElement(this.EMPLOYEE_NAME).sendKeys(em_name);
        Thread.sleep(5000);
        Actions actions1 = new Actions(driver);
        actions1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        return this;
    }



   /* public P02_Admin_Page action_employee_name() throws InterruptedException {

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        Thread.sleep(5000);
        return this;
    }*/


    public P02_Admin_Page select_status() throws InterruptedException {
        driver.findElement(this.SELECT_STATUS).click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        Thread.sleep(5000);
        return this;
    }


    public P02_Admin_Page input_username(String user) {
        driver.findElement(this.USERNAME).sendKeys(user);
        return this;
    }


    public P02_Admin_Page input_password(String pass) {
        driver.findElement(this.PASSWORD).sendKeys(pass);
        return this;
    }


    public P02_Admin_Page input_confirm_password(String pass) {
        driver.findElement(this.CONFIRM_PASS).sendKeys(pass);
        return this;
    }

    public P02_Admin_Page click_save_button() {
        driver.findElement(this.SAVE_BUTTON).click();
        return this;
    }
    public P02_Admin_Page search_by_name(String fname) {
        driver.findElement(this.SEARCHED_NAME).sendKeys(fname);
        return this;
    }

    public P02_Admin_Page search() {
        driver.findElement(this.SEARCHE_BUTTON).click();
        return this;
    }


    public String verify_url() {
        return   driver.getCurrentUrl();

    }

    public boolean verify_login_successfully(){
        return driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed();
    }

}
