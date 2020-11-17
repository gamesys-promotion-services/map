package com.gamesys.collection.map;

import java.util.*;

public class HashTableSampleEnumeration {
    public static void main(String[] args) {
        /**
         * Exercise: What went wrong ?
         */
        Hashtable<String, Object> hashtable = new Hashtable<>();
        hashtable.put("ht1", 1);
        hashtable.put("ht2", 3);
        hashtable.put("ht3", "number 2");

        Enumeration enumeration = hashtable.elements();
        System.out.println("display value using enumeration");

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        System.out.println("");
        System.out.println("using get method");
        System.out.println(hashtable.get("ht2"));

        hashtable.put("null value", null);
    }
}
