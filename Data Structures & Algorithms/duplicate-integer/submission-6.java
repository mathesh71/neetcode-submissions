class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer> freq=new HashSet<>();
        for(int i=0;i<n;i++){
            if(freq.contains(nums[i])){
                return true;
            }else{
                freq.add(nums[i]);
            }
        }
        return false;
    }
}