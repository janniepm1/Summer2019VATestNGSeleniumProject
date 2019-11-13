package com.cybertek.tests;

import com.cybertek.Utilities.StringUtility;
import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchTest{
        public static void main(String[] args) {
priceDetails();
titleTest();
bookDetailsTest();
        }

        private static void priceDetails(){
            WebDriver driver= WebDriverFactory.getDriver("chrome");
            driver.get("https://amazon.com");
            WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
            search.sendKeys("selenium cookbook");
            WebElement searchBTN=driver.findElement(By.className("nav-input"));
            searchBTN.click();

            WebElement book=driver.findElement(By.linkText("Selenium Testing Tools Cookbook - Second Edition"));
            book.click();

            String expectedPaperPrice="$44.00";

            WebElement pprice= driver.findElement(By.xpath("(//span[@class='a-size-base mediaTab_subtitle'])[2]"));
            String actualPrice=pprice.getText();

            if(expectedPaperPrice.equals(actualPrice)){
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");
                System.out.println("Actual price= "+actualPrice);
                System.out.println("Expectedpaperbackprice= "+expectedPaperPrice);
            }

            String expectedkprice="$22.39";
            WebElement kprice=driver.findElement(By.xpath("(//span[@class='a-size-base mediaTab_subtitle'])[1]"));
            String actualkPrice=kprice.getText();

            if(expectedkprice.equals(actualkPrice)){
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");
                System.out.println("actualKPrice = " + actualkPrice);
                System.out.println("expectedKPrice = " + expectedkprice);

            }
            driver.quit();


        }
        public static void bookDetailsTest(){
            WebDriver driver=WebDriverFactory.getDriver("chrome");
            driver.get("https://amazon.com");
            WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
            search.sendKeys("selenium cookbook");
            WebElement searchBtn = driver.findElement(By.className("nav-input"));
            searchBtn.click();

            String expectedBook = "Mastering Selenium WebDriver 3.0: Boost the performance and reliability of your automated checks by mastering Selenium WebDriver, 2nd Edition";
            WebElement res1 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
            String actualBook = res1.getText();

           if(expectedBook.equals(actualBook)){

            } else {
                System.out.println("FAIL");
                System.out.println("actualBook = " + actualBook);
                System.out.println("expectedBook = " + expectedBook);
            }
            String expectedAuthor="Mark Collin";
            WebElement author1=driver.findElement(By.xpath("(//a[@class='a-size-base a-link-normal'])[1]"));
            String actualAuthor=author1.getText();

            if (expectedAuthor.equals(actualAuthor)) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
                System.out.println("actualAuthor = " + actualAuthor);
                System.out.println("expectedAuthor = " + expectedAuthor);
            }
driver.quit();
        }
    private static void titleTest() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://amazon.com");
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("selenium cookbook");
        WebElement searchBtn = driver.findElement(By.className("nav-input"));
        searchBtn.click();
        WebElement booksLink = driver.findElement(By.linkText("Books"));
        booksLink.click();
        String title = driver.getTitle();
        System.out.println(title);
        if (title.endsWith("Books")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println(title + ": did not end with Books");
        }

        WebElement anyDepartment = driver.findElement(By.linkText("Any Department"));
        anyDepartment.click();

        title = driver.getTitle();
        if (!title.endsWith("Books")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("ACTUAL: " + title);
        }

        driver.quit();


    }  }