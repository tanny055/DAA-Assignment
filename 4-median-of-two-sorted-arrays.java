class Solution {
    public double findMedianSortedArrays(int[] A, int[] B) {
        if (A.length > B.length) {
            int[] temp = A;
            A = B;
            B = temp;
        }

        int total = A.length + B.length;
        int half = total / 2;

        int l = 0;
        int r = A.length - 1;

        while (true) {
            int i = Math.floorDiv(l + r, 2);
            int j = half - i - 2;

            double aLeft = (i >= 0) ? A[i] : Double.NEGATIVE_INFINITY;
            double aRight = (i + 1 < A.length) ? A[i + 1] : Double.POSITIVE_INFINITY;
            double bLeft = (j >= 0) ? B[j] : Double.NEGATIVE_INFINITY;
            double bRight = (j + 1 < B.length) ? B[j + 1] : Double.POSITIVE_INFINITY;

            if (aLeft <= bRight && bLeft <= aRight) {
                if (total % 2 != 0) {
                    return Math.min(aRight, bRight);
                } else {
                    return (Math.max(aLeft, bLeft) + Math.min(aRight, bRight)) / 2.0;
                }
            } else if (aLeft > bRight) {
                r = i - 1;
            } else {
                l = i + 1;
            }
        }
    }
}
