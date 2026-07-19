// Last updated: 7/19/2026, 9:11:39 AM
1class Solution {
2    public boolean increasingTriplet(int[] nums) {
3        int first = Integer.MAX_VALUE;
4        int second = Integer.MAX_VALUE;
5
6        for (int num : nums) {
7            if (num <= first) {
8                first = num;
9            } else if (num <= second) {
10                second = num;
11            } else {
12                return true;
13            }
14        }
15
16        return false;
17    }
18}