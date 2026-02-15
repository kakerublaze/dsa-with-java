/*
Problem: Find union of two sorted arrays.
Approach: Two pointers.
Time Complexity: O(n + m)
Space Complexity: O(n + m)
*/

import java.util.ArrayList;
import java.util.List;

public class UnionOfSortedArrays {

    public static List<Integer> findUnion(int[] arr1, int[] arr2) {
        List<Integer> union = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                addIfNotDuplicate(union, arr1[i++]);
            } else if (arr1[i] > arr2[j]) {
                addIfNotDuplicate(union, arr2[j++]);
            } else {
                addIfNotDuplicate(union, arr1[i]);
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            addIfNotDuplicate(union, arr1[i++]);
        }

        while (j < arr2.length) {
            addIfNotDuplicate(union, arr2[j++]);
        }

        return union;
    }

    private static void addIfNotDuplicate(List<Integer> list, int value) {
        if (list.isEmpty() || list.get(list.size() - 1) != value) {
            list.add(value);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 5, 6};

        System.out.println(findUnion(arr1, arr2));
    }
}
