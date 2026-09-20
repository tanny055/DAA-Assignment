class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int csum = 0;

        for (int i : nums) {
            csum += i;
            ans = Math.max(csum, ans);
            if (csum < 0) {
                csum = 0;
            }
        }

        return ans;
    }
}
