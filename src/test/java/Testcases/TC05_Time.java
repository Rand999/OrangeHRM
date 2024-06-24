package Testcases;

import Pages.P01_Login_Page;
import Pages.P05_Time_page;
import Pages.PageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC05_Time extends Testbase{

    @Test(priority = 1,description = "Login to System with Valid Data")
    public void navigate_to_time_page_P() throws InterruptedException {


        new PageBase(driver).Wait();
        new P05_Time_page(driver).click_link();
        new PageBase(driver).Wait();
        Assert.assertEquals(new P05_Time_page(driver).verify_url(),"https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet");
        Assert.assertTrue(new P05_Time_page(driver).verify_title(),"login faild");
    }
}
