class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int p=0;
        int n=0;
        int[] neg = new int[nums.length/2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg[n]=nums[i];
                n++;
            }
            else{
                pos[p]=nums[i];
                p++;
            }
        }
        int[] result = new int[nums.length];
       
       
        for(int j=0;j<nums.length;j=j+2){
            result[j]=pos[j/2];
            result[j+1]=neg[j/2];
            
        }
   return result; }
}