package math;

/** LeetCode #9 - Palindrome Number. */
public class ex_9_PalindromeNumber {
    // Reverse only half of the digits. Time: O(digits), extra space: O(1).
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // For odd digit counts, discard the middle digit.
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
