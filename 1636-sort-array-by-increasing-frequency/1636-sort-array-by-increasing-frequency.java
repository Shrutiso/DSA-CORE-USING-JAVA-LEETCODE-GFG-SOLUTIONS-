import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Integer[] arr = new Integer[nums.length];

        // Copy elements
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        // Sort according to frequency
        Arrays.sort(arr, (a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return b - a; // Same frequency -> larger number first
            }
            return map.get(a) - map.get(b); // Smaller frequency first
        });

        // Copy back to int[]
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
    }
}