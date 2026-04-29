class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 1) {
            return nums[0] == 1 ? 1 : 0;
        }
        int l = 0;
        int r = 0;
        int max = 0;
        while (r < nums.length) {
            if (nums[l] != 1) {
                l++;
                r++;
                continue;
            }
            if (nums[r] != 1) {
               max = Math.max(max, r - l);
               l = ++r;
            } else {
                r++;
            }
        }
        max = Math.max(max, r - l);
        return max;
    }
}