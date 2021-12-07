package leetcode60;

import java.util.HashMap;


public class LongestSubstringWithoutRepeatingCharacters3 {
    public static int lengthOfLongestSubstring(String s) {
        int allMax = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0, j=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                j = Math.max(j, map.get(s.charAt(i))+1);
            }
            allMax = Math.max(allMax, i-j+1);
            
            map.put(s.charAt(i), i);
        }
        return allMax;
    }
    
    
    
    public static void main(String[] args) {
		String s = "abba";
		System.out.println(lengthOfLongestSubstring(s));
	}

}
