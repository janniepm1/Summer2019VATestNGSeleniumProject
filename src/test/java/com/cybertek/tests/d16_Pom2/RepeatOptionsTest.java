package com.cybertek.tests.d16_Pom2;

import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.pages.CalendarEventsPage;

import com.cybertek.pages.CreateCalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.CallTheFactory;
import com.cybertek.tests.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatOptionsTest extends TestBase {
    /*
    \Marufjon 4:26 PM
VERIFY RADIO BUTTONS
Open browser
Login as driver
Go to Activities —> Calenday Events
Click on crate calendar events
Click on repeat
Verify that repeat every days is checked
Verify that repeat weekday is not checked

     */
    @Test
    public void radioRepeatEveryRadioButtons(){
        LoginPage loginPage=new LoginPage();
        String username= ConfigurationReader.get("driver_username");
        String password= ConfigurationReader.get("driver_password");
        loginPage.login(username,password);

        DashboardPage dashboardPage= new DashboardPage();
        dashboardPage.navigateToModule("Activities","Calendar Events");
        //click on create calendar events

        CalendarEventsPage  calendarEventsPage=new CalendarEventsPage();

        calendarEventsPage.waitUntilLoaderScreenDisappear();
        calendarEventsPage.createCalendarEvent.click();
        //click on repeat

        CreateCalendarEventsPage createCalendarEventsPage=new CreateCalendarEventsPage();
        calendarEventsPage.waitUntilLoaderScreenDisappear();
      //  BrowserUtils.waitFor(1);
        createCalendarEventsPage.repeat.click();

        //verify that repeat every days is checked
        Assert.assertTrue(createCalendarEventsPage.days.isSelected(),"Repeat Every day(s) should be selected");
//verify that repeat weekday is nor checked
        Assert.assertFalse(createCalendarEventsPage.weekday.isSelected(),"Weekdays should not be selected");



    }
    @Test
    public void repeatOptionTest() {
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username, password);

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Activities", "Calendar Events");
        //click on create calendar events

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        calendarEventsPage.waitUntilLoaderScreenDisappear();
        calendarEventsPage.createCalendarEvent.click();
        //click on repeat

        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        //  BrowserUtils.waitFor(1);
        createCalendarEventsPage.repeat.click();

        List<String> expectedList= Arrays.asList("Daily","Weekly","Monthly","Yearly");
        List<WebElement> options =createCalendarEventsPage.repeatOptionsList().getOptions();
        List<String> aactualList=BrowserUtils.getElementsText(options);

        Assert.assertEquals(aactualList,expectedList,"Repeats Options does not match");


    }
}
