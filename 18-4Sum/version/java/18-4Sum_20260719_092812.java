// Last updated: 7/19/2026, 9:28:12 AM
1class Solution {
2    public void solveSudoku(char[][] board) {
3        solve(board);
4    }
5
6    private boolean solve(char[][] board) {
7        for (int row = 0; row < 9; row++) {
8            for (int col = 0; col < 9; col++) {
9
10                if (board[row][col] == '.') {
11
12                    for (char num = '1'; num <= '9'; num++) {
13
14                        if (isValid(board, row, col, num)) {
15                            board[row][col] = num;
16
17                            if (solve(board)) {
18                                return true;
19                            }
20
21                            board[row][col] = '.';
22                        }
23                    }
24
25                    return false;
26                }
27            }
28        }
29
30        return true;
31    }
32
33    private boolean isValid(char[][] board, int row, int col, char num) {
34
35        for (int i = 0; i < 9; i++) {
36
37            if (board[row][i] == num) {
38                return false;
39            }
40
41            if (board[i][col] == num) {
42                return false;
43            }
44
45            int r = 3 * (row / 3) + i / 3;
46            int c = 3 * (col / 3) + i % 3;
47
48            if (board[r][c] == num) {
49                return false;
50            }
51        }
52
53        return true;
54    }
55}