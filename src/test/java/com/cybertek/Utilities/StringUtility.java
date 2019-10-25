package com.cybertek.Utilities;

import org.openqa.selenium.WebDriver;

public class StringUtility {
    public static void verifyEquals(String expected, String actual) {
        String result=expected.equals(actual)?"PASS":"FAIL";
        System.out.println(result);


    }
}


