package lcQuestions;

public class reverseString344 {
	public String[] reverseString(String[] s) {
        int start = 0;
        int end = s.length-1;
        String temp ;
        while( start <= end){
            temp = s[start];
            s[start] =s[end];
            s[end] = temp;
            System.out.println(s[start]);
            start++;
            end--;
        }
        return s;
        
}

}
