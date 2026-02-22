import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    public static List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s.toCharArray(), 0, result);
        return result;
    }

    private static void backtrack(char[] arr, int index, List<String> result) {
        if (index == arr.length) {
            result.add(new String(arr));
            return;
        }

        if (Character.isLetter(arr[index])) {
            // Lowercase
            arr[index] = Character.toLowerCase(arr[index]);
            backtrack(arr, index + 1, result);

            // Uppercase
            arr[index] = Character.toUpperCase(arr[index]);
            backtrack(arr, index + 1, result);
        } else {
            backtrack(arr, index + 1, result);
        }
    }

    public static void main(String[] args) {
        String input = "a1b2";
        System.out.println(letterCasePermutation(input));
    }
}
