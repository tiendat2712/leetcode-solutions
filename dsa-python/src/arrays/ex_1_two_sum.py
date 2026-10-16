# LeetCode #1 - Two Sum.
class ex_1_TwoSum:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        """Return two distinct indices. Average time O(n), extra space O(n)."""
        seen: dict[int, int] = {}
        for i, value in enumerate(nums):
            complement = target - value
            # Check before inserting so the same element is never used twice.
            if complement in seen:
                return [seen[complement], i]
            seen[value] = i
        raise ValueError("No valid pair exists")
