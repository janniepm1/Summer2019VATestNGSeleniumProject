package com.cybertek.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class VyTrackUtilities {
    public static void login(WebDriver driver, String username, String password){
    driver.findElement(By.id("prependedInput")).sendKeys("storemanager75");
        driver.findElement(By.id("prependedInput2")).sendKeys(password +
                Keys.ENTER);

        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

}
}