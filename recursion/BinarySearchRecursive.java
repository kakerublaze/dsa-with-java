/*
Problem: Perform binary search using recursion.
Approach: Divide array and search in half recursively.
Time Complexity: O(log n)
Space Complexity: O(log n)
*/

public class BinarySearchRecursive {

    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high) return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) return mid;
        if (target < arr[mid])
            return binarySearch(arr, low, mid - 1, target);
        else
            return binarySearch(arr, mid + 1, high, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 7)); // 3
    }
}
