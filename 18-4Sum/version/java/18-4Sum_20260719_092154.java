// Last updated: 7/19/2026, 9:21:54 AM
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int i = nums.length - 2;
4
5        // Step 1: Find the first decreasing element from the end
6        while (i >= 0 && nums[i] >= nums[i + 1]) {
7            i--;
8        }
9
10        // Step 2: Find the next greater element and swap
11        if (i >= 0) {
12            int j = nums.length - 1;
13            while (nums[j] <= nums[i]) {
14                j--;
15            }
16            swap(nums, i, j);
17        }
18
19        // Step 3: Reverse the suffix
20        reverse(nums, i + 1, nums.length - 1);
21    }
22
23    private void swap(int[] nums, int i, int j) {
24        int temp = nums[i];
25        nums[i] = nums[j];
26        nums[j] = temp;
27    }
28
29    private void reverse(int[] nums, int left, int right) {
30        while (left < right) {
31            swap(nums, left, right);
32            left++;
33            right--;
34        }
35    }
36}