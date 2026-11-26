class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        for (int i = 0; i < mat.length; i++) {
            int left = 0;
            int right = mat[i].length - 1;
            if (x > mat[i][right]) {
                continue;
            }
            if (x < mat[i][0]) {
                continue;
            }
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (mat[i][mid] == x) {
                    return true;
                }
                else if (mat[i][mid] < x) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
