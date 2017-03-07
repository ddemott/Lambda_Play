package com.demott;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTesting {

    public static void main(String[] args) {
        Predicate<String> predicate = (s) -> s.length() > 10;
        List<String> list = new ArrayList<String>();
        
        list.add("Alabama");
        list.add("Alaska");
        list.add("Arizona");
        list.add("Arkansas");
        list.add("Alabama");
        list.add("California");
        list.add("Connecticut");
        list.add("Delaware");
        list.add("Florida");
        list.add("Georgia");
        list.add("Hawaii");
        list.add("Idaho");
        list.add("Illinois");
        list.add("Indiana");
        list.add("Iowa");
        list.add("Kansas");
        list.add("Kentucky");
        list.add("Louisiana");
        list.add("Kentucky");
        list.add("Maine");
        list.add("Maryland");
        list.add("Massachusetts");
        list.add("Michigan");
        list.add("Minnesota");
        list.add("Mississippi");
        list.add("Missouri");
        list.add("Montana");
        list.add("Nebraska");
        list.add("Nevada");
        list.add("New Hampshire");
        list.add("New Jersey");
        list.add("New Mexico");
        list.add("New York");
        list.add("North Carolina");
        list.add("North Dakota");
        list.add("Ohio");
        list.add("Oklahoma");
        list.add("Oregon");
        list.add("Pennsylvania");
        list.add("Rhode Island");
        list.add("South Carolina");
        list.add("South Dakota");
        list.add("Tennessee");
        list.add("Texas");
        list.add("Utah");
        list.add("Vermont");
        list.add("Virginia");
        list.add("Washington");
        list.add("West Virginia");
        list.add("Wisconsin");
        list.add("Wyoming");
        PredicateTesting pt = new PredicateTesting();
        pt.printListWithTest(list, predicate);
    }

    public void printListWithTest(List<String> myStringList, Predicate<String> p) {
        List<String> myList = myStringList.stream().filter(p).collect(Collectors.toList());
        // myList.forEach(n -> System.out.println(n));
        // Same as above
        myList.forEach(PredicateTesting::printingUpperCase);
    }

    public static void printingUpperCase(String textToPrint) {
        textToPrint = textToPrint.toUpperCase();
        System.out.println(textToPrint);
    }

    public void returnPaginatedResult(List<String> myList, int pageSize, int pageNumber) {
    }

}
