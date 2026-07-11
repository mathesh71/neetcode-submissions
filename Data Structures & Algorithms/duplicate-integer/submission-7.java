class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer> freq=new HashSet<>();
        for(int num : nums){
            if(!freq.add(num)){
                return true;
            }
        }
        return false;
    }
}