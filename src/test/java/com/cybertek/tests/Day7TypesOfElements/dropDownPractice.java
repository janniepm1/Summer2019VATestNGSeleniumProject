package com.cybertek.tests.Day7TypesOfElements;

import com.cybertek.Utilities.StringUtility;
import com.cybertek.Utilities.WebDriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class dropDownPractice {
   public static WebDriver driver = WebDriverFactory.getDriver("chrome");

    public static void main(String[] args) throws Exception {
//SelectByTextTest();
//selectbyvalue();
//SelectByIndex();
       //
        // MultiSelectedDropdown();
        NonSelectedDropDown();
    }
    public static void setup(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    public static void SelectByTextTest() throws Exception{
        setup();
        Thread.sleep(2000);
        Select select=new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");
        Thread.sleep(2000);
        driver.close();
    }
    public static void selectbyvalue() throws Exception{
        setup();
        Select select=new Select(driver.findElement(By.id("state")));
        select.selectByValue("DC");
        Thread.sleep(2000);
        String expected="District Of Columbia";
        String actual=select.getFirstSelectedOption().getText();
        System.out.println("Expected: "+expected);
        System.out.println("Actual: "+actual);
        driver.close();

    }
    public static void SelectByIndex() throws Exception{
        setup();
        Thread.sleep(2000);
        Select select=new Select(driver.findElement(By.id("state")));
        select.selectByIndex(1);
        Thread.sleep(2000);
String expected="Alabama";
String actual=select.getFirstSelectedOption().getText();
        System.out.println("Expected: "+expected);
        System.out.println("Actual: "+actual);
        StringUtility.verifyEquals(actual,expected);


        String expectedValue="Al";
        String actualValue=select.getFirstSelectedOption().getAttribute("name");
        System.out.println("Expected value: "+expectedValue);
        System.out.println("Actual value: "+actualValue);
        driver.close();
    }
    public static void MultiSelectedDropdown() throws Exception{
        setup();
        Thread.sleep(2000);
        Select select=new Select(driver.findElement(By.name("Languages")));
        List<WebElement> options=select.getOptions();
        for(WebElement each:options){
            Thread.sleep(2000);
            select.selectByVisibleText(each.getText());
        }
        List<WebElement> selectedoptions=select.getAllSelectedOptions();
        for(WebElement soptions:selectedoptions){
            System.out.println(soptions.getText());
        }

        Thread.sleep(2000);

        select.deselectAll();
        Thread.sleep(2000);
        driver.close();
    }
    public static void NonSelectedDropDown()throws  Exception{
        setup();

        WebElement dropdown= driver.findElement(By.id("dropdownMenuLink"));
        WebElement option= driver.findElement(By.xpath("//a[text()='Amazon']"));
Thread.sleep(2000);
        dropdown.click();
        Thread.sleep(1000);
        option.click();



        driver.close();
    }








    }

