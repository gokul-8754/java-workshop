package com.vetias.java.basicss.collections;

public class SquareText {

    @Test
    public void textSquare() {
        Square square = x -> x * x;
        Assertions.assertEquals(25, square.findSquare(5));
    }
}