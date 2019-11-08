package com.cybertek.tests.Homework2;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EtsySearchTest {
    public static void main(String[] args) throws Exception {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://ebay.com");

        WebElement text=driver.findElement(By.id("gh-ac"));
        text.click();
        //search wooden spoon
        text.sendKeys("wooden spoon");
        Thread.sleep(3000);
        //click submit button
        WebElement submit=driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
        submit.click();
        //find how many wooden spoon are available
        WebElement element = driver.findElement(By.partialLinkText("11,"));
        //get text
        System.out.println(element.getText());






    }
}
