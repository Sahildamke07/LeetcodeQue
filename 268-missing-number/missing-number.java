class Solution {
    public int missingNumber(int[] nums) {
      int n = nums.length;
      int i=0;
      while(i<n){
        int correct = nums[i];
        if(nums[i]<n && nums[i]!=nums[correct]){
            swap(nums,i,correct);
        }
        else{
            i++;
        }
      }
      for(int j=0;j<n;j++){
        if(nums[j]!=j){
            return j;
        }
        
      }

    return n;}
    public void swap(int[] arr,int i, int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}