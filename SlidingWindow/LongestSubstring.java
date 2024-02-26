package SlidingWindow;

import java.util.HashSet;

public class LongestSubstring {
	public int longestSubstring(String s) {
		int end = s.length()-1;
        int start=0;
        int maxcount=0;
        while(start<end){
            int count=0;
            HashSet<Character> substring = new HashSet<>();
            for(int i=start;i<end;i++){
                
                
                //System.out.println(substring.contains(s.charAt(i)));
                if(substring.contains(s.charAt(i))) {
                	//System.out.println("Here");
                	break;
                }
                else{
                	//System.out.println("Here");
                    substring.add(s.charAt(i));
                    //System.out.println(substring.size());
                    count++;
                }
            }
            maxcount = Math.max(maxcount,count);
            start++;
        }
        return maxcount;
	}
	public static void main(String[] args) {
		String s="abcbbbb";
		LongestSubstring LS = new LongestSubstring();
		System.out.println(LS.longestSubstring(s));
	}
}
