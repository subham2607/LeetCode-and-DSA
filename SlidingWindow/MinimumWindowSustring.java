package SlidingWindow;

import java.util.HashMap;
import java.util.Map;


public class MinimumWindowSustring {
	public String minimumWindowSustring(String s,String t) {
		int left=0;
		int right=0;
		int count =t.length();
		int minLength=Integer.MAX_VALUE;
		boolean found=false;
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i=0;i<t.length();i++) {
			hm.put(t.charAt(i), hm.compute(t.charAt(i),(k,v) ->(v==null)?1: v+1));
		}
		
		while(right<s.length()) {
			if(hm.containsKey(s.charAt(right)) ) {
				hm.put(s.charAt(right),hm.get(s.charAt(right))-1);
				if(hm.get(s.charAt(right))==0) {
					count--;
				}
			}
			right++;
			if(count>0) continue;
			while(count==0) {
				if(hm.containsKey(s.charAt(left))) {
					hm.put(s.charAt(left),hm.get(s.charAt(left))+1);
					if(hm.get(s.charAt(left))>0)count++;
				}
				left++;
			}
			
			if(right-left<minLength) {
				minLength=right-left;
				found = true;
			}
		}
		return !found?"":s.substring(left-1,right);
//		for(Map.Entry<Character, Integer> e :hm.entrySet()) {
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
//		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ADOBECODEBANC"; 
		String t = "ABC";
		MinimumWindowSustring MS = new MinimumWindowSustring();
		System.out.println(MS.minimumWindowSustring(s,t));
	}
}
