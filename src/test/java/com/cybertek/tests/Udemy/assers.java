package com.cybertek.tests.Udemy;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assers {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //first box is selected true then disselected false
        driver.findElement(By.id("checkBoxOption1")).click();
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print True
        driver.findElement(By.id("checkBoxOption1")).click();

        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print false

        //gives you the number of the boxes
        driver.findElements(By.cssSelector("input[type='Checkbox']")).size();









    }
}