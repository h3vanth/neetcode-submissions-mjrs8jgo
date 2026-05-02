class Solution {
    fun findMin(nums: IntArray): Int {
        var min = nums[0]
        var l = 0
        var r = nums.size - 1
        while (l <= r) {
            if (nums[l] < nums[r]) {
                min = Math.min(min, nums[l])
                break;
            }
            var m = (l + r) / 2
            min = Math.min(min, nums[m])
            if (nums[m] >= nums[l]) {
                l = m + 1
            } else {
                r = m - 1
            }
        }
        return min
    }
}
