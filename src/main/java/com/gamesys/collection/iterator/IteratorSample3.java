package com.gamesys.collection.iterator;

import lombok.*;

import java.util.*;

public class IteratorSample3 {
    public static void main(String[] args) {
        List<Food> foodList = populateFood();
        List<String> expiredFoods = new ArrayList<>();
        foodList.iterator().forEachRemaining(food -> {
            if(food.getStatus().equals("expired")) {
                expiredFoods.add(food.getName());
            }
        });
        System.out.println("expired foods");
        System.out.println(expiredFoods);
    }

    private static List<Food> populateFood() {
        return Arrays.asList(
                new Food("Bread", "expired"),
                new Food("Cereal", "expired"),
                new Food("Banana", "good"),
                new Food("Oranges", "good"),
                new Food("Doughnut", "expired"),
                new Food("Oats", "good")
        );
    }
    @Getter
    @Setter
    public static class Food {
        private String name;
        private String status;

        public Food(String name, String status) {
            this.name = name;
            this.status = status;
        }
    }
}
