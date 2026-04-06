class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        Map<Integer, Integer> indexByValue = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer val;
            if ((val = indexByValue.get(target - nums[i])) != null) {
                indices[0] = val;
                indices[1] = i;
                break;
            }
            indexByValue.put(nums[i], i);
        }
        return indices;
    }
}
