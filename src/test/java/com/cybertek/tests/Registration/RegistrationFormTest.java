package com.cybertek.tests.Registration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationFormTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //we must create webdriver objects first,
        //before any interactions
        WebDriver driver=new ChromeDriver();
        //to open a website
        driver.get("http://practice.cybertekschool.com");



    }
}
