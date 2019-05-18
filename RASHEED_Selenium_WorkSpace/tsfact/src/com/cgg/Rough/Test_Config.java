package com.cgg.Rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test_Config {

    public static void main(String [] args) throws IOException {

        // Read OR.properties file
        Properties or = new Properties();
        FileInputStream orfs = new FileInputStream(System.getProperty("user.dir") + "\\src\\com\\cgg\\config\\config.properties");
        or.load(orfs);
        System.out.println(or.getProperty("browserType"));

        // Print out to the console
        //System.out.println(or.getProperty("XXXX"));

    }
}
