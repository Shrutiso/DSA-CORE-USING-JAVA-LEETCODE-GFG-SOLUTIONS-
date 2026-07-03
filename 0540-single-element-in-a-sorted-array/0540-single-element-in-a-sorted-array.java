class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0 ; i<n ; i++){
            int num = nums[i];
            map.put(num , map.getOrDefault(num , 0)+1);
            
        }
        for(int i = 0 ; i<n ; i++){
            int num = nums[i];
            if(map.get(num)==1){
                return num;
            }
        }
        return -1;
    }
}