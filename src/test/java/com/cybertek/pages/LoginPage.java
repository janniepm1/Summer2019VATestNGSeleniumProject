package com.cybertek.pages;

import com.cybertek.Utilities.Driver;
import com.cybertek.tests.d15_page_object_model_base_test.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage  {
    public LoginPage() {
//you need this line in the constructor before anything
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement userName;

    @FindBy(id = "prependedInput2")
    public WebElement password;

    @FindBy(name="_submit")
    public WebElement submit;

    public void login(String userNamestr, String passwordStr){
        userName.sendKeys(userNamestr);
        password.sendKeys(passwordStr);
        submit.click();
    }

}