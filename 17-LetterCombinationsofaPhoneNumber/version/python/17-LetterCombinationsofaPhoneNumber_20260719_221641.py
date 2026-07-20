# Last updated: 7/19/2026, 10:16:41 PM
1class Solution:
2    def isMatch(self, s, p):
3        m = len(s)
4        n = len(p)
5
6        dp = [[False] * (n + 1) for _ in range(m + 1)]
7        dp[0][0] = True
8
9        # Handle patterns like *, **, ***
10        for j in range(1, n + 1):
11            if p[j - 1] == '*':
12                dp[0][j] = dp[0][j - 1]
13
14        for i in range(1, m + 1):
15            for j in range(1, n + 1):
16                if p[j - 1] == s[i - 1] or p[j - 1] == '?':
17                    dp[i][j] = dp[i - 1][j - 1]
18                elif p[j - 1] == '*':
19                    dp[i][j] = dp[i][j - 1] or dp[i - 1][j]
20
21        return dp[m][n]