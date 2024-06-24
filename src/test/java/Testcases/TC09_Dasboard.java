package Testcases;

import Pages.P01_Login_Page;
import Pages.P09_Dashboard;
import Pages.PageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC09_Dasboard extends Testbase{
    @Test(priority = 1,description = "Login to System with Valid Data")
    public void navigate_to_dashboard_page_P() throws InterruptedException {


        new PageBase(driver).Wait();
        new P09_Dashboard(driver).click_link();
        Assert.assertEquals(new P09_Dashboard(driver).verify_url(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        //Assert.assertTrue(new P09_Dashboard(driver).verify_title(),"navegation faild");
    }
}
