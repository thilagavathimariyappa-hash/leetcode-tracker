// Last updated: 7/11/2026, 4:19:07 AM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if (n <= 0) {
4            return false;
5        }
6
7        while (n % 2 == 0) {
8            n /= 2;
9        }
10
11        return n == 1;
12    }
13}