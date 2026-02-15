/*
Problem: Check if an array is sorted and rotated.
Approach: Count the number of places where order breaks.
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class CheckIfArrayIsSortedAndRotated {

    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
            }
        }

        // Check circular condition (last -> first)
        if (nums[0] < nums[n - 1]) {
            count++;
        }

        return count <= 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 1, 2};
        int[] arr2 = {1, 3, 2, 4};

        System.out.println(check(arr1)); // true
        System.out.println(check(arr2)); // false
    }
}
