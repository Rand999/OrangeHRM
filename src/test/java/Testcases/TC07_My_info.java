package Testcases;

import Pages.P01_Login_Page;
import Pages.P07_My_info;
import Pages.PageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC07_My_info extends Testbase{

    @Test(priority = 1,description = "Login to System with Valid Data")
    public void navigate_to_myinfo_page_P() throws InterruptedException {


        new PageBase(driver).Wait();
        new P07_My_info(driver).click_link();
        new PageBase(driver).Wait();
       // Assert.assertEquals(new P07_My_info(driver).verify_url(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        Assert.assertTrue(new P07_My_info(driver).verify_title(),"navegation faild");
    }
}
