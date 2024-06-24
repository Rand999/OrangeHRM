package Testcases;

import Pages.P01_Login_Page;
import Pages.P08_Performance;
import Pages.PageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC08_Performance extends Testbase{

    @Test(priority = 1,description = "Login to System with Valid Data")
    public void navigate_to_performance_page_P() throws InterruptedException {


        new PageBase(driver).Wait();
        new P08_Performance(driver).click_link();
        new PageBase(driver).Wait();
        Assert.assertEquals(new P08_Performance(driver).verify_url(),"https://opensource-demo.orangehrmlive.com/web/index.php/performance/searchEvaluatePerformanceReview");
        Assert.assertTrue(new P08_Performance(driver).verify_title(),"navegation faild");
    }
}
