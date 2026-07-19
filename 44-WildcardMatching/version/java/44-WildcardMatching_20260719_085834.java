// Last updated: 7/19/2026, 8:58:34 AM
1class Solution {
2    public int candy(int[] ratings) {
3        int n = ratings.length;
4        int[] candies = new int[n];
5
6        // Every child gets at least one candy
7        Arrays.fill(candies, 1);
8
9        // Left to right
10        for (int i = 1; i < n; i++) {
11            if (ratings[i] > ratings[i - 1]) {
12                candies[i] = candies[i - 1] + 1;
13            }
14        }
15
16        // Right to left
17        for (int i = n - 2; i >= 0; i--) {
18            if (ratings[i] > ratings[i + 1]) {
19                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
20            }
21        }
22
23        int total = 0;
24        for (int candy : candies) {
25            total += candy;
26        }
27
28        return total;
29    }
30}