/*
Problem: Check if one string is rotation of another.
Approach: Concatenate original string with itself and check substring.
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class StringRotationCheck {

    public static boolean isRotation(String s, String goal) {
        if (s.length() != goal.length()) return false;

        String combined = s + s;
        return combined.contains(goal);
    }

    public static void main(String[] args) {
        System.out.println(isRotation("abcd", "cdab")); // true
        System.out.println(isRotation("abcd", "acbd")); // false
    }
}
