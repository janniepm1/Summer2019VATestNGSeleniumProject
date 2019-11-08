package com.cybertek.tests.Day4_basicLocators.Id.Locator;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {
    public static void main(String[] args) {
        //go to web
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //go to webpage
driver.manage().window().maximize();
driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullName=driver.findElement(By.name("full_name"));
fullName.sendKeys("John Doe");

WebElement email=driver.findElement(By.name("email"));
email.sendKeys("johndoe@cybertekschool.com");

WebElement submit=driver.findElement(By.name("wooden_spoon"));
submit.click();



    }
}
