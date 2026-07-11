// Last updated: 7/11/2026, 4:27:22 AM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length;
4
5        int expectedSum = n * (n + 1) / 2;
6        int actualSum = 0;
7
8        for (int num : nums) {
9            actualSum += num;
10        }
11
12        return expectedSum - actualSum;
13    }
14}