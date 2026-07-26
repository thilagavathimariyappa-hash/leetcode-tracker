// Last updated: 7/25/2026, 9:42:15 PM
1class Solution {
2    public int largestInteger(int n, int s) {
3        if(s==0)
4            return 0;
5        if(s>9*n)
6            return -1;
7        StringBuilder ans = new StringBuilder();
8
9        while (n>0){
10            if(s>= 9){
11                ans.append(9);
12                s -= 9;
13            }else{
14                ans.append(s);
15                s = 0;
16            }
17            n--;
18        }
19        return Integer.parseInt(ans.toString());
20    }
21}