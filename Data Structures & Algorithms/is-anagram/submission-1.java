class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Long> countByChar1 = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        Map<Character, Long> countByChar2 = t.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        for (int i = 0; i < s.length(); i++) {
            if (!countByChar1.get(s.charAt(i)).equals(countByChar2.get(s.charAt(i)))) {
                return false;
            }
        }

        return true;
    }
}
