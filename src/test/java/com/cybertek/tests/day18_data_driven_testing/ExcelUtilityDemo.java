package com.cybertek.tests.day18_data_driven_testing;

import com.cybertek.Utilities.ExcelUtil;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExcelUtilityDemo {

    @Test
    public void readExcelTest(){
        //create instance of the excel utility
        //argument 1:location of file
        //sheet we want to open
        //when we create object of this utility it means we openend the file and accessed certain
                ExcelUtil qa1Short= new ExcelUtil("src/test/resources/Vytrack testusers.xlsx","QA1-short");

        System.out.println("Column count: "+qa1Short.columnCount());
        System.out.println( qa1Short.getColumnsNames());

        //get all data
        List<Map<String, String>> datalist=qa1Short.getDataList();
        for(Map<String,String> stringStringMap:datalist){
            System.out.println(stringStringMap);

            String[][] dataArray=qa1Short.getDataArray();
            System.out.println("=======================");
            System.out.println(Arrays.deepToString(dataArray));

        }


    }
}
