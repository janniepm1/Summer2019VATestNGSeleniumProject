package com.cybertek.tests.Day4_basicLocators.Id.Locator;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonLocatorDemo {
    public static void main(String[] args) {
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullName=driver.findElement(By.tagName("input"));
        //fullname
        fullName.sendKeys("John Doe");
        //email
        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("jdoe@cybertekschool.com");
        //sign up button
        WebElement button=driver.findElement(By.tagName("button"));
        button.click();



    }
}
