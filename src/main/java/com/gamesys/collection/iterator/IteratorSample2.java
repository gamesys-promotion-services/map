package com.gamesys.collection.iterator;

import java.util.*;

public class IteratorSample2 {
    public static void main(String[] args) {
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("DRNK_01", "Milk");
        treeMap.put("DRNK_02", "Water");
        treeMap.put("DRNK_03", "Coffee");
        treeMap.put("DRNK_04", "Beer");
        treeMap.put("DRNK_03", "Tequila");

        //Get iterator
        Iterator<String> iterator = treeMap.keySet().iterator();
        System.out.println(treeMap);

        while(iterator.hasNext()) {
            //Get current element
            String drink = iterator.next();
            //Remove element
            if(drink.equals("DRNK_03")) {
                iterator.remove();
            }
        }
        System.out.println("using keys");
        System.out.println(treeMap);
    }
}
