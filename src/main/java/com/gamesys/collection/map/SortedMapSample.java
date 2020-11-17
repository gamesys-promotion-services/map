package com.gamesys.collection.map;

import java.util.*;

public class SortedMapSample {
    public static void main(String[] args) {

        Map<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("DRNK_05", "Milk");
        linkedHashMap.put("DRNK_02", "Water");
        linkedHashMap.put("DRNK_03", "Coffee");
        linkedHashMap.put("DRNK_04", "Beer");
        linkedHashMap.put("DRNK_01", null);
        linkedHashMap.put("DRNK_03", "Tequila");
        linkedHashMap.put(null, "null 2");
        System.out.println("linkedHashMap");

        for (Map.Entry<String, String> localVariable : linkedHashMap.entrySet()) {
            System.out.println("Key = " + localVariable.getKey() +
                    ", value = " + localVariable.getValue());
        }
        System.out.println();

        SortedMap<String,String> treeMap = new TreeMap<>();
        treeMap.put("DRNK_05", "Milk");
        treeMap.put("DRNK_02", "Water");
        treeMap.put("DRNK_03", "Coffee");
        treeMap.put("DRNK_04", "Beer");
        treeMap.put("DRNK_01", null);
        treeMap.put("DRNK_03", "Tequila");
        treeMap.put(null, "null 2"); // TreeMap does allow null keys. The default natural ordering comparator is the one that throws the exception.
        System.out.println("treeMap");

        for (Map.Entry<String, String> localVariable : treeMap.entrySet()) {
            System.out.println("Key = " + localVariable.getKey() +
                    ", value = " + localVariable.getValue());
        }
    }


}
