# Last updated: 7/19/2026, 9:32:07 AM
1class Solution:
2    def combinationSum2(self, candidates, target):
3        candidates.sort()
4        result = []
5
6        def backtrack(start, target, current):
7            if target == 0:
8                result.append(current[:])
9                return
10
11            if target < 0:
12                return
13
14            for i in range(start, len(candidates)):
15                # Skip duplicates
16                if i > start and candidates[i] == candidates[i - 1]:
17                    continue
18
19                current.append(candidates[i])
20
21                # Move to the next index (each number can be used only once)
22                backtrack(i + 1, target - candidates[i], current)
23
24                current.pop()
25
26        backtrack(0, target, [])
27        return result