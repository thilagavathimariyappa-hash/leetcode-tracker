// Last updated: 7/8/2026, 10:31:12 PM
class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0;
        int squareSum = 0;

        while (n>0){
            int d = n % 10;
            digitSum += d;
            squareSum += d*d;
            n/=10;
        }
        return squareSum - digitSum >= 50;
    }
}