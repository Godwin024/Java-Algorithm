package shortestWord;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestWordTest {
    @Test
    public void testThatITakeASentenceAndReturnTheShortestWord() {
        String sentence = "Hello my poeple, how are you guys doing?";
        String expected = "my";
        assertEquals(expected, ShortestWord.shortestWordInThesentence(sentence));
    }

    @Test
    public void testThatItakeAnArraysOfNumbersAndReturnTheSquareOfTheNumberInDecendingOder(){
        int[] numbers =  {1,2,3,4,7};
        int[] expected = {1,4,9,16, 49};
        assertArrayEquals(expected, ShortestWord.getSquarearrayOfNumber(numbers));


    }

}
