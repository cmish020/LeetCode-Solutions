class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0;

        for (char i : t.toCharArray()) {
            if (sIndex < s.length() && s.charAt(sIndex) == i) {
                sIndex++;
            }
        }

        return sIndex == s.length();
    }
}
