package com.vetias.java.basicss.string;

import java.util.ArrayList;
import java.util.List;

public class NameStartWithSCount {
    public static void main(String[] args){
         List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Shobana");
        names.add("Charlie");
        names.add("David");
        names.add("Sathish");
        names.add("Frank");
        long nameCount = names.stream()
                .filter(name -> name.startsWith("S")).count();
        System.out.println(nameCount);
                
        
    }

}
