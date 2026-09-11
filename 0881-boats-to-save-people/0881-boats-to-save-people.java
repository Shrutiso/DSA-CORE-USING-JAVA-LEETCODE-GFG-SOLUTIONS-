class Solution {
    public int numRescueBoats(int[] people, int limit) {
      int n = people.length;
      int bc = 0;
      int r = n-1;
      int l = 0;
      Arrays.sort(people);
      while(l<=r){
        if(people[l]+people[r]<=limit){
            bc++;
            l++;
            r--;
        }else{
            bc++;
            r--;
        }
      }
      return bc;  
    }
}