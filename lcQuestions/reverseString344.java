package lcQuestions;

public class reverseString344 {
	public String[] reverseString(String[] s) {
//        int start = 0;
//        int end = s.length-1;
//        String temp ;
//        while( start <= end){
//            temp = s[start];
//            s[start] =s[end];
//            s[end] = temp;
//            System.out.println(s[start]);
//            start++;
//            end--;
//        }
//        return s;
		helper(0, s);
		return s;
        
}
	

	private static void helper(int index, String [] str) {
		  if (str == null || index >= str.length) {
		    return;
		  }
		  helper(index + 1, str);
		  System.out.print(str[index]);
	}
	public static void main(String args[]) {
		reverseString344 RS = new reverseString344();
		String[] ch ={"H","a","n","n","a","h"};
		String[] result =RS.reverseString(ch);
	}

}
