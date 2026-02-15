/*
Problem: Find the element that appears once while others appear twice.
Approach: Use XOR.
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class FindSingleElement {

    public static int findSingle(int[] arr) {
        int result = 0;

        for (int num : arr) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};

        System.out.println("Single element: " + findSingle(arr));
    }
}
