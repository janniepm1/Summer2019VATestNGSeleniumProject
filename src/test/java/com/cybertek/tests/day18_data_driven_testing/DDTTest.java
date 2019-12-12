package com.cybertek.tests.day18_data_driven_testing;

import com.cybertek.Utilities.ExcelUtil;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTTest extends TestBase {
    @DataProvider()
    public Object[] [] userList(){
        //read from excel in 2d array format
        ExcelUtil qa3Short= new ExcelUtil("src/test/resources/Vytrack testusers.xlsx","QA3-short");
        String [][] dataArray= qa3Short.getDataArray();
        //return 2nd arrays
        return dataArray;
    }
    @Test(dataProvider = "userList")
    public void test(String execute, String username, String password, String firstname, String lastname){
        extentLogger=report.createTest("testing"+firstname+ " "+lastname);
        //login using excel data
        LoginPage loginPage=new LoginPage();

        loginPage.login(username,password);

        //get the actual
        String actualName=new DashboardPage().getUserName();

        //expected comes from the excel data
        String expected=firstname+" "+lastname;

        Assert.assertEquals(actualName,expected);
        //we are ignoring the variable execute
    }
}
