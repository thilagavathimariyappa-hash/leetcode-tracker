# Last updated: 7/19/2026, 9:37:53 AM
1class Solution:
2    def permute(self, nums):
3        result = []
4
5        def backtrack(current, used):
6            if len(current) == len(nums):
7                result.append(current[:])
8                return
9
10            for i in range(len(nums)):
11                if used[i]:
12                    continue
13
14                used[i] = True
15                current.append(nums[i])
16
17                backtrack(current, used)
18
19                current.pop()
20                used[i] = False
21
22        backtrack([], [False] * len(nums))
23        return result