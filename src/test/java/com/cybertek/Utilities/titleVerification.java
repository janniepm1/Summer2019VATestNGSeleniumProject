package com.cybertek.Utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class titleVerification {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("http://practice.cybertekschool.com/");
        list.add("http://practice.cybertekschool.com/dropdown");
        list.add("http://practice.cybertekschool.com/login");
//set up webdriver
        WebDriverManager.chromedriver().setup();
        //go to chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
       // Thread.sleep(2000);
        String title1 = driver.getTitle();
        driver.close();
        driver.get("http://practice.cybertekschool.com/dropdown");
        String title2 = driver.getTitle();
        driver.close();
        driver.get("http://practice.cybertekschool.com/login");
        String title3 = driver.getTitle();
        driver.quit();


        if (title1.contains("http://practice.cybertekschool.com.") && title2.contains("http://practice.cybertekschool.com. ") &&
                title3.contains("http://practice.cybertekschool.com. ")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }


    }
}
