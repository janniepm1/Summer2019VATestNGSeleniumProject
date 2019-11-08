package com.cybertek.tests.Day5_Xpath;


import com.cybertek.Utilities.StringUtility;
import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathtestDemoClass {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
WebElement link=driver.findElement(By.xpath("/html/body/nav/ul/li/a"));//Home Absolute Xpath
        System.out.println(link.getText());
        WebElement link2=driver.findElement(By.xpath("/html/body/div/div/div/div/h3"));
        System.out.println(link2.getText());
        WebElement link3=driver.findElement(By.xpath("//li/a"));
        System.out.println(link3.getText());//Home relative xpath





    }
}
