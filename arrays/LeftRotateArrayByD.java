/*
Problem: Left rotate an array by D positions.
Approach: Use reversal algorithm (reverse parts of array).
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class LeftRotateArrayByD {

    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        if (n == 0) return;

        d = d % n; // handle d > n

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;

        leftRotate(arr, d);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
