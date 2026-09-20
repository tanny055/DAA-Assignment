class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rn = matrix.length;
        int cn = matrix[0].length;
        int l = 0;
        int r = (rn * cn) - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int row = mid / cn;
            int col = mid % cn;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return false;
    }
}
