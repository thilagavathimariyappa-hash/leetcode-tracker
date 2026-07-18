// Last updated: 7/18/2026, 9:26:32 AM
1class Solution {
2    public String rearrangeString(String s, char x, char y) {
3        StringBuilder before = new StringBuilder();
4        StringBuilder middle = new StringBuilder();
5        StringBuilder after = new StringBuilder();
6
7        for(char ch : s.toCharArray()){
8            if(ch==y){
9                before.append(ch);
10            }else if(ch==x){
11                after.append(ch);
12            }else{
13                middle.append(ch);
14            }
15        }
16        return before.toString()+middle.toString()+after.toString();
17    }
18}