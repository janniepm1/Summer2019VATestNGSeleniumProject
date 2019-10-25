package com.cybertek.tests;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.text.Utilities;
import java.util.concurrent.TimeUnit;

public class VyTrackProject {
    public static void main(String[] args) {
        //open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://qa2.vytrack.com/user/login");
        LogIn(driver,"UserUser123","User4");

    }

    public static WebDriver LogIn(WebDriver driver, String password, String username) {
WebElement uName=driver.findElement(By.name("_username"));
uName.sendKeys(username);
WebElement pass=driver.findElement(By.name("_password"));
pass.sendKeys(password);
WebElement login=driver.findElement(By.id("_submit"));
login.click();
return driver;
    }
}
