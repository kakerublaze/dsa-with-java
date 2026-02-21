import java.util.ArrayList;
import java.util.List;

/*
Problem: Generate all permutations of array.
Approach: Backtracking with swapping.
Time Complexity: O(n!)
Space Complexity: O(n)
*/

public class PermutationsUsingRecursion {

    public static void backtrack(int[] nums, int start,
                                 List<List<Integer>> result) {

        if (start == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) list.add(num);
            result.add(list);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            backtrack(nums, start + 1, result);
            swap(nums, start, i);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, result);
        System.out.println(result);
    }
}
