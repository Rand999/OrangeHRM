package Testcases;

import Pages.P01_Login_Page;
import Pages.PageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_Login extends Testbase{

    @Test(priority = 1,description = "Login to System with Valid Data")
    public void Login_with_valid_data_P() throws InterruptedException {


        new PageBase(driver).Wait();
        new P01_Login_Page(driver).input_username("Admin")
                .input_password("admin123").click_login_button();
        new PageBase(driver).Wait();
        Assert.assertEquals(new P01_Login_Page(driver).verify_url(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
       //Assert.assertTrue(new P01_Login_Page(driver).verify_login_successfully(),"login faild");
    }


}
