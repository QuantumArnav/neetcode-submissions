class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        
        for(int i =0;i<s.length();i++){
        
        if(i == s.length()-1){
            sum = sum + valueOf(s.charAt(i));
        }
        else{
        int current = valueOf(s.charAt(i));
        int next = valueOf(s.charAt(i+1));
        if(current >= next){
            sum = sum + current;
        }
        else
        sum = sum - current;
    }
        }
    return sum;
    }

    // helper method
    private int valueOf(char ch){
        switch(ch){
            case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default: return 0;
        }
    }
}