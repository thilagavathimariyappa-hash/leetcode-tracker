# Last updated: 7/19/2026, 10:23:29 PM
1from collections import Counter
2
3class Solution:
4    def minWindow(self, s, t):
5        if not s or not t:
6            return ""
7
8        need = Counter(t)
9        required = len(need)
10
11        left = 0
12        formed = 0
13        window = {}
14        ans = [float("inf"), 0, 0]
15
16        for right in range(len(s)):
17            char = s[right]
18            window[char] = window.get(char, 0) + 1
19
20            if char in need and window[char] == need[char]:
21                formed += 1
22
23            while left <= right and formed == required:
24                if right - left + 1 < ans[0]:
25                    ans = [right - left + 1, left, right]
26
27                left_char = s[left]
28                window[left_char] -= 1
29
30                if left_char in need and window[left_char] < need[left_char]:
31                    formed -= 1
32
33                left += 1
34
35        if ans[0] == float("inf"):
36            return ""
37
38        return s[ans[1]:ans[2] + 1]