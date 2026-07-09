// Last updated: 7/8/2026, 10:31:44 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums [0];

        for(int i =1; i < nums.length ; i++){
            currentSum = Math.max(nums[i],currentSum + nums[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}