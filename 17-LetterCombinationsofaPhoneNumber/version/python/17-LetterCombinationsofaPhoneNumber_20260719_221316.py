# Last updated: 7/19/2026, 10:13:16 PM
1class Solution:
2    def longestValidParentheses(self, s):
3        stack = [-1]
4        max_len = 0
5
6        for i in range(len(s)):
7            if s[i] == '(':
8                stack.append(i)
9            else:
10                stack.pop()
11
12                if not stack:
13                    stack.append(i)
14                else:
15                    max_len = max(max_len, i - stack[-1])
16
17        return max_len