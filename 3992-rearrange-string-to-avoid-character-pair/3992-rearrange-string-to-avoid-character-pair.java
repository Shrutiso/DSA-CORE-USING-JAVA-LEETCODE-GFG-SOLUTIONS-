class Solution {
    public String rearrangeString(String s, char x, char y) {

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder ans = new StringBuilder();

    
        for (int i = 0; i < 26; i++) {
            char ch = (char) (i + 'a');

            if (ch == x || ch == y)
                continue;

            while (freq[i] > 0) {
                ans.append(ch);
                freq[i]--;
            }
        }

        
        while (freq[y - 'a'] > 0) {
            ans.append(y);
            freq[y - 'a']--;
        }

    
        while (freq[x - 'a'] > 0) {
            ans.append(x);
            freq[x - 'a']--;
        }

        return ans.toString();
    }
}