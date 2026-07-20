# Last updated: 7/19/2026, 10:28:06 PM
1class Solution:
2    def setZeroes(self, matrix):
3        rows = len(matrix)
4        cols = len(matrix[0])
5
6        first_row = False
7        first_col = False
8
9        # Check first row
10        for j in range(cols):
11            if matrix[0][j] == 0:
12                first_row = True
13                break
14
15        # Check first column
16        for i in range(rows):
17            if matrix[i][0] == 0:
18                first_col = True
19                break
20
21        # Mark rows and columns
22        for i in range(1, rows):
23            for j in range(1, cols):
24                if matrix[i][j] == 0:
25                    matrix[i][0] = 0
26                    matrix[0][j] = 0
27
28        # Set zeroes based on markers
29        for i in range(1, rows):
30            if matrix[i][0] == 0:
31                for j in range(1, cols):
32                    matrix[i][j] = 0
33
34        for j in range(1, cols):
35            if matrix[0][j] == 0:
36                for i in range(1, rows):
37                    matrix[i][j] = 0
38
39        # Set first row to zero if needed
40        if first_row:
41            for j in range(cols):
42                matrix[0][j] = 0
43
44        # Set first column to zero if needed
45        if first_col:
46            for i in range(rows):
47                matrix[i][0] = 0