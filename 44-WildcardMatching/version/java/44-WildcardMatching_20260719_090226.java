// Last updated: 7/19/2026, 9:02:26 AM
1class Solution {
2    public void wiggleSort(int[] nums) {
3        int[] temp = nums.clone();
4        Arrays.sort(temp);
5
6        int n = nums.length;
7        int left = (n - 1) / 2;
8        int right = n - 1;
9
10        for (int i = 0; i < n; i++) {
11            if (i % 2 == 0) {
12                nums[i] = temp[left--];
13            } else {
14                nums[i] = temp[right--];
15            }
16        }
17    }
18}