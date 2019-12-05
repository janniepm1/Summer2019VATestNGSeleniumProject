package com.cybertek.tests.Day11_file_upload_action_class;

import org.testng.annotations.Test;

public class FileExample {


    public class FileExamples {

        @Test
        public void test(){
            System.out.println(System.getProperty("user.dir"));
            System.out.println(System.getProperty("os.name"));
            System.out.println(System.getProperty("user.home"));

            // location of the current project
            String projectPath = System.getProperty("user.dir");
            // location of the file within the project
            String relativePath = "/src/test/resources/test_file.txt";

            String fullPath = projectPath+relativePath;
            System.out.println(fullPath);

        }
    }
}
