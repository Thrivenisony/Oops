package com.ciq.properties;

import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
public static void main(String[] args) {
	Properties properties=new Properties();
	try {
		properties.load(PropertiesDemo.class.getClassLoader().getResourceAsStream("com/ciq/properties/db.properties"));
	System.out.println(properties.get("mysql.Url"));
	System.out.println(properties.get("mysql.driverName"));
	System.out.println(properties.get("mysql.un"));
	System.out.println(properties.get("mysql.pw"));
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
}
