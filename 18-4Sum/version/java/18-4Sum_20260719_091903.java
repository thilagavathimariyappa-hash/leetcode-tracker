// Last updated: 7/19/2026, 9:19:03 AM
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        List<List<Integer>> result = new ArrayList<>();
4
5        Arrays.sort(nums);
6        int n = nums.length;
7
8        for (int i = 0; i < n - 3; i++) {
9
10            if (i > 0 && nums[i] == nums[i - 1]) {
11                continue;
12            }
13
14            for (int j = i + 1; j < n - 2; j++) {
15
16                if (j > i + 1 && nums[j] == nums[j - 1]) {
17                    continue;
18                }
19
20                int left = j + 1;
21                int right = n - 1;
22
23                while (left < right) {
24                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
25
26                    if (sum == target) {
27                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
28
29                        while (left < right && nums[left] == nums[left + 1]) {
30                            left++;
31                        }
32
33                        while (left < right && nums[right] == nums[right - 1]) {
34                            right--;
35                        }
36
37                        left++;
38                        right--;
39                    } else if (sum < target) {
40                        left++;
41                    } else {
42                        right--;
43                    }
44                }
45            }
46        }
47
48        return result;
49    }
50}