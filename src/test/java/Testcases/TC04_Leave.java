package Testcases;

import Pages.P01_Login_Page;
import Pages.P04_Leave_page;
import Pages.PageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC04_Leave extends Testbase{

    @Test(priority = 1,description = "Login to System with Valid Data")
    public void navigate_to_leave_page_P() throws InterruptedException {


        new PageBase(driver).Wait();
        new P04_Leave_page(driver).click_link();
        new PageBase(driver).Wait();
        Assert.assertEquals(new P01_Login_Page(driver).verify_url(),"https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");
        Assert.assertTrue(new P04_Leave_page(driver).verify_title(),"navegation faild");
    }
}
