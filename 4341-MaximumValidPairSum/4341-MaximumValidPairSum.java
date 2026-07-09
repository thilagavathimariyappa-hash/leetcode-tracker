// Last updated: 7/8/2026, 10:31:17 PM
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int maxLeft = nums[0];
        int maxSum = Integer.MIN_VALUE;
        for(int j=k; j<n; j++){
            maxLeft = Math.max(maxLeft, nums[j-k]);
            maxSum=Math.max(maxSum,maxLeft+nums[j]);      
        }
        return maxSum;
    }
}