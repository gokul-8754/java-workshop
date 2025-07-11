

import org.junit.jupiter.api.Test;

import com.vetias.java.basicss.string.Square;

import org.junit.jupiter.api.Assertions;

public class SquareText {

    @Test
    public void textSquare() {
        Square square = x -> x * x;
        Assertions.assertEquals(square, square);
        
    }
}