class Solution {
  
    public int numIdenticalPairs(int[] nums) {
        int dp[] = new int[101];
        Map<Integer, Integer> map = new HashMap<>();
        int ncr[] = new int[101];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int ans = 0;
        for (int value : map.values()) {
            ans += (value * (value -1) /2) ;
        }
        return ans;
    }

}
