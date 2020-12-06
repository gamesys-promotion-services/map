package com.gamesys.collection.map;

import java.util.*;

public class PropertiesDemo {

    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.put("abc", 999);
        String abcInt = properties.getProperty("abc");
        System.out.println("abcValue: " + abcInt);

        Properties propertiesString = new Properties();
        propertiesString.put("abc", "999");
        String abcString = propertiesString.getProperty("abc");
        System.out.println("abcString: " + abcString);
    }
}
