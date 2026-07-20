# Last updated: 7/19/2026, 10:14:39 PM
1class Solution:
2    def countAndSay(self, n):
3        result = "1"
4
5        for _ in range(n - 1):
6            current = ""
7            count = 1
8
9            for i in range(1, len(result)):
10                if result[i] == result[i - 1]:
11                    count += 1
12                else:
13                    current += str(count) + result[i - 1]
14                    count = 1
15
16            current += str(count) + result[-1]
17            result = current
18
19        return result