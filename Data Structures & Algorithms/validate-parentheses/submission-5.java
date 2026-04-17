class Solution {
    public boolean isValid(String s) {
        if (s.length() <= 1) {
            return false;
        }

        Deque<Character> b = new ArrayDeque<>();
        Map<Character, Character> map =
            Map.of('[', ']', '{', '}', '(', ')');
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            if (c1 == '(' || c1 == '[' || c1 == '{') {
                b.push(c1);
            } else {
                if (b.isEmpty()) return false;
                char c2 = b.pop();
                if (map.get(c2) != c1) {
                    return false;
                }
            }
        }
        return b.isEmpty();
    }
}
