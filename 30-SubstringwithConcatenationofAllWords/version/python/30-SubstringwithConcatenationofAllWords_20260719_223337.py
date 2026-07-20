# Last updated: 7/19/2026, 10:33:37 PM
1class Solution:
2    def wordBreak(self, s, wordDict):
3        wordSet = set(wordDict)
4        n = len(s)
5
6        dp = [False] * (n + 1)
7        dp[0] = True
8
9        for i in range(1, n + 1):
10            for j in range(i):
11                if dp[j] and s[j:i] in wordSet:
12                    dp[i] = True
13                    break
14
15        return dp[n]