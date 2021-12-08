package leetcode60;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22 {
	
	public static void recursionString(List<String> list, int n1, int n2, int n3, String s) {
		if(n1==n3 && n2==n3) {
			list.add(s);
			return;
		}else {
			if(n1<n3) recursionString(list, n1+1, n2, n3, s+'(');
			if(n2<n1) recursionString(list, n1, n2+1, n3, s+')');
		}
	}
	
	public static void recursionString2(List<String> list, int n1, int n2, int n3, StringBuilder s) {
		if(n1==n3 && n2==n3) {
			list.add(s.toString());
			return;
		}else {
			if(n1<n3) {
				s.append("(");
				recursionString2(list, n1+1, n2, n3,s); 
				s.setLength(s.length()-1);
			}
			if(n2<n1) {
				s.append(")");
				recursionString2(list, n1, n2+1, n3, s); 
				s.setLength(s.length()-1);
			}
		}
	}
	
    public static List<String> generateParenthesis(int n) {    	
    	List<String> ans = new ArrayList<String>();
//    	recursionString(ans, 0, 0, n, "");
    	recursionString2(ans, 0, 0, n, new StringBuilder());
        return ans;
    }
    
    public static void main(String[] args) {
    	List<String> ss = generateParenthesis(3);
    	for(String x: ss) {
    		System.out.println(x);
    	}
	}

}
