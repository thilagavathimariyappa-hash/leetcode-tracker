# Last updated: 7/19/2026, 10:15:54 PM
1class Solution:
2    def multiply(self, num1, num2):
3        if num1 == "0" or num2 == "0":
4            return "0"
5
6        m, n = len(num1), len(num2)
7        result = [0] * (m + n)
8
9        for i in range(m - 1, -1, -1):
10            for j in range(n - 1, -1, -1):
11                mul = int(num1[i]) * int(num2[j])
12                p1 = i + j
13                p2 = i + j + 1
14
15                total = mul + result[p2]
16                result[p2] = total % 10
17                result[p1] += total // 10
18
19        ans = ""
20
21        for num in result:
22            if not (len(ans) == 0 and num == 0):
23                ans += str(num)
24
25        return ans