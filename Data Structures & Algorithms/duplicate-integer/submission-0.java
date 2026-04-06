class Solution {
    public boolean hasDuplicate(int[] nums) {
        return new HashSet<>(Arrays.stream(nums).mapToObj(Integer::valueOf).toList()).size() != nums.length;
    }
}