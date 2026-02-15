/*
Problem: Move all zeros to the end of the array.
Approach: Use two pointers to shift non-zero elements forward.
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MoveZerosToEnd {

    public static void moveZeros(int[] arr) {
        int index = 0;

        // Move non-zero elements to front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Fill remaining positions with zero
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZeros(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
