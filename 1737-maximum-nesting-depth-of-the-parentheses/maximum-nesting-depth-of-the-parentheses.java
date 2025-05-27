class Solution {
    public int maxDepth(String s) {
        int count=0;
        int maxsum=0;
        for(char c: s.toCharArray()){
            if(c== '('){
                count++;
                if(maxsum<count){
                    maxsum=count;
                }
            }
            else if(c==')'){
                count--;
            }

        }
    return maxsum;}
}