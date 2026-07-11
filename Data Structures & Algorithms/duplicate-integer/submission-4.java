class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
            if(nums[j]<nums[i]){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            }
        }
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}