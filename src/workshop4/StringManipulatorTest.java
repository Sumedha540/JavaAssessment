package workshop4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    private final StringManipulator stringManipulator = new StringManipulator();

    @Test
    void testStringManipulatorMethods() {
        String input = "racecar"; // Palindrome example

        assertAll("StringManipulator Tests",
            () -> assertEquals("racecar", stringManipulator.reverse(input), "Reverse test failed"),
            () -> assertEquals("RACECAR", stringManipulator.toUpperCase(input), "ToUpperCase test failed"),
            () -> assertTrue(stringManipulator.isPalindrome(input), "IsPalindrome test failed"),
            () -> assertEquals(3, stringManipulator.countVowels(input), "CountVowels test failed")
        );
    }
}
