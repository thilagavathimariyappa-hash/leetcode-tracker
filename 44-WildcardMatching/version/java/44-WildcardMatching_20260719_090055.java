// Last updated: 7/19/2026, 9:00:55 AM
1class Solution {
2    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
3        int[] ans = new int[k];
4
5        int start = Math.max(0, k - nums2.length);
6        int end = Math.min(k, nums1.length);
7
8        for (int i = start; i <= end; i++) {
9            int[] a = maxArray(nums1, i);
10            int[] b = maxArray(nums2, k - i);
11            int[] candidate = merge(a, b);
12
13            if (greater(candidate, 0, ans, 0)) {
14                ans = candidate;
15            }
16        }
17
18        return ans;
19    }
20
21    private int[] maxArray(int[] nums, int k) {
22        int[] stack = new int[k];
23        int top = -1;
24        int remain = nums.length - k;
25
26        for (int num : nums) {
27            while (top >= 0 && stack[top] < num && remain > 0) {
28                top--;
29                remain--;
30            }
31
32            if (top + 1 < k) {
33                stack[++top] = num;
34            } else {
35                remain--;
36            }
37        }
38
39        return stack;
40    }
41
42    private int[] merge(int[] a, int[] b) {
43        int[] res = new int[a.length + b.length];
44        int i = 0, j = 0, r = 0;
45
46        while (i < a.length || j < b.length) {
47            if (greater(a, i, b, j)) {
48                res[r++] = a[i++];
49            } else {
50                res[r++] = b[j++];
51            }
52        }
53
54        return res;
55    }
56
57    private boolean greater(int[] a, int i, int[] b, int j) {
58        while (i < a.length && j < b.length && a[i] == b[j]) {
59            i++;
60            j++;
61        }
62
63        if (j == b.length) {
64            return true;
65        }
66
67        if (i == a.length) {
68            return false;
69        }
70
71        return a[i] > b[j];
72    }
73}