class Solution {
    public int maxVowels(String s, int k) {

        int n = s.length();
        int count = 0;
        int maxv = 0;

        
        for(int i = 0; i < k; i++) {

            char ch = s.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u') {
                count++;
            }
        }

        maxv = count;

        
        for(int i = k; i < n; i++) {

            char add = s.charAt(i);
            char r = s.charAt(i-k);

        
            if(add == 'a' || add == 'e' || add == 'i' ||
               add == 'o' || add == 'u') {
                count++;
            }

            
            if(r == 'a' || r == 'e' || r == 'i' ||
               r == 'o' || r == 'u') {
                count--;
            }

            maxv = Math.max(maxv, count);
        }

        return maxv;
    }
}