package com.cybertek.tests.day18_data_driven_testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestWithDataProvider {
    //this method will provide test data
    @DataProvider
    public Object [][] testData(){
        String[][] data={
            {"Kung fu","10"},
            {"Titanic","1"},
            {"Interstellar","2"},
                {"Godfather","9"}
        };
        return data;
    }
    @Test(dataProvider = "testData")
    public void test1(String name,String Rating){
        System.out.println("Movie "+name+" has rating "+Rating);

    }
}
