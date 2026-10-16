package hashing;

import java.util.HashMap;
import java.util.Map;

/** LeetCode #1 - Two Sum. */
public class ex_1_TwoSum {
    // Time: O(n) on average. Extra space: O(n).
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Check before inserting so the same element is never used twice.
            Integer previousIndex = seen.get(complement);
            if (previousIndex != null) {
                return new int[] {previousIndex, i};
            }
            seen.put(nums[i], i);
        }
        throw new IllegalArgumentException("No valid pair exists");
    }
}
