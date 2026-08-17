class Solution {
    public int maxProductDifference(int[] nums) {
        int max = -1;
        int secMax = -2;
        for (int n : nums) {
            if (n >= max) {
                secMax = max;
                max = n;
            } else if (n > secMax) {
                secMax = n;
            }
        }
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE - 1;
        for (int n : nums) {
            if (n <= min) {
                secMin = min;
                min = n;
            } else if (n < secMin) {
                secMin = n;
            }
        }
        return (max * secMax) - (min * secMin);
    }
}