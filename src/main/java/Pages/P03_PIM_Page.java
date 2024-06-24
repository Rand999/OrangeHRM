package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_PIM_Page {

    WebDriver driver;

    public P03_PIM_Page(WebDriver driver) {
        this.driver = driver;
    }

    private final By PIM_LINK = By.xpath("//span[normalize-space()='PIM']");

    private final By ADD_PIM_BUTTON = By.xpath("//button[normalize-space()='Add']");



    private final By F_NAME = By.xpath("//input[@name='firstName']");

    private final By M_NAME = By.xpath("//input[@name='middleName']");

    private final By L_NAME = By.xpath("//input[@name='lastName']");

    private final By EMPLOYEE_ID = By.xpath("//input[@class='oxd-input oxd-input--active']");
    private final By SAVE_BUTTON = By.xpath("//button[@type='submit']");

    private final By SEARCHED_NAME = By.xpath("//input[@placeholder='Type for hints...']");

    private final By SEARCHE_BUTTON = By.xpath("//button[@type='submit']");

    public P03_PIM_Page click_pim_link() {
        driver.findElement(this.PIM_LINK).click();
        return this;
    }
    public P03_PIM_Page click_add_button( ) {
        driver.findElement(this.ADD_PIM_BUTTON).click();
        return this;
    }

    public P03_PIM_Page input_f_name(String fname) {
        driver.findElement(this.F_NAME).sendKeys(fname);
        return this;
    }

    public P03_PIM_Page input_m_name(String mname) {
        driver.findElement(this.M_NAME).sendKeys(mname);
        return this;
    }

    public P03_PIM_Page input_l_name(String lname) {
        driver.findElement(this.L_NAME).sendKeys(lname);
        return this;
    }


    public P03_PIM_Page input_id(String id) {
        driver.findElement(this.EMPLOYEE_ID).sendKeys(id);
        return this;
    }

    public P03_PIM_Page search_by_name(String fname) {
        driver.findElement(this.SEARCHED_NAME).sendKeys(fname);
        return this;
    }

    public P03_PIM_Page search() {
        driver.findElement(this.SEARCHE_BUTTON).click();
        return this;
    }



    public P03_PIM_Page save() {
        driver.findElement(this.SAVE_BUTTON).click();
        return this;
    }


    public P03_PIM_Page navegate_to_pim() {
        driver.findElement(this.PIM_LINK).click();
        return this;
    }


    public String verify_url() {
        return   driver.getCurrentUrl();

    }

    public boolean verify_login_successfully(){
        return driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed();
    }

}
