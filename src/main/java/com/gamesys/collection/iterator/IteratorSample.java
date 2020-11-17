package com.gamesys.collection.iterator;

import java.util.*;

import static com.gamesys.collection.map.HashMapSample.*;

public class IteratorSample {

    public static void main(String[] args) {
        List<String> listOfDrinks = listOfDrinks();
        Iterator<String> iterator = listOfDrinks.iterator();

        for (int i = 0; i < listOfDrinks.size(); i++) {
            if(listOfDrinks.get(i).equalsIgnoreCase("Beer")) {
                listOfDrinks.remove(i);
            }
        }

        System.out.println(listOfDrinks);
        while (iterator.hasNext()) {
            //Get current element
            String drink = iterator.next();
            //Remove element
            if(drink.equals("Beer")) {
                iterator.remove();
            }
        }
        System.out.println(listOfDrinks);
    }

    private static List listOfDrinks() {
        List<String> listOfDrinks = new ArrayList<>();
        listOfDrinks.add("Milk");
        listOfDrinks.add("Water");
        listOfDrinks.add("Coffee");
        listOfDrinks.add("Beer");
        listOfDrinks.add("Tequila");
        return listOfDrinks;
    }
}
