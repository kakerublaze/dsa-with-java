/*
Problem: Find the missing number in range 0 to N.
Approach: Use sum formula.
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class FindMissingNumber {

    public static int findMissing(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 4};
        int n = 4;

        System.out.println("Missing number: " + findMissing(arr, n));
    }
}
