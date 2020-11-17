package com.gamesys.collection.map;

import java.util.*;

public class HashMapSample {

    public static void main(String[] a) {
        Map<String, List> hashMap = new HashMap<>();
        hashMap.put("drinks", listOfDrinks());
        System.out.println("hashmap: drinks");
        System.out.println(hashMap.get("drinks"));

        /**
         * Exercise: Set the listOfFoods and listOfEntertainment
         * into hashMap and print out the values
         */

    }

    private static List listOfDrinks() {
        return Arrays.asList("Water",
                "Coffee",
                "Milk",
                "Beer",
                "Tequila");
    }

    private static List listOfFoods() {
        return Arrays.asList("Bread",
                "Cereal",
                "Banana",
                "Oranges");
    }

    private static List listOfEntertainment() {
        return Arrays.asList("Table tennis",
                "PS4", "Switch", "Card games", "Board games");
    }
}
