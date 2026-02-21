import java.util.*;

/*
Problem: Generate all valid parentheses combinations.
Approach: Backtracking with open/close constraints.
Time Complexity: Catalan number (~4^n / sqrt(n))
Space Complexity: O(n)
*/

public class GenerateParentheses {

    public static void backtrack(List<String> result, String current,
                                 int open, int close, int n) {

        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }

        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, 3);
        System.out.println(result);
    }
}
