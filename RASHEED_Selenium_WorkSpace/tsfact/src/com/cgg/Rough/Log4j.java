package com.cgg.Rough;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j {

    public static void main(String [] args){

        Logger  APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
        PropertyConfigurator.configure("Log4j.properties");
        
        APPLICATION_LOGS.info("Executing Test1");
        APPLICATION_LOGS.info("Executing Test2");
        APPLICATION_LOGS.info("Executing Test3");
    }

}
