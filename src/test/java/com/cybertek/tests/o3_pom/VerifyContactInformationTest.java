package com.cybertek.tests.o3_pom;

import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.pages.ContactInformationPage;
import com.cybertek.pages.ContactsPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
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

        //go to costumers then contacts
        extentLogger.info("Go to costumers -> contacts");
        ContactsPage contactsPage =new ContactsPage();
        contactsPage.navigateToModule("Customers","Contacts");

        //click con email
        extentLogger.info("Click on email mbrackstone9@example.com");
        //wait before click on email
        contactsPage.waitUntilLoaderScreenDisappear();
        contactsPage.getContantEmail("mbrackstone9@example.com").click();
//verify
        ContactInformationPage contactInformationPage=new ContactInformationPage();
        extentLogger.info("Verify that full name is Ms Mariam Brackstone");

        String actualName = contactInformationPage.contactFullname.getText();
        Assert.assertEquals("Ms Mariam Brackstone",actualName);
        //verify phoneNumber
        extentLogger.info("Verify that phone number is 18982323434");

        String actualPhone= contactInformationPage.phone.getText();
        Assert.assertEquals(actualPhone,"+18982323434");

        String actualEmail= contactInformationPage.email.getText();
        Assert.assertEquals(actualEmail,"mbrackstone9@example.com");

    }
}
