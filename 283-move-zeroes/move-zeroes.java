class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int nonzeroindx=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[nonzeroindx]=nums[i];
                if(i!=nonzeroindx){
                nums[i]=0;
            }
            nonzeroindx++;
            }
            
            
        }
    }
}