class Solution {
    public int[] countBits(int n) {
        int[] output = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int temp = i;
            while (temp != 0) {
                temp = temp & (temp - 1);
                output[i]++;
            }
        }
        return output;
    }
}
