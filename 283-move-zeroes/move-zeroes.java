class Solution {
    public void moveZeroes(int[] nums) {
        int n= nums.length; 
        int nonzeroidx=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0)
            {
                nums[nonzeroidx] = nums[i];
                if(i!=nonzeroidx)
                {
                    nums[i]=0;
                }
                nonzeroidx++;
            }   
        }
    
    }
    }
