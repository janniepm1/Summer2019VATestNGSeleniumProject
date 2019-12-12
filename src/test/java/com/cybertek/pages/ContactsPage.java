package com.cybertek.pages;

import com.cybertek.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage{

//    //this only find one email, it doesnt help in finding others
//    @FindBy(xpath = "//*[contains(text(),'mbrackstone9@example.com') and @data-column-label='Email']")
//    WebElement email;

    public WebElement getContantEmail(String email){
        String xpath="//*[contains(text(),'"+email+"') and @data-column-label='Email']";
        return Driver.get().findElement(By.xpath(xpath));
    }





}
