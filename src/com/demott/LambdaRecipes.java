package com.demott;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaRecipes {

    public static void main(String[] args) {
        LambdaRecipes lambdaRecipes = new LambdaRecipes();
        lambdaRecipes.sortWithCompareTo();
        lambdaRecipes.excludingNamesThroughFilter();
        lambdaRecipes.countedItems();
    }

    public void sortWithCompareTo() {
        System.out.println("\nsortWithCompareTo");
        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Andy");
        names.add("Jack");

        names.sort((p1, p2) -> p1.compareTo(p2));
        names.forEach(System.out::println);

    }

    public void excludingNamesThroughFilter() {
        System.out.println("\nexcludingNamesThroughFilter");
        List<String> names = new ArrayList<>();
        names.add("Zena");
        names.add("Andy");
        names.add("Jack");
        names.add("Rick");
        names.add("David");
        names.add("Jenny");

        Stream<String> newString = names.stream().parallel().filter((p) -> !p.equals("Rick") && !p.equals("Jack"));
        newString.forEach(System.out::println);
    }

    public void countedItems() {
        System.out.println("\ncountedItems");
        List<String> names = new ArrayList<>();
        names.add("Zena");
        names.add("Andy");
        names.add("Jack");
        names.add("Rick");
        names.add("David");
        names.add("Jenny");

        long countedItems = names.stream().count();
        System.out.println(countedItems);
    }
}
