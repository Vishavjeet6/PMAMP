package leetcode60;

public class StringtoIntegeratoi8 {
	
    public static int myAtoi(String s) {
    	int sign = 1;
    	int start = 0;
        
        if(s.length() == 0) return 0;


    	while(start<s.length() && s.charAt(start) == ' ') {
    		start++;
    	}
        
         if(start == s.length()) return 0;
        
    	if(s.charAt(start) == '-' || s.charAt(start) == '+') {
    		sign = s.charAt(start) == '-'?-1:1;
    		start++;
    	}
    	int total = 0;
    	while(start<s.length()) {
    		int d = s.charAt(start) - '0';
    		if(d<0 || d>9) break;
    		if(total > Integer.MAX_VALUE/10 || total == Integer.MAX_VALUE/10 && d > Integer.MAX_VALUE%10) {
    			return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    		}
    		
    		total = 10*total + d;
    		start++;
    	}
    	return total*sign;
        
    }
	
	public static void main(String[] args) {
		System.out.println(myAtoi("42"));
	}

}
