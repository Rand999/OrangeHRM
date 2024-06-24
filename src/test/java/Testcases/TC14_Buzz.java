package Testcases;

import Pages.P01_Login_Page;
import Pages.P12_Claim;
import Pages.P13_Buzz;
import Pages.PageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC14_Buzz extends Testbase{

    @Test(priority = 1,description = "Login to System with Valid Data")
    public void navigate_to_buzz_page_P() throws InterruptedException {


        new PageBase(driver).Wait();
        new P13_Buzz(driver).click_link();
        new PageBase(driver).Wait();
        Assert.assertEquals(new P13_Buzz(driver).verify_url(),"https://opensource-demo.orangehrmlive.com/web/index.php/buzz/viewBuzz");
       // Assert.assertTrue(new P13_Buzz(driver).verify_title(),"navegation faild");
    }
}
