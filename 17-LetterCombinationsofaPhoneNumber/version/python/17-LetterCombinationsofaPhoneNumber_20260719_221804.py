# Last updated: 7/19/2026, 10:18:04 PM
1class Solution:
2    def lengthOfLastWord(self, s):
3        s = s.strip()
4        length = 0
5
6        for i in range(len(s) - 1, -1, -1):
7            if s[i] == ' ':
8                break
9            length += 1
10
11        return length