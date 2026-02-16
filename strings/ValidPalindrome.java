/*
Problem: Check if string can be palindrome after deleting at most one character.
Approach: Two pointers, allow one skip.
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class ValidPalindrome {

    public static boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) ||
                       isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));   // true
        System.out.println(validPalindrome("abca"));  // true
        System.out.println(validPalindrome("abc"));   // false
    }
}
