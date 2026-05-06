package basic_problems;

/**
 * Problem: Reverse a Number
 *
 * Example:
 * Input: 1234
 * Output: 4321
 *
 * Approach:
 * - Extract last digit using %
 * - Build reversed number
 * - Remove last digit using /
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class ReverseNumber {

    public static int reverse(int num) {

        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;

            reversed = reversed * 10 + digit;

            num = num / 10;
        }

        return reversed;
    }

    public static void main(String[] args) {

        int number = 1234;

        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reverse(number));
    }
}
