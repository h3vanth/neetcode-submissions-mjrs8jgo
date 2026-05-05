class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        var l = 0
        var r = 0
        var max = 0;
        var map = mutableMapOf<Char, Int>();
        while (r < s.length) {
            map[s[r]] = map.getOrDefault(s[r], 0).plus(1)
            if (r - l + 1 - (map.values.maxOrNull() ?: 0) <= k) {
                max = maxOf(max, r - l + 1)
                r++;
            } else {
                map[s[l]] = map.getOrDefault(s[l], 0).minus(1)
                l++
                // 1. Each iteration incrementing character count at r by 1
                // 2. When l changes, r will be in the same place
                // 3. To account for 1, decrementing by 1
                map[s[r]] = map.getOrDefault(s[r], 0).minus(1)
            }
        }
        return max
    }
}
