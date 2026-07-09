// Last updated: 7/8/2026, 10:31:10 PM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans = 0;
        int index = nums.length-1;

        for(int i=0;i<k;i++){
            int val = nums[index--];
            if(mul >1){
                ans += 1L*val*mul;
            }else{
                ans += val;
            }
            mul--;
        }
        return ans;
    }
}