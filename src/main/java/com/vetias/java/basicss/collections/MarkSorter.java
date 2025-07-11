package com.vetias.java.basicss.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarkSorter {

    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(85);
        marks.add(60);
        marks.add(92);
        marks.add(78);
        marks.add(55);
        marks.add(99);

        System.out.println("Original marks: " + marks);
        Collections.sort(marks);
        System.out.println("Marks in ascending order: " + marks);
        Collections.sort(marks, Collections.reverseOrder());
        System.out.println("Marks in descending order: " + marks);
    }
}
