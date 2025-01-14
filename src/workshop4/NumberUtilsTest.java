package workshop4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class NumberUtilsTest {

    @Test
    public void testGetEvenNumbers() {
        int[] input = {1, 2, 3, 4, 5, 6};
        List<Integer> expectedOutput = Arrays.asList(2, 4, 6);

        List<Integer> actualOutput = NumberUtils.getEvenNumbers(input);

        assertEquals(expectedOutput, actualOutput, "The method should return only even numbers from the input array.");
    }
}
