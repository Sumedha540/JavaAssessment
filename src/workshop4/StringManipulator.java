package workshop4;

public class StringManipulator {

    // Method to reverse the input string
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Method to convert the input string to uppercase
    public String toUpperCase(String input) {
        return input.toUpperCase();
    }

    // Method to check if the input string is a palindrome
    public boolean isPalindrome(String input) {
        String reversed = reverse(input);
        return input.equals(reversed);
    }

    // Method to count vowels in the input string
    public int countVowels(String input) {
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
