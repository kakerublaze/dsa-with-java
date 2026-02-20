/*
Problem: Find number of ways to climb stairs.
Approach: Recursion with memoization.
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class ClimbingStairsRecursion {

    public static int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return ways(n, memo);
    }

    private static int ways(int n, int[] memo) {
        if (n <= 2) return n;

        if (memo[n] != 0) return memo[n];

        memo[n] = ways(n - 1, memo) + ways(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5)); // 8
    }
}
