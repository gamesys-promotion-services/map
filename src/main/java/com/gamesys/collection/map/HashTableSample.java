package com.gamesys.collection.map;

import java.util.*;

public class HashTableSample {
    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("DRNK_05", "Milk");
        hashMap.put("DRNK_02", "Water");
        hashMap.put("DRNK_03", "Coffee");
        hashMap.put("DRNK_04", "Beer");
        hashMap.put("DRNK_01", null);
        hashMap.put("DRNK_03", "Tequila");
        System.out.println("treeMap");

        for (Map.Entry<String, String> localVariable : hashMap.entrySet()) {
            System.out.println("Key = " + localVariable.getKey() +
                    ", value = " + localVariable.getValue());
        }
        System.out.println();

        /**
         * Hashtable does not allow null key and value
         */
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("DRNK_05", "Milk");
        hashtable.put("DRNK_02", "Water");
        hashtable.put("DRNK_03", "Coffee");
        hashtable.put("DRNK_04", "Beer");
//        hashtable.put("DRNK_01", null);
        hashtable.put("DRNK_03", "Tequila");
//        hashtable.put(null, "null 2");
        System.out.println("hashtable");

        /**
         * Exercise: Print out the "hashtable"
         */

    }
}
