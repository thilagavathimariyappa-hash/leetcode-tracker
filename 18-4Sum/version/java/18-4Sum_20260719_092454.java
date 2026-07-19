// Last updated: 7/19/2026, 9:24:54 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while (left <= right) {
7            int mid = left + (right - left) / 2;
8
9            if (nums[mid] == target) {
10                return mid;
11            }
12
13            // Left half is sorted
14            if (nums[left] <= nums[mid]) {
15                if (target >= nums[left] && target < nums[mid]) {
16                    right = mid - 1;
17                } else {
18                    left = mid + 1;
19                }
20            }
21            // Right half is sorted
22            else {
23                if (target > nums[mid] && target <= nums[right]) {
24                    left = mid + 1;
25                } else {
26                    right = mid - 1;
27                }
28            }
29        }
30
31        return -1;
32    }
33}