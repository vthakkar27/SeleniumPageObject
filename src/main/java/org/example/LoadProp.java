package org.example;

import org.apache.commons.io.IOExceptionList;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class LoadProp
{

    static Properties prop;
    static FileInputStream input;
    static String fileName = "TestDateConfig.properties";
    static String fileLocation = "src\\test\\resources\\TestData\\";


    public String getProperty(String key)
    {
        prop = new Properties();
        try {
            input = new FileInputStream(fileLocation + fileName);
            prop.load(input);
            input.close();
        } catch (IOException e){
            e.printStackTrace();
    }
        return prop.getProperty(key);

}




}
