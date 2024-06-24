package Testcases;

import Pages.P02_Admin_Page;
import Pages.P03_PIM_Page;
import Pages.PageBase;
import Utility.Utilities;
import org.testng.annotations.Test;

public class TC03_PIM extends Testbase{

static String f_name ;
static String m_name = Utilities.getRandomLasttName();
static String l_name = Utilities.getRandomLasttName();

    @Test(priority = 1,description = "add_pim")
    public void add_pim_P() throws InterruptedException {

        f_name = Utilities.getRandomFirstName();

        new PageBase(driver).Wait();

        new P03_PIM_Page(driver).click_pim_link();
        new PageBase(driver).Wait();

        new P03_PIM_Page(driver).click_add_button();

        new PageBase(driver).Wait();

        new  P03_PIM_Page(driver).input_f_name(f_name).input_m_name(m_name).input_l_name(l_name).input_id("1");
        new P03_PIM_Page(driver).save();
        new PageBase(driver).Wait();
        //  Assert.assertEquals(new P01_Login_Page(driver).verify_url(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        //Assert.assertTrue(new P01_Login_Page(driver).verify_login_successfully(),"login faild");
    }



    @Test(priority = 1,description = "search_by_employee_name")
    public void search_by_employee_name_P() throws InterruptedException {


        new PageBase(driver).Wait();

        new P03_PIM_Page(driver).click_pim_link();
        new PageBase(driver).Wait();
        new PageBase(driver).Wait();
        new PageBase(driver).Wait();
        new P03_PIM_Page(driver).click_pim_link();
        new PageBase(driver).Wait();
        new PageBase(driver).Wait();
       new P03_PIM_Page(driver).search_by_name(f_name);
       new P03_PIM_Page(driver).search();

       new PageBase(driver).scroll_down();

        //  Assert.assertEquals(new P01_Login_Page(driver).verify_url(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        //Assert.assertTrue(new P01_Login_Page(driver).verify_login_successfully(),"login faild");
    }


}
