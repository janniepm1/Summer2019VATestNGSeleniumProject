package com.cybertek.tests.TestNg;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class day6_testNg {
    @Test
    public void Test1(){
        System.out.println("This is the first Test");
    }

    @Test
    @Ignore
    public void Test2(){
        System.out.println("This is the second Test");
    }
}
