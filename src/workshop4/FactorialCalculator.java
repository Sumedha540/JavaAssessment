package workshop4;

public class FactorialCalculator {

    // Function to calculate the factorial of a number
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // base case: factorial of 0 and 1 is 1
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i; // Multiply result by i for each iteration
        }
        return result;
    }
}
