package com.vetias.java.basicss.collections;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {    public static void main(String[] args) {
        Map<Integer, String> studentS = new HashMap<>();
        studentS.put(101, "John Doe");
        studentS.put(102, "Jane Smith");
        studentS.put(103, "Alice Johnson");
        studentS.put(104, "Bob Brown");
        studentS.put(105, "Charlie White");
        System.out.println(studentS);
        System.out.println(studentS.keySet());
        System.out.println(studentS.values());

    }

}
