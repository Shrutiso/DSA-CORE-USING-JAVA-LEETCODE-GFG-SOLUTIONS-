class Solution {
    public boolean isAnagram(String s, String t) {
      char [] c1 = s.toCharArray();
      Arrays.sort(c1);
      String ss = new String(c1);
      char [] c2 = t.toCharArray();
      Arrays.sort(c2);
      String tt = new String(c2);
      if(ss.equals(tt)){
        return true;
      }else{ 
        return false;
      }

    }
}
