# Last updated: 7/19/2026, 10:10:03 PM
1class Solution:
2    def generateParenthesis(self, n):
3        result = []
4
5        def backtrack(current, openCount, closeCount):
6            if len(current) == 2 * n:
7                result.append(current)
8                return
9
10            if openCount < n:
11                backtrack(current + "(", openCount + 1, closeCount)
12
13            if closeCount < openCount:
14                backtrack(current + ")", openCount, closeCount + 1)
15
16        backtrack("", 0, 0)
17        return result