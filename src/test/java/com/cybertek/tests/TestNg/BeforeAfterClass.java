package com.cybertek.tests.TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterClass {
    @Test
    public void Test1(){
        System.out.println("This is test one ");
    }
    @Test
    public void Test2(){
        System.out.println("This is test two");
    }
    @BeforeMethod
    public void setupMethod(){
        System.out.println("BEFORE METHOD");
        System.out.println("Opening Chrome");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("AFTER METHOD");
        System.out.println("Closing Chrome");
    }
    @BeforeClass
    public void setUpClass(){
        System.out.println("Before class running only one time");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After class: running one time");
    }
}
