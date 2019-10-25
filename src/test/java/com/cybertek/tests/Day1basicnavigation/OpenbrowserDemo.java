
package com.cybertek.tests.Day1basicnavigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
        public class OpenbrowserDemo {
        public static void main(String[] args) {
                //option+enter = MAC
                //alt+enter = WIN
                // we HAVE TO enter
                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();

        }
}






