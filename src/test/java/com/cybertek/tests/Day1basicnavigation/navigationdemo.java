package com.cybertek.tests.Day1basicnavigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationdemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://cybertekschool.com/");
        System.out.println(driver.getTitle());
        //this is not selenium, it is from java
        //it pauses the program
        Thread.sleep(1000);
        driver.navigate().to("https://amazon.com/");
        System.out.println(driver.getTitle());

         Thread.sleep(1000);
         driver.navigate().back();
        System.out.println(driver.getTitle());

        Thread.sleep(1000);
        driver.navigate().forward();
        System.out.println(driver.getTitle());


    }

}
