# Last updated: 7/19/2026, 10:22:37 PM
1class Solution:
2    def minDistance(self, word1, word2):
3        m = len(word1)
4        n = len(word2)
5
6        dp = [[0] * (n + 1) for _ in range(m + 1)]
7
8        for i in range(m + 1):
9            dp[i][0] = i
10
11        for j in range(n + 1):
12            dp[0][j] = j
13
14        for i in range(1, m + 1):
15            for j in range(1, n + 1):
16                if word1[i - 1] == word2[j - 1]:
17                    dp[i][j] = dp[i - 1][j - 1]
18                else:
19                    dp[i][j] = 1 + min(
20                        dp[i - 1][j],     # Delete
21                        dp[i][j - 1],     # Insert
22                        dp[i - 1][j - 1]  # Replace
23                    )
24
25        return dp[m][n]