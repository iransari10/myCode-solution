class Solution {
    public int[] countBits(int num) {
        if(num == 0) return new int[]{0};
        int dp [] = new int[num+1];
        //base case
        dp[0] = 0;
        dp[1] = 1;
        int i = 1, index = 2, power, k;
        while(index <= num) {
            power = (int) Math.pow(2, i++);
            k = power;
            while(index <= num && k > 0) {
               dp[index] = dp[index - power] + 1;
               k--;
               index++;
            }
        }
        return dp;
    }
}
