/*
Problem: Find the second largest element in an array.
Approach: Traverse once while tracking largest and second largest.
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class SecondLargestElementInArray {

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 7, 3, 9, 9};
        System.out.println("Second largest element: " + findSecondLargest(arr));
    }
}
