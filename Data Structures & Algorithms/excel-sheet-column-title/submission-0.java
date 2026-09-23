class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        int n = columnNumber;
        while (n > 0) {
            n=n-1;
            int temp = n%26;
            n=n/26;
            char ch = (char)('A' + temp);
            sb.append(ch);
           
        }
        return new String(sb.reverse().toString());
    }
}
