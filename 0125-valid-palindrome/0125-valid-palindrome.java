class Solution {
    public boolean isPalindrome(String s) {

        String s2 = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = Character.toLowerCase(s.charAt(i));

            if (Character.isLetterOrDigit(ch)) {
                s2 += ch;
            }
        }

        int left = 0;
        int right = s2.length() - 1;

        while (left < right) {

            if (s2.charAt(left) != s2.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}