# Last updated: 7/19/2026, 10:34:36 PM
1class Solution:
2    def wordBreak(self, s, wordDict):
3        wordSet = set(wordDict)
4        memo = {}
5
6        def dfs(start):
7            if start in memo:
8                return memo[start]
9
10            if start == len(s):
11                return [""]
12
13            result = []
14
15            for end in range(start + 1, len(s) + 1):
16                word = s[start:end]
17
18                if word in wordSet:
19                    suffixes = dfs(end)
20
21                    for suffix in suffixes:
22                        if suffix:
23                            result.append(word + " " + suffix)
24                        else:
25                            result.append(word)
26
27            memo[start] = result
28            return result
29
30        return dfs(0)
31        