/*
Problem: Find factorial of a number using recursion.
Approach: n * factorial(n-1) with base case n == 0.
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class FactorialUsingRecursion {

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // 120
    }
}
