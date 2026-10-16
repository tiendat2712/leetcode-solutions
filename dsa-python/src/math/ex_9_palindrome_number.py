# LeetCode #9 - Palindrome Number.
class ex_9_PalindromeNumber:
    def isPalindrome(self, x: int) -> bool:
        """Reverse half the digits. Time: O(digits), extra space: O(1)."""
        if x < 0 or (x != 0 and x % 10 == 0):
            return False

        reversed_half = 0
        while x > reversed_half:
            reversed_half = reversed_half * 10 + x % 10
            x //= 10

        # For odd digit counts, discard the middle digit.
        return x == reversed_half or x == reversed_half // 10
