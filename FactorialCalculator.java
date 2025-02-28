// File Name: FactorialCalculator.java

import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        // Get a valid non-negative integer input from the user
        int number = getNonNegativeInteger();
        
        // Calculate the factorial of the obtained integer
        long factorial = calculateFactorial(number);
        
        // Display the result to the user
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    /**
     * This method prompts the user to enter a non-negative integer and returns the input.
     * @return the validated non-negative integer input from the user
     */
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = -1; // Initialize to an invalid value
        boolean validInput = false;

        // Loop until a valid non-negative integer is entered
        while (!validInput) {
            System.out.print("Enter a non-negative integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 0) {
                    validInput = true; // Valid non-negative input received
                } else {
                    System.out.println("Error: Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter a valid non-negative integer.");
                scanner.next(); // Clear the invalid input
            }
        }
        return number;
    }

    /**
     * This method calculates the factorial of a given non-negative integer.
     * @param n the non-negative integer to calculate the factorial for
     * @return the calculated factorial
     */
    public static long calculateFactorial(int n) {
        long factorial = 1; // Initialize factorial to 1 (base case for 0!)
        
        // Calculate factorial using a loop
        for (int i = 1; i <= n; i++) {
            factorial *= i; // Multiply factorial by the current number
        }
        return factorial;
    }
}
