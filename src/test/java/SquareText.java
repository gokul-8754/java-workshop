

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import com.vetias.java.basicss.collections.Square;

public class SquareText {

    @Test
    public void textSquare() {
        Square square = x -> x * x;
        Assertions.assertEquals(square, square);
        
    }
}