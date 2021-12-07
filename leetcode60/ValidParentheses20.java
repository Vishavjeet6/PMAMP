package leetcode60;

import java.util.Stack;

public class ValidParentheses20 {
	
    public static boolean isValid1(String s) {
    	Stack<Character> st = new Stack<Character>();
    	for(char c: s.toCharArray()) {
    		if(c=='{' || c== '[' || c=='(') {
    			st.push(c);
    			continue;
    		}else if(st.isEmpty()){
    			return false;
    		}else if(c == '}') {
    			if(st.peek() == '{') {
    				st.pop();
    			}else {
    				return false;
    			}
    		}else if(c == ')') {
    			if(st.peek() == '(') {
    				st.pop();
    			}else {
    				return false;
    			}
    		}else {
    			if(st.peek() == '[') {
    				st.pop();
    			}else {
    				return false;
    			}
    		}
    	}
    	return st.empty();
    }
    
    public boolean isValid(String s) {
    	Stack<Character> st = new Stack<Character>();
    	for(char c: s.toCharArray()) {
    		if(c == '{') {
    			st.push('}');
    		}else if(c == '(') {
    			st.push(')');
    		}else if(c == '[') {
    			st.push(']');
    		}else if(st.isEmpty() || st.pop() != c) {
    			return false;
    		}
    	}
    	return st.isEmpty();
    }
	
	public static void main(String[] args) {
		
	}
}
