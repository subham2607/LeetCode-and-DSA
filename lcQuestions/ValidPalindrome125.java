package lcQuestions;

public class ValidPalindrome125 {
	
	public boolean validPalindrome(String s) {
        
		//String palindrome = "A man, a plan, a canal: Panama";  str = str.replaceAll(
        //"[^a-zA-Z0-9]", "");
		
		s = s.toLowerCase().replaceAll("[^a-z0-9]","");
		
		System.out.println(s);
		
		int start =0;
		int end = s.length()-1;
		
		while(start < end) {
			if(s.charAt(start) == s.charAt(end)) {
				start ++;
				end --;
			}else return false;
		}
		
		return true;
    } 

}
