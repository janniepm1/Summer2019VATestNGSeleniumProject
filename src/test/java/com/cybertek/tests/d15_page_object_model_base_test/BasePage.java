package com.cybertek.tests.d15_page_object_model_base_test;

import com.cybertek.Utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage{
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
        }

        }
