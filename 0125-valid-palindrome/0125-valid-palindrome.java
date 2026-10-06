class Solution {
    public boolean isPalindrome(String s) {
       String s2 = "";
       for(int i = 0 ; i<s.length() ; i++){
        char ch = Character.toLowerCase(s.charAt(i));
        if(Character.isLetterOrDigit(ch)){
            s2+= ch;
        }
       } 
    
    int l = 0;
    int r = s2.length()-1;
    while(l<r){
        if(s2.charAt(l)!=s2.charAt(r)){
            return false;
        }
        l++;
        r--;
    }
    return true;
    }
}