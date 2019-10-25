package com.cybertek.tests.Day1basicnavigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.*;

public class elementbytagname {
    public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        WebElement h1= tagName("h1").findElement(driver);
        System.out.println(h1.getText());
        driver.close();
    }
}
