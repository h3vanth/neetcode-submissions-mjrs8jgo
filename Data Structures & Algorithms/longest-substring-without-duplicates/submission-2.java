class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 1) {
            return 0;
        }

        int l = 0;
        int r = 1;
        int len = 1;

        while (r < s.length()) {
            String s1 = s.substring(l, r);
            if (!s1.contains(String.valueOf(s.charAt(r)))) {
                len = Math.max(s1.length() + 1, len);
                r++;
            } else {
                l++;
                r = l + 1;
            }
        }

        return len;
    }
}
