package Testcases;

import Pages.P01_Login_Page;
import Pages.P05_Time_page;
import Pages.P06_Recruitment;
import Pages.PageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC06_Recruitment extends Testbase{

    @Test(priority = 1,description = "Login to System with Valid Data")
    public void navigate_to_recruitment_page_P() throws InterruptedException {


        new PageBase(driver).Wait();
        new P06_Recruitment(driver).click_link();
        new PageBase(driver).Wait();
        Assert.assertEquals( new P06_Recruitment(driver).verify_url(),"https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates");
        Assert.assertTrue( new P06_Recruitment(driver).verify_title(),"navegation faild");
    }
}
