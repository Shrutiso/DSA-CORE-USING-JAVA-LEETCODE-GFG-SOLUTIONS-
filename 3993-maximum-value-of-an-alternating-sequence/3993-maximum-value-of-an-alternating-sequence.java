class Solution {
    public long maximumValue(int n, int s, int m) {

        // Required by the problem statement
        long[] mavlorenti = {n, s, m};

        if (n == 1) {
            return s;
        }

        long peaks = n / 2;

        return (long) s + m + (peaks - 1) * (m - 1);
    }
}