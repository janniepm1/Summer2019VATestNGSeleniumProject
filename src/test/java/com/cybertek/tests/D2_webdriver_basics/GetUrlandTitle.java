package com.cybertek.tests.D2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlandTitle {
    public static void main(String[] args) {
        //setup chrome driver
        WebDriverManager.chromedriver().setup();
        //open Chrome driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.jetbrains.com/idea/download/");
        //get the title of the page
        String title = driver.getTitle();
        System.out.println("title=" + title); //practice

        //getgetcurretnurl==gets url from page
        String url = driver.getCurrentUrl();
        System.out.println("url= " + url);

        //get page source
        String pageSource = driver.getPageSource();
        System.out.println("PageSource = " + pageSource);

    }
}
