/*
Problem: Remove duplicates from a sorted array.
Approach: Use two pointers to overwrite duplicates in-place.
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int index = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index; // new length
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};

        int newLength = removeDuplicates(arr);

        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
