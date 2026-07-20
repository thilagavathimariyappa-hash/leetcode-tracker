# Last updated: 7/19/2026, 10:18:42 PM
1class Solution:
2    def isNumber(self, s):
3        s = s.strip()
4
5        seen_digit = False
6        seen_dot = False
7        seen_exp = False
8
9        for i, ch in enumerate(s):
10            if ch.isdigit():
11                seen_digit = True
12
13            elif ch == '.':
14                if seen_dot or seen_exp:
15                    return False
16                seen_dot = True
17
18            elif ch == 'e' or ch == 'E':
19                if seen_exp or not seen_digit:
20                    return False
21                seen_exp = True
22                seen_digit = False
23
24            elif ch == '+' or ch == '-':
25                if i != 0 and s[i - 1] not in ['e', 'E']:
26                    return False
27
28            else:
29                return False
30
31        return seen_digit