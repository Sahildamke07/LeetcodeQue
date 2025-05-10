class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int x=nums[0];
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                reverse(nums,0,i);
                reverse(nums,i+1,n-1);
                reverse(nums,0,n-1);
            }
        }
        if(issorted(nums)){
            return true;
        }
        return false;
    }
    static boolean issorted(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
            return false;
            }
        }
        return true;
    }
    static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}