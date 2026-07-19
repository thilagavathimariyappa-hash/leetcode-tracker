# Last updated: 7/19/2026, 9:54:22 AM
1class Solution:
2    def solveNQueens(self, n):
3        result = []
4        board = [["."] * n for _ in range(n)]
5
6        cols = set()
7        diag1 = set()   # row - col
8        diag2 = set()   # row + col
9
10        def backtrack(row):
11            if row == n:
12                result.append(["".join(r) for r in board])
13                return
14
15            for col in range(n):
16                if col in cols or (row - col) in diag1 or (row + col) in diag2:
17                    continue
18
19                board[row][col] = "Q"
20                cols.add(col)
21                diag1.add(row - col)
22                diag2.add(row + col)
23
24                backtrack(row + 1)
25
26                board[row][col] = "."
27                cols.remove(col)
28                diag1.remove(row - col)
29                diag2.remove(row + col)
30
31        backtrack(0)
32        return result