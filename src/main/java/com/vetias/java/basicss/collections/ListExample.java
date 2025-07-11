package com.vetias.java.basicss.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");
        names.add("Frank");
        
        names.forEach(System.out::println);
        names.sort(Comparator.reverseOrder());
        System.out.println(names);
    }  

}
