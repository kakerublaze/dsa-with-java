/*
Problem: Check if an array is sorted in ascending order.
Approach: Compare each element with the previous one.
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class CheckIfArrayIsSorted {

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 2, 4};

        System.out.println(isSorted(arr1)); // true
        System.out.println(isSorted(arr2)); // false
    }
}
