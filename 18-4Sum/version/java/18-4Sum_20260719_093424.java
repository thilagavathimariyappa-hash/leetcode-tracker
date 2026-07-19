// Last updated: 7/19/2026, 9:34:24 AM
1class Solution {
2    public int trap(int[] height) {
3        int left = 0;
4        int right = height.length - 1;
5
6        int leftMax = 0;
7        int rightMax = 0;
8        int water = 0;
9
10        while (left < right) {
11            if (height[left] < height[right]) {
12                if (height[left] >= leftMax) {
13                    leftMax = height[left];
14                } else {
15                    water += leftMax - height[left];
16                }
17                left++;
18            } else {
19                if (height[right] >= rightMax) {
20                    rightMax = height[right];
21                } else {
22                    water += rightMax - height[right];
23                }
24                right--;
25            }
26        }
27
28        return water;
29    }
30}