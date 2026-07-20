# Last updated: 7/19/2026, 10:11:48 PM
1class Solution:
2    def strStr(self, haystack, needle):
3        n = len(haystack)
4        m = len(needle)
5
6        if m == 0:
7            return 0
8
9        for i in range(n - m + 1):
10            if haystack[i:i + m] == needle:
11                return i
12
13        return -1