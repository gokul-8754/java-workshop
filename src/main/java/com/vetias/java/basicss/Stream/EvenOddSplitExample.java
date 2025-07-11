package com.vetias.java.basicss.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class EvenOddSplitExample {
    public static void main(String[] args) {
         List<Integer> numbers = Arrays.asList(13,14,17,13,10);
         Map<Boolean,List<Integer>> groupMap = numbers.stream()
         .collect(Collectors.partitioningBy(no -> no%2 == 0));
         System.out.println("Even number:"+groupMap.get(true));
         System.out.println("odd number:"+groupMap.get(false));
    }


}
