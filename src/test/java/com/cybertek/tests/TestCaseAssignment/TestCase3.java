package com.cybertek.tests.TestCaseAssignment;

import com.cybertek.Utilities.StringUtility;
import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase3 {
    public static void main(String[] args) throws Exception{


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");
       WebElement text=driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[33]/a"));
        Thread.sleep(2000);
       text.click();
        Thread.sleep(2000);
        WebElement button=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/button[1]"));
        button.click();
        //System.out.println(button.getText());
        WebElement expected=driver.findElement(By.id("result"));
        expected.getText();

        String actual="Clicked on button one!";
        Thread.sleep(2000);

       // String expected="Clicked on button one!";
        StringUtility.verifyEquals(expected.getText(),actual);

        driver.quit();


        Thread.sleep(2000);




}
}
