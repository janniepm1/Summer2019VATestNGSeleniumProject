package com.cybertek.tests.Day7TypesOfElements;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonsTest {

    @Test
    public void Test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement blue=driver.findElement(By.id("blue"));
        WebElement red=driver.findElement(By.id("red"));

        System.out.println("is blue selected "+blue.isSelected() );
        System.out.println("is red selected "+red.isSelected() );

        //verify if blue is selected
        Assert.assertTrue(blue.isSelected());//proper way to find if properly selected

        //verify if red is not selected
        Assert.assertFalse(red.isSelected());//passed because its not selectrf

        System.out.println("Clicking on red");
        red.click();
        System.out.println("is blue selected "+blue.isSelected() );
        System.out.println("is red selected "+red.isSelected() );
        //verify blue is not selected
        Assert.assertFalse(blue.isSelected());
        Assert.assertTrue(red.isSelected());


    }
    }

