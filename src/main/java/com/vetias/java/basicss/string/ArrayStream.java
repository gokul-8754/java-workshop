package com.vetias.java.basicss.string;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStream {
    public static void main(String[] args) {
        int[] marks = {85, 30, 92, 78, 55, 100};
        long numberOfSubjectsPassed = Arrays.stream(marks)
                .filter(mark -> mark >= 40)
                .count();
        System.out.println(numberOfSubjectsPassed);
        IntStream markStream = Arrays.stream(marks);
        numberOfSubjectsPassed = markStream.filter(mark -> mark >= 35).count();

    }
}
