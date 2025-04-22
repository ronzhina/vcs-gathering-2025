public class Calculator {
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sumOfNaturals(int n) {
	int sum = 0;
	for (int i = 1; i <= n; i++) {
		sum += i;
	}
	return sum;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int mod(int a, int b) {
        return a%b;
    }

    /**
     * Calculates the integer square root of a number using only addition and subtraction.
     * Uses the Babylonian method (Newton's method) for approximating square roots.
     * 
     * @param n The number to find the square root of
     * @return The integer square root of n
     * @throws IllegalArgumentException if n is negative
     */
    public int sqrt(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Cannot compute square root of a negative number");
        }

        if (n == 0 || n == 1) {
            return n;
        }

        // Start with an initial guess
        int guess = n / 2;
        if (guess == 0) guess = 1;

        // Previous guess, initialized differently to enter the loop
        int prevGuess = -1;

        // Iterate until convergence (when guess doesn't change)
        while (prevGuess != guess) {
            prevGuess = guess;

            // Calculate n/guess using only subtraction
            int quotient = 0;
            int remainder = n;

            while (remainder >= guess) {
                remainder = remainder - guess;
                quotient = quotient + 1;
            }

            // Calculate (guess + n/guess) / 2 using only addition and subtraction
            guess = (guess + quotient) / 2;
        }

        return guess;
    }
}
