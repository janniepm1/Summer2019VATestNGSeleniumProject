package com.cybertek.tests.Day4_basicLocators.Id.Locator;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //gives you fullscreen but use maximize on windows
        driver.manage().window().maximize();
        //go to Webpage
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        //find button by id
       // driver.findElement(By.id("button_btnbtn"));

       WebElement element= driver.findElement(By.id("disappearing_button"));

       String txt=element.getText();
       element.click();
       driver.quit();





    }
}
