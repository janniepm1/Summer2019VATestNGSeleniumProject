package com.cybertek.tests.d15_page_object_model_base_test;

import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTest extends TestBase {

    @Test
    public void WrongPassTest(){

        driver.get(url);

        LoginPage loginPage=new LoginPage();
        loginPage.userName.sendKeys("salesmanager101");
        loginPage.password.sendKeys("greatpassword");
    loginPage.submit.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa2.vytrack.com/user/login");

    }
@Test
    public void WrongUsernameTest(){
        LoginPage loginpage=new LoginPage();
        loginpage.userName.sendKeys("superadmin");
        loginpage.password.sendKeys("UserUser123");
        loginpage.submit.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa2.vytrack.com/user/login");
}
}
