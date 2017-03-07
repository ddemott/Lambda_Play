package com.demott.lambda.recipes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaRecipes {

    private static final String SEPARATOR = "----------";
    public List<String> data = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println(SEPARATOR);
        System.out.println("Print Elements");
        System.out.println(SEPARATOR);
        printElements();
        System.out.println();
        System.out.println(SEPARATOR);
        System.out.println("Sorted Elements");
        System.out.println(SEPARATOR);
        printSortedList();
        System.out.println();
        System.out.println(SEPARATOR);
        System.out.println("First Three Elements Sorted");
        System.out.println(SEPARATOR);
        printSortedListFirstThreeElements();
        System.out.println();
        System.out.println(SEPARATOR);
        System.out.println("Sorted Elements Reversed");
        System.out.println(SEPARATOR);
        printReversedSetOfItemsWithComparator();
        System.out.println();
        String startingString = "R";
        System.out.println(SEPARATOR);
        System.out.println("Printing itmes out that start with " + startingString);
        System.out.println(SEPARATOR);
        filterStartsWithAndPrintOutResults(startingString);
    }

    /**
     * Pre-loading the data.
     */
    public LambdaRecipes() {
        super();
        data.add("Bob");
        data.add("Rick");
        data.add("Jason");
        data.add("Suzy");
        data.add("Tasha");
        data.add("Allen");
        data.add("Billy");
        data.add("Karter");
        data.add("Joyce");
        data.add("David");
        data.add("Ron");
    }

    /**
     * This is the use of DOuble Colon. Notice that in the static method of
     * println there is no parameter passed in. It is understood that the
     * element being printed is the element being looped on. If we wanted to
     * print on the objects attributes we could have done the following.
     * 
     * filters.data.forEach((d)->System.out.println(d.length()));
     */
    public static void printElements() {
        LambdaRecipes filters = new LambdaRecipes();
        filters.data.forEach(System.out::println);
    }

    /**
     * Sorting using Comparator. The Comparable interface is close enough to
     * match the Comparator so using this the compareTo will use the Comparator
     * sorting functionality.
     */
    public static void printSortedList() {
        LambdaRecipes lambdaRecipes = new LambdaRecipes();
        lambdaRecipes.data.sort((p1, p2) -> p1.compareTo(p2));
        lambdaRecipes.data.stream().forEach(System.out::println);
    }

    /**
     * Using limit to print a limited number of items in the list. In this case
     * the first 3 items.
     */
    public static void printSortedListFirstThreeElements() {
        LambdaRecipes lambdaRecipes = new LambdaRecipes();
        lambdaRecipes.data.sort((p1, p2) -> p1.compareTo(p2));
        lambdaRecipes.data.stream().limit(3).forEach(System.out::println);
    }

    /**
     * Counting the number of elements in the collection.
     */
    public static void printNumberOfElements() {
        LambdaRecipes lambdaRecipes = new LambdaRecipes();
        System.out.println(lambdaRecipes.data.stream().count());
    }

    /**
     * Sorting then reversing the list.
     */
    public static void printReversedSetOfItemsWithComparator() {
        LambdaRecipes lambdaRecipes = new LambdaRecipes();
        lambdaRecipes.data.sort((p1, p2) -> p1.compareTo(p2));
        Collections.reverse(lambdaRecipes.data);
        lambdaRecipes.data.forEach(System.out::println);
    }

    /**
     * Filter items that start with the String startsWith
     * 
     * Using collector in order to print out items
     */
    public static void filterStartsWithAndPrintOutResults(String startingString) {
        LambdaRecipes lambdaRecipes = new LambdaRecipes();
        lambdaRecipes.data.stream().filter(p -> p.startsWith(startingString)).forEach(System.out::println);
    }
}
