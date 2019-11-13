package com.cybertek.tests.Day6_CSSlocators;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssLocators {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement element=driver.findElement(By.cssSelector("button#disappearing_button"));//css selector E
        System.out.println(element.getText());
        WebElement element2=driver.findElement(By.cssSelector(".nav-link"));
        System.out.println(element2.getText());

        driver.quit();
    }
}
