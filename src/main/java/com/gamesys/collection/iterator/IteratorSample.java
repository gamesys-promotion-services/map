package com.gamesys.collection.iterator;

import java.util.*;

public class IteratorSample {

    public static void main(String[] args) {
        List<String> listOfDrinks = listOfDrinks();

        for (String drink: listOfDrinks) {
            listOfDrinks.remove(drink);
        }

        System.out.println(listOfDrinks);
        Iterator<String> iterator = listOfDrinks.iterator();
        while (iterator.hasNext()) {
            //Get current element
            String drink = iterator.next();
            //Remove element
            iterator.remove();
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
