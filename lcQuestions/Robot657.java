package lcQuestions;

public class Robot657 {
	public boolean judgeCircle(String moves) {
        
        int x =0;
        int y =0;
        for(char c : moves.toCharArray()){
            if(c == 'U') x++;
            if(c == 'D') x--;
            if(c == 'R') y++;
            if(c == 'L') y--;
        }
        if(x!=0 || y!= 0) return false;
        return true;
        
    }

}
