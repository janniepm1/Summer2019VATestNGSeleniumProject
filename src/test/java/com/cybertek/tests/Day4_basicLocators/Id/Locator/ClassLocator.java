package com.cybertek.tests.Day4_basicLocators.Id.Locator;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocator {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement home=driver.findElement(By.className("nav-link"));
        home.click();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement title=driver.findElement(By.className("h3"));

        System.out.println(title.getText());

    }
}
