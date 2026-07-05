class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        int mid = n / 2;

        int midElement = nums[mid];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == midElement) {
                count++;
            }
        }

        return count == 1;
    }
}