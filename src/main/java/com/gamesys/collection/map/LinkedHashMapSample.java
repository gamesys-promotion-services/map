package com.gamesys.collection.map;

import java.util.*;

public class LinkedHashMapSample {

    public static void main(String[] args) {
        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("DRNK_05", "Milk");
        hashMap.put("DRNK_02", "Water");
        hashMap.put(null, "null");
        hashMap.put("DRNK_03", "Coffee");
        hashMap.put("DRNK_04", "Beer");
        hashMap.put("DRNK_01", null);
        hashMap.put("DRNK_03", "Tequila");
        hashMap.put(null, "null 2");
        System.out.println("hashMap");

        for (Map.Entry<String, String> localVariable : hashMap.entrySet()) {
            System.out.println("Key = " + localVariable.getKey() +
                    ", value = " + localVariable.getValue());
        }

        System.out.println();
        Map<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("DRNK_05", "Milk");
        linkedHashMap.put("DRNK_02", "Water");
        linkedHashMap.put(null, "null");
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
    }
}
