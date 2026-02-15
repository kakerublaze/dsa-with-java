/*
Problem: Left rotate an array by one position.
Approach: Store first element, shift others left, place first at end.
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class LeftRotateArrayByOne {

    public static void leftRotateByOne(int[] arr) {
        if (arr.length <= 1) return;

        int first = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        leftRotateByOne(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
