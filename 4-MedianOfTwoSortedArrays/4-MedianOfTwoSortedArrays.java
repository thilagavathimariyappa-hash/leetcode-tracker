// Last updated: 7/8/2026, 10:32:06 PM
class Solution {

    public double findMedianSortedArrays(int[] A, int[] B) {

        if (A.length > B.length) {
            return findMedianSortedArrays(B, A);
        }

        int m = A.length;
        int n = B.length;

        int low = 0;
        int high = m;

        while (low <= high) {

            int cutA = (low + high) / 2;
            int cutB = (m + n + 1) / 2 - cutA;

            int leftA = (cutA == 0) ? Integer.MIN_VALUE : A[cutA - 1];
            int leftB = (cutB == 0) ? Integer.MIN_VALUE : B[cutB - 1];

            int rightA = (cutA == m) ? Integer.MAX_VALUE : A[cutA];
            int rightB = (cutB == n) ? Integer.MAX_VALUE : B[cutB];

            if (leftA <= rightB && leftB <= rightA) {

                if ((m + n) % 2 == 0) {
                    return (Math.max(leftA, leftB)
                          + Math.min(rightA, rightB)) / 2.0;
                } else {
                    return Math.max(leftA, leftB);
                }
            }

            else if (leftA > rightB) {
                high = cutA - 1;
            } else {
                low = cutA + 1;
            }
        }

        return 0.0;
    }
}