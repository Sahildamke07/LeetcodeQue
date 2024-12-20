class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        return speed(piles,h);
    }
    public int speed(int[] pile, int h){
        int left=1;
        int right = maxpiles(pile);
        int result=right;

        while(left<=right){
            int mid = left+(right-left)/2;
            if(caneat(pile,h,mid)){
                result=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return result;
    }
    private boolean caneat(int[] piles,int h, int k){
        long hours=0;
        for(int pile: piles){
            hours+=(long)(pile+k-1)/k;
        }
        if(hours>h) return false;

        else{
            return true;
        }
    }
    private int maxpiles(int[] piles){
        int max=0;
        for(int pile:piles){
            max=Math.max(max,pile);
        }
        return max;
    }
}