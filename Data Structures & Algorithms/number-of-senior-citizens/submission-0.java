class Solution {
    public int countSeniors(String[] details) {
        int seniors = 0;
        for (String detail : details) {
            int age = Integer.valueOf(detail.substring(detail.length() - 4, detail.length() - 2));
            if (age > 60) seniors += 1;
        }
        return seniors;
    }
}