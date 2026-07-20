# Last updated: 7/19/2026, 10:40:47 PM
1class Solution:
2    def gcd(self, a, b):
3        while b:
4            a, b = b, a % b
5        return abs(a)
6
7    def maxPoints(self, points):
8        n = len(points)
9        if n <= 2:
10            return n
11
12        ans = 0
13
14        for i in range(n):
15            slopes = {}
16            same = 1
17            x1, y1 = points[i]
18
19            for j in range(i + 1, n):
20                x2, y2 = points[j]
21
22                dx = x2 - x1
23                dy = y2 - y1
24
25                if dx == 0 and dy == 0:
26                    same += 1
27                    continue
28
29                g = self.gcd(dx, dy)
30                dx //= g
31                dy //= g
32
33                if dx < 0:
34                    dx = -dx
35                    dy = -dy
36                elif dx == 0:
37                    dy = 1
38                elif dy == 0:
39                    dx = 1
40
41                slope = (dx, dy)
42                slopes[slope] = slopes.get(slope, 0) + 1
43
44            current = same
45            for count in slopes.values():
46                current = max(current, count + same)
47
48            ans = max(ans, current)
49
50        return ans