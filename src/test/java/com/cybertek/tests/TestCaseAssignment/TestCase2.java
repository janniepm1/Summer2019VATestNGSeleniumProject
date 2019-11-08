package com.cybertek.tests.TestCaseAssignment;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestCase2 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        List<WebElement> lists=driver.findElements(By.className("list-group-item"));
        System.out.println("The size of the list is : "+lists.size());

        if (lists.size() == 48) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

driver.quit();

    }

}
