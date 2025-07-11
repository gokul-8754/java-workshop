package com.vetias.java.basicss.collections;

import java.util.Set;
import java.util.HashSet;

public class StudentSet {
    public static void main(String[] args) {
        Set<Integer> rollNos = new HashSet<>();
        rollNos.add(101);
        rollNos.add(102);
        rollNos.add(103);
        rollNos.add(104);
        rollNos.add(105);
        System.out.println(rollNos);
    }

}
