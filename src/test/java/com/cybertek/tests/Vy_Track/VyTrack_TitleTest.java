package com.cybertek.tests.Vy_Track;

import com.cybertek.Utilities.StringUtility;
import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VyTrack_TitleTest {
    /*
    1. Open browser
2. Go to Vytrack login page
3. Login as any user
4. Click on your name on top right
5. Click on My Configuration
6. Verify that title start with the same name on top right
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        WebElement username=driver.findElement(By.id("prependedInput"));
        username.sendKeys("storemanager53");
         WebElement passW=driver.findElement(By.id("prependedInput2"));
         passW.sendKeys(
                 "UserUser123");
         WebElement submit=driver.findElement(By.id("_submit"));
         submit.click();
         Thread.sleep(3000);
         WebElement yourName=driver.findElement(By.xpath("//li[@id='user-menu']/a[@class='dropdown-toggle']"));
         yourName.click();
        WebElement conf=driver.findElement(By.linkText("My Configuration"));
        conf.click();
       WebElement title=driver.findElement(By.cssSelector("//div[class='sub-title']/a[href='/user/view/148']"));
        System.out.println(title.getText());
        WebElement title2=driver.findElement(By.cssSelector("a[class=\"dropdown-toggle\"]"));
        System.out.println(title2.getText());
        StringUtility.verifyEquals("title1","title2");



    }
}
