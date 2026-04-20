class Solution {
    public int getSum(int a, int b) {
        /*
            a = 01
            b = 01

            a = a ^ b = 00
            b = (a & b) << 1 = 10

            a = a ^ b = 10
            b = (a & b) << 1 = 00
        */
        while (b != 0) {
            int tmp = a;
            a = a ^ b;
            b = (tmp & b) << 1;
        }
        return a;
    }
}
