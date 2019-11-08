package com.cybertek.tests.Homework2;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.lang.model.element.Element;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoogleResultTitle {
    public static void main(String[] args) {
        //open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //go to google
        driver.get("http://google.com");
        WebElement input=driver.findElement(By.name("q"));
String title="";
      //  ArrayList<WebElement> list=new ArrayList<>();
        List<String> searchStrs = Arrays.asList("Java", "JUnit", "Selenium" );
String title1="";

        for(String each:searchStrs) {
            input.sendKeys(each);
            title1 = each.toLowerCase().replaceAll(" ","");

        }





        }








//            title=each.toLowerCase().replaceAll(" ","");
//            if(each.contains(title)){
//                System.out.println("pass");
//            }else {
//                System.out.println("fail");
//            }




//            input.sendKeys(each);
//            driver.navigate().back();
//            input.sendKeys(each);







}




