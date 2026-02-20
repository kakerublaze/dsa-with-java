import java.util.ArrayList;
import java.util.List;

/*
Problem: Generate all subsets of an array.
Approach: Backtracking using recursion (include/exclude).
Time Complexity: O(2^n)
Space Complexity: O(n)
*/

public class SubsetsUsingRecursion {

    public static void generateSubsets(int[] nums, int index,
                                       List<Integer> current,
                                       List<List<Integer>> result) {

        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // include current element
        current.add(nums[index]);
        generateSubsets(nums, index + 1, current, result);

        // exclude current element
        current.remove(current.size() - 1);
        generateSubsets(nums, index + 1, current, result);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();

        generateSubsets(nums, 0, new ArrayList<>(), result);

        System.out.println(result);
    }
}
