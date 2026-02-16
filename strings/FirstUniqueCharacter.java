/*
Problem: Find the first non-repeating character in a string.
Approach: Count character frequencies, then find first with count 1.
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));       // 0
        System.out.println(firstUniqChar("loveleetcode"));   // 2
        System.out.println(firstUniqChar("aabb"));           // -1
    }
}
