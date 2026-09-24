class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        // Gcd calculation
        while (len2 != 0) {
            int temp = len1 % len2;
            len1 = len2;
            len2 = temp;
        } // len1 will have gcd of both strings

        String s1 = str2.substring(0, len1); // Candidate 
        if ((str1 + str2).equals(str2 + str1)) {
            return s1;
        }
        return "";
    }
}