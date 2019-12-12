package com.cybertek.tests.o3_pom;

import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.annotations.Test;

public class VerifyContactInformationTest extends TestBase {


    @Test
    public void contactDetailsTest(){
        //add this test to the extend report
        extentLogger=report.createTest("contact details test");

        // and login
        extentLogger.info("Login");
        LoginPage loginPage=new LoginPage();
        String username= ConfigurationReader.get("sales_manager");
        String password= ConfigurationReader.get("sales_manager_password");
        extentLogger.info("username: "+username);
        extentLogger.info("password: "+password);
        loginPage.login(username,password);
    }
}
