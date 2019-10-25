package com.cybertek.tests.day3_webelement_class;

import com.cybertek.Utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.transform.sax.SAXSource;

/*open browser
go to http://practice.cybertekschool.com/forgot_password
click on Retrieve password
verify that url did not change

 */
public class verifyURLdidnotchange {
    public static void main(String[] args){

    //opendriver
        WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/forgot_password");
//save the expected URL
        String expectedUrl=driver.getCurrentUrl();
//click on retrieve password
        //Web element ==class that represents from the webpage
        //findelement==method used to find element on a page

        //click on retrieve password
        WebElement retrievepass=driver.findElement((By.id("form_submit")));
        //click()==clicks on element
        retrievepass.click();
//verify that url did not change
        String actualUrl=driver.getCurrentUrl();
if(actualUrl.equals(expectedUrl)) {
    System.out.println("PASS");
}else{
    System.out.println("FAIL");
}


}
}