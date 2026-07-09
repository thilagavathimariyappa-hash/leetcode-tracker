// Last updated: 7/8/2026, 10:31:21 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num :nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
        
    }
}