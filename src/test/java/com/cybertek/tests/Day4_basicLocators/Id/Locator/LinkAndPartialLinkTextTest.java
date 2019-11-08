package com.cybertek.tests.Day4_basicLocators.Id.Locator;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkAndPartialLinkTextTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        WebElement link=driver.findElement(By.linkText("Example 6: Loading overlay that disappears and disappears again"));
        System.out.println(link.getText());

        WebElement cbt=driver.findElement(By.linkText("Cybertek School"));
        System.out.println(cbt.getText());

        //partial link text
        WebElement lingAgain=driver.findElement(By.partialLinkText("Example 6"));
        System.out.println(lingAgain.getText());

    }
}
