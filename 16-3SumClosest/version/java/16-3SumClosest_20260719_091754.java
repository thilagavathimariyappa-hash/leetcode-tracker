// Last updated: 7/19/2026, 9:17:54 AM
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        Arrays.sort(nums);
4
5        int closest = nums[0] + nums[1] + nums[2];
6
7        for (int i = 0; i < nums.length - 2; i++) {
8            int left = i + 1;
9            int right = nums.length - 1;
10
11            while (left < right) {
12                int sum = nums[i] + nums[left] + nums[right];
13
14                if (Math.abs(target - sum) < Math.abs(target - closest)) {
15                    closest = sum;
16                }
17
18                if (sum < target) {
19                    left++;
20                } else if (sum > target) {
21                    right--;
22                } else {
23                    return sum;
24                }
25            }
26        }
27
28        return closest;
29    }
30}