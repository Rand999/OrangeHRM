package Testcases;

import Pages.P01_Login_Page;
import Pages.P02_Admin_Page;
import Pages.PageBase;
import Utility.Utilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_Admin extends Testbase{
static String username ;

    @Test(priority = 1,description = "Login to System with Valid Data")
    public void add_admin_P() throws InterruptedException {

        username = Utilities.getRandomFirstName();

        new PageBase(driver).Wait();
        new P02_Admin_Page(driver).click_admin_link();
        new PageBase(driver).Wait();

        new P02_Admin_Page(driver).click_add_button();
        new PageBase(driver).Wait();
        new P02_Admin_Page(driver).input_employee_name("a").input_username(username).input_password("Rndcump1$").input_confirm_password("Rndcump1$").select_user_role().select_status();
        new P02_Admin_Page(driver).click_save_button();
       // new PageBase(driver).Wait();

    }


    @Test(priority = 1,description = "search_by_admin_name")
    public void search_by_username_name_P() throws InterruptedException {



        new PageBase(driver).Wait();

        new PageBase(driver).Wait();
        new P02_Admin_Page(driver).click_admin_link();
        new PageBase(driver).Wait();
        new PageBase(driver).Wait();

        new P02_Admin_Page(driver).search_by_name(username).search();
        new PageBase(driver).scroll_down();
        //  Assert.assertEquals(new P01_Login_Page(driver).verify_url(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        //Assert.assertTrue(new P01_Login_Page(driver).verify_login_successfully(),"login faild");
    }




}
