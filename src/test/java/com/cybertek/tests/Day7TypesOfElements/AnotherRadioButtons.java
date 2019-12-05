package com.cybertek.tests.Day7TypesOfElements;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnotherRadioButtons {
    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement basketball=driver.findElement(By.id("basketball"));
        WebElement football=driver.findElement(By.id("football"));

        //verify if both radio buttons not selected
        Assert.assertFalse(basketball.isSelected());

    }
}
