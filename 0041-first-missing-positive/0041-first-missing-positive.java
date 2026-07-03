class Solution {
    public int firstMissingPositive(int[] nums) {
       Arrays.sort(nums);
       int exp = 1;
       int n = nums.length;
       for(int i = 0 ; i<n;i++){
        if(nums[i]==exp){
            exp++;
        }else if(nums[i]<exp){
            continue;
        }else{
            if(nums[i]>exp){
                return exp;
            }
        }
       } 
       return exp;
    }
}