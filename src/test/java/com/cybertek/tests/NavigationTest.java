package com.cybertek.tests;

import com.cybertek.Utilities.StringUtility;
import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class NavigationTest {
    public static void main(String[] args)throws InterruptedException {

        chrome("chrome");
        firefox("firefox");
        ie("ie");

    }

    public static void chrome(String browser) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com");
        String title=driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String title1=driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(title,title);
        driver.navigate().forward();
        String title2=driver.getTitle();
        StringUtility.verifyEquals(title1,title2);
        driver.quit();
    }

    public static void firefox(String browser) {
        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.get("https://google.com");
        String title=driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String title1=driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(title,title);
        driver.navigate().forward();
        String title2=driver.getTitle();
        StringUtility.verifyEquals(title1,title2);
        driver.quit();

    }
    public static void ie(String browser){
        WebDriver driver=WebDriverFactory.getDriver("internet explorer");
        driver.get("https://google.com");
        String title=driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String title1=driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(title,title);
        driver.navigate().forward();
        String title2=driver.getTitle();
        StringUtility.verifyEquals(title1,title2);

        driver.quit();
    }

}