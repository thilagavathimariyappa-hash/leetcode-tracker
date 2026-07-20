# Last updated: 7/19/2026, 10:08:48 PM
1class Solution:
2    def romanToInt(self, s):
3        roman = {
4            'I': 1,
5            'V': 5,
6            'X': 10,
7            'L': 50,
8            'C': 100,
9            'D': 500,
10            'M': 1000
11        }
12
13        total = 0
14
15        for i in range(len(s)):
16            if i < len(s) - 1 and roman[s[i]] < roman[s[i + 1]]:
17                total -= roman[s[i]]
18            else:
19                total += roman[s[i]]
20
21        return total