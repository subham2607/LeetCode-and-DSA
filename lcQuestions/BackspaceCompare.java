package lcQuestions;

public class BackspaceCompare {
	
//	public static void main() {
//		String s = "qw#d";
//		String t = "w#qd";
//		BackspaceCompare BC = new BackspaceCompare();
//		System.out.println(BC.backspaceCompare(s,t));
//		
//	}
	public boolean backspaceCompare(String s, String t) {
		
		int s_pointer = s.length()-1;
		int t_pointer = t.length()-1;
		
		int s_skip = 0;
		int t_skip = 0;
		
		while(s_pointer >= 0 || t_pointer >= 0) {
			
			while( s_pointer >=0 ) {
				if( s.charAt(s_pointer) == '#') {
					s_pointer -= 1;
					s_skip += 1;
				}
				else if( s_skip > 0) {
					s_pointer --;
					s_skip --;
				}
				else break;
			}
			
			/*
			 * String s = "qw#d";
			   String t = "uw#qd";
			 */
			while( t_pointer >=0 ) {
				if( t.charAt(t_pointer) == '#') {
					t_pointer -= 1;
					t_skip += 1;
				}
				else if( t_skip > 0) {
					t_pointer --;
					t_skip --;
				}
				else break;
			}
			if(s_pointer>=0 && t_pointer>=0)
				if((s_skip >= 0) && (t_skip >= 0) && (s.charAt(s_pointer) != t.charAt(t_pointer))) return false;
				
				
			if((s_pointer >= 0) != (t_pointer >= 0)) return false;
			
			s_pointer--;
			t_pointer--;
			
		}
		
		return true;
        
    }
}
