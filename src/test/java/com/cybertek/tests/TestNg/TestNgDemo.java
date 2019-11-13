package com.cybertek.tests.TestNg;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class TestNgDemo {
@BeforeTest
    public void BeforeTest(){
        System.out.println("Before Test");
    }
    @BeforeClass//it will run only once in the class
    public void BeforeClass(){
        System.out.println("Before Class");
    }
    @BeforeMethod//will run every time every running any method
    public void SetUp(){
        System.out.println("Before Method");

    }
    @Test(priority = 3)//gives the priority 1 comes first
    public void test1(){
        String word1="java";
        String word2="java";
        System.out.println("test1");
        Assert.assertEquals(word1,word2);//helps do verification
    }
   // @Ignore//it will ignore the error
    @Test(priority = 2)
    public void test2(){
        String word1="javascript";
        String word2="javascript";//error at line 27
        System.out.println("test2");//after method will not show because if the test fails the program will not continue
        Assert.assertEquals(word1,word2);//helps do verification
    }
    @Test(priority = 1)
    public void test3(){
        System.out.println("Test 3");
        Assert.assertTrue(15>10);//helps do verification
        throw new SkipException("Just skipped");//will skip method
    }
    @AfterMethod
    public void teardown(){
        System.out.println("After Method");
    }
    public void AfterClass(){//it will run every time after all test once
        System.out.println("After class");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("After Test");
    }
}
