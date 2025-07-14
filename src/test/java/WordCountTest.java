import org.junit.jupiter.api.Test;

import com.vetias.java.workshop.basics.string.WordCount;

import org.junit.jupiter.api.Assertions;

public class WordCountTest {
    @Test
    public void testCount() {
        WordCount wordCount = WordCount.WordCount();
        int count = wordCount.count("this is a java program");
        Assertions.assertEquals(5, count);

    }
    @Test
    public void testAnothrString() {
        WordCount WordCount = com.vetias.java.workshop.basics.string.WordCount.WordCount();
        int count = WordCount.count("this is a java program");
        Assertions.assertEquals(5, count);
    }

}  
