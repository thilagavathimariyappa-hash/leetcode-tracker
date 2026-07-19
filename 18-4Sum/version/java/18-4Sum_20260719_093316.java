// Last updated: 7/19/2026, 9:33:16 AM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int n = nums.length;
4
5        for (int i = 0; i < n; i++) {
6            while (nums[i] > 0 &&
7                   nums[i] <= n &&
8                   nums[nums[i] - 1] != nums[i]) {
9
10                int temp = nums[i];
11                nums[i] = nums[temp - 1];
12                nums[temp - 1] = temp;
13            }
14        }
15
16        for (int i = 0; i < n; i++) {
17            if (nums[i] != i + 1) {
18                return i + 1;
19            }
20        }
21
22        return n + 1;
23    }
24}