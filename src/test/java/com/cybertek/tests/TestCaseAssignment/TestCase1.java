package com.cybertek.tests.TestCaseAssignment;



import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
        public class TestCase1 {
            /*
           Test case #1
           1. Go to https://practice-cybertekschool.herokuapp.com
           2. Click on “Sign Up For Mailing List”
           3. Enter any valid name
           4. Enter any valid email
           5. Click on “Sign Up” buttonExpected result:
           Following message should be displayed:
           “Thank you for signing up. Click the button below to return to the home page.”
            Home button should be displayed.
             */
            public static void main(String[] args) throws Exception {
                WebDriver driver= WebDriverFactory.getDriver("chrome");
                driver.manage().window().maximize();
                driver.get("https://practice-cybertekschool.herokuapp.com");
                WebElement signUp = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[43]/a"));
                Thread.sleep(2000);
                signUp.click();
                Thread.sleep(2000);
                driver.findElement(By.name("full_name")).sendKeys("Gulnur Aslan");
                Thread.sleep(2000);
                driver.findElement(By.name("email")).sendKeys("gulnur1976@gmail.com");//wooden_spoon
                Thread.sleep(2000);
                driver.findElement(By.name("wooden_spoon")).click();
                String expected = "Thank you for signing up. Click the button below to return to the home page.";
                WebElement text = driver.findElement(By.name("signup_message"));
                String actual = text.getText();
                System.out.println(text.getText());
                if (expected.equals(actual)) {
                    System.out.println("pass");
                } else {
                    System.out.println("fail");
                    System.out.println("expected" + expected);
                    System.out.println("actual" + actual);
                }
                driver.quit();
            }

        }
