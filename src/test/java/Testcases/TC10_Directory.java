package Testcases;

import Pages.P01_Login_Page;
import Pages.PageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC10_Directory extends Testbase{

    @Test(priority = 1,description = "Login to System with Valid Data")
    public void navigate_to_directry_page_P() throws InterruptedException {


        new PageBase(driver).Wait();
        Assert.assertEquals(new P01_Login_Page(driver).verify_url(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        Assert.assertTrue(new P01_Login_Page(driver).verify_login_successfully(),"login faild");
    }
}
