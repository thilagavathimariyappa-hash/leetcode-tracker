# Last updated: 7/19/2026, 9:56:00 AM
1class Solution:
2    def spiralOrder(self, matrix):
3        result = []
4
5        top = 0
6        bottom = len(matrix) - 1
7        left = 0
8        right = len(matrix[0]) - 1
9
10        while top <= bottom and left <= right:
11
12            # Left to Right
13            for i in range(left, right + 1):
14                result.append(matrix[top][i])
15            top += 1
16
17            # Top to Bottom
18            for i in range(top, bottom + 1):
19                result.append(matrix[i][right])
20            right -= 1
21
22            # Right to Left
23            if top <= bottom:
24                for i in range(right, left - 1, -1):
25                    result.append(matrix[bottom][i])
26                bottom -= 1
27
28            # Bottom to Top
29            if left <= right:
30                for i in range(bottom, top - 1, -1):
31                    result.append(matrix[i][left])
32                left += 1
33
34        return result