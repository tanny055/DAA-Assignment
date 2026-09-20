class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (nums[m] == target) {
                return m;
            } else if (nums[m] > target) {
                if (nums[m] > nums[r] && nums[r] >= target) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            } else {
                if (nums[m] < nums[r] && nums[r] < target) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }

        return -1;
    }
}
