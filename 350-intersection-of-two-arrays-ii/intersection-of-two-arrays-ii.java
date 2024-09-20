class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);    
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                arr.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] ans=new int[arr.size()];
        for(int p=0;p<ans.length;p++){
            ans[p]=arr.get(p);
        }
        return ans;
    }
}