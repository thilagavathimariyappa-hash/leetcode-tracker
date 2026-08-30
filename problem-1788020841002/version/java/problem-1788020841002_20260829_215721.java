// Last updated: 8/29/2026, 9:57:21 PM
1public class Solution {
2public int countSpecialIntegers(int[] nums) {
3    HashSet<Integer> seen = new HashSet<>();
4    HashSet<Integer> bad = new HashSet<>();
5    int prev = nums[0];
6    seen.add(prev);
7
8    for(int i = 1; i < nums.length;i++){
9        int x = nums[i];  
10            
11        if(seen.contains(x)&& x != prev){
12            bad.add(x);
13        }
14        seen.add(x);
15        prev = x;
16    }
17    return seen.size()-bad.size();
18}
19}