package com.cybertek.tests.d16_Pom2;

import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitleTest extends TestBase {
    @Test
    public void verifySubtitleTest(){
        LoginPage loginpage=new LoginPage();
        String username= ConfigurationReader.get("driver_username");
        String password=ConfigurationReader.get("driver_password");

        loginpage.login(username,password);

        DashboardPage dashBoardPage=new DashboardPage();
       String actual=dashBoardPage.getPageSubTitle();

        Assert.assertEquals(actual,"Quick Launchpad");

    }
}
