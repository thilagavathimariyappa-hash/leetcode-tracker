// Last updated: 7/19/2026, 9:26:41 AM
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        HashSet<String> set = new HashSet<>();
4
5        for (int i = 0; i < 9; i++) {
6            for (int j = 0; j < 9; j++) {
7                char num = board[i][j];
8
9                if (num != '.') {
10                    if (!set.add(num + "row" + i) ||
11                        !set.add(num + "col" + j) ||
12                        !set.add(num + "box" + (i / 3) + "-" + (j / 3))) {
13                        return false;
14                    }
15                }
16            }
17        }
18
19        return true;
20    }
21}