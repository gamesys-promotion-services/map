package com.gamesys.collection.map;

import java.io.*;
import java.util.*;

public class PropertiesDemoPart2 {
    public static void main(String[] args) throws IOException {

        InputStream fis = PropertiesDemoPart2.class.getClassLoader().
                getResourceAsStream("application.properties");
        Properties properties = new Properties();
        properties.load(fis);
        System.out.println(properties.getProperty("version"));
        System.out.println(properties.getProperty("server.port"));
        System.out.println(properties.getProperty("server.address"));
    }
}
