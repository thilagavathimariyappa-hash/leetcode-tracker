// Last updated: 7/8/2026, 10:31:08 PM
class Solution {
    public int maxDistance(String moves) {
        int x = 0;
        int y = 0;
        int wildcards = 0;
        for(char ch : moves.toCharArray()) {
            switch(ch){
                case'U': x++; break;
                case'D': x--; break;
                case'L': y--; break;
                case'R': y++; break;
                case'_': wildcards++; break;
                default: break;
            }
        }
         return Math.abs(x) + Math.abs(y) + wildcards;
    }
}