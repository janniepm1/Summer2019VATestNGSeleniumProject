package com.cybertek.tests.day3_webelement_class;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;

/*
open browser
go to http://practice.cybertekschool.com/forgot_password
enter any email
click on Retrieve password
verify that confirmation message says 'Your e-mail's been sent!'
 */
public class VerifyConfirmationMsj {
    public static void main(String[] args) {
        //open browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //enter any mail
        WebElement emailInput=driver.findElement(By.name("email"));
        //sendkeys==enters given text
        String expectedMail="janniepm258@gmail.com";
        emailInput.sendKeys(expectedMail);

        //verify that email is displayed in the input box
        String actualEmail=emailInput.getAttribute("value");
        if(expectedMail.equals(actualEmail)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("expected mail: " + expectedMail);
            System.out.println("actual mail: " + actualEmail);
        }//click on retrieve passwrod
            WebElement retrievepass=driver.findElement(By.id("form_submit"));
            retrievepass.click();

            //verify that confirmation message says "your email been sent

            String expectedmsj="'Your e-mail's been sent!'";
            WebElement messageElement=driver.findElement(By.name("confirmation_message"));
        String actualmessage=messageElement.getText();

            if(expectedmsj.equals(actualmessage)){
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");
                System.out.println("expected result"+ expectedmsj);
                System.out.println("actual message= "+actualmessage);
            }




        }

    }


