# Last updated: 7/19/2026, 9:29:42 AM
1class Solution:
2    def combinationSum(self, candidates, target):
3        result = []
4
5        def backtrack(start, target, current):
6            if target == 0:
7                result.append(current[:])
8                return
9
10            if target < 0:
11                return
12
13            for i in range(start, len(candidates)):
14                current.append(candidates[i])
15
16                # Reuse the same element
17                backtrack(i, target - candidates[i], current)
18
19                current.pop()
20
21        backtrack(0, target, [])
22        return result