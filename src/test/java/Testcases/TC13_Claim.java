package Testcases;

import Pages.P01_Login_Page;
import Pages.P12_Claim;
import Pages.PageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC13_Claim extends Testbase{


    @Test(priority = 1,description = "Login to System with Valid Data")
    public void navigate_to_claim_page_P() throws InterruptedException {


        new PageBase(driver).Wait();
        new P12_Claim(driver).click_link();
        new PageBase(driver).Wait();
        Assert.assertEquals(new P12_Claim(driver).verify_url(),"https://opensource-demo.orangehrmlive.com/web/index.php/claim/viewAssignClaim");
        Assert.assertTrue(new P12_Claim(driver).verify_title(),"navegation faild");
    }
}
