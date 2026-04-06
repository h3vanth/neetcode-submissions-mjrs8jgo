class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(String.format("%03d", str.length())).append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strings = new ArrayList<>();
        while (str.length() != 0) {
            int length = Integer.parseInt(str.substring(0, 3));
            strings.add(str.substring(3, length + 3));
            str = str.substring(length + 3);
        }
        return strings;
    }
}
