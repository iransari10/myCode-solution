class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int arr[] = {1, 9, 9, 8, 7, 6, 5, 4, 3 };
        int ans = 1;
        for(int i = 1; i <= n; i++) {
            int nDigitsFormation = 1;
            for(int j = 0; j <= i; j++) {
                nDigitsFormation = nDigitsFormation*arr[j];
            }
            ans += nDigitsFormation;
        }
        return ans;
    }
}
