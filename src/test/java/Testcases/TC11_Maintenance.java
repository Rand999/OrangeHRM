package Testcases;

import Pages.P01_Login_Page;
import Pages.P11_Maintenance;
import Pages.PageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC11_Maintenance extends Testbase{

    @Test(priority = 1,description = "Login to System with Valid Data")
    public void navigate_to_maintenance_page_P() throws InterruptedException {


        new PageBase(driver).Wait();
        new P11_Maintenance(driver).click_link();
        new PageBase(driver).Wait();
        new P11_Maintenance(driver).input_pass("admin123").confirm_button();
        Assert.assertEquals(new P11_Maintenance(driver).verify_url(),"https://opensource-demo.orangehrmlive.com/web/index.php/maintenance/purgeEmployee");
      //  Assert.assertTrue(new P11_Maintenance(driver).verify_title(),"navegation faild");
    }
}
