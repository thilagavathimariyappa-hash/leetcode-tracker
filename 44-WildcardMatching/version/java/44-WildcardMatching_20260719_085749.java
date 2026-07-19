// Last updated: 7/19/2026, 8:57:49 AM
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        int totalGas = 0;
4        int totalCost = 0;
5        int tank = 0;
6        int start = 0;
7
8        for (int i = 0; i < gas.length; i++) {
9            totalGas += gas[i];
10            totalCost += cost[i];
11
12            tank += gas[i] - cost[i];
13
14            if (tank < 0) {
15                start = i + 1;
16                tank = 0;
17            }
18        }
19
20        if (totalGas < totalCost) {
21            return -1;
22        }
23
24        return start;
25    }
26}