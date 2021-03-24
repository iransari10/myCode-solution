class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i = 0, j = 0; i < n; i++, j++) {
            if(i != (n - j - 1)) {
               sum += mat[i][ n - j - 1];
            } 
            sum += mat[i][j];
        }
        return sum;
    }
}
