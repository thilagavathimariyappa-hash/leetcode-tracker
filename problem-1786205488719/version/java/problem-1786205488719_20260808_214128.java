// Last updated: 8/8/2026, 9:41:28 PM
1class Solution {
2    public double minPrice(int[] prices, int[] discounts) {
3        Arrays.sort(prices);
4        Arrays.sort(discounts);
5        double total=0;
6        int pIndex = prices.length-1;
7        int dIndex = discounts.length-1;
8        while(pIndex>=0&&dIndex>=0){
9            double discountPercent = discounts[dIndex];
10            total += prices[pIndex]*(100.0-discountPercent)/100.0;
11            pIndex--;
12            dIndex--;
13        }
14        while (pIndex >= 0){
15            total += prices[pIndex];
16            pIndex--;
17        }
18        return total;
19    }
20}