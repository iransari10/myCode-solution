class Solution {
    public int minStartValue(int[] nums) {
        int start = 1, sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum < 1) {
                int diff = Math.abs(sum);
                start += diff;
                sum = 0;
            }
        }
        return start;
    }
}
