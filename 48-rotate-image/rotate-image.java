class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=i;j<m;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(int k=0;k<m;k++){
            int start=0;
            int end = n-1;
            while(start<end){
                int temp = matrix[k][start];
                matrix[k][start]=matrix[k][end];
                matrix[k][end]=temp;
                start++;
                end--;
            }
        }
    }
}