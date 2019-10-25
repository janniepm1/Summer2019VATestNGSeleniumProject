package com.cybertek.tests;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallTheFactory {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("https:google.com");
        WebDriver driver2 = WebDriverFactory.getDriver("Firefox");


    }
}
