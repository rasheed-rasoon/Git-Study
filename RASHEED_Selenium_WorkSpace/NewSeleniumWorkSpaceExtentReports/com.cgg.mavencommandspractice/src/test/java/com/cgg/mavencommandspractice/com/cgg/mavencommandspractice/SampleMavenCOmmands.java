package com.cgg.mavencommandspractice.com.cgg.mavencommandspractice;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public class SampleMavenCOmmands {
	
public static WebDriver driver;
public static void main(String args[])
{
ArrayList<String> list=new ArrayList<String>();
list.add("rasheed");
list.add("ahmed");
for(String str:list)
{
	System.out.println(str);
}
}

}
