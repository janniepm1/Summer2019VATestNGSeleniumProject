package com.cybertek.tests.D2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeAndQuit {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        //this two lines will be always be the same
        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");
        Thread.sleep(1000);
        driver.close();//if you close you cannot open again

        //this two lines will be always be the same
      driver=new ChromeDriver();
       driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(5000);
        driver.close();
        driver.quit();//will close everything
        //TODO close all open tabs

    }
}
