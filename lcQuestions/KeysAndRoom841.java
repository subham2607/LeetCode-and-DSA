package lcQuestions;

import java.util.List;
import java.util.Stack;

public class KeysAndRoom841 {
	
	
	
	public boolean canVisitAllRooms( List<List<Integer>> rooms){
		
		boolean[] seen = new boolean[rooms.size()];
		seen[0] = true;
		
		Stack<Integer> key = new Stack();
		key.add(0);
		
		while(!key.isEmpty()) {
			int currentKey = key.pop();
			for(int newKey : rooms.get(currentKey)) {
				if(!seen[newKey]) {
					seen[newKey]=true;
					key.push(newKey);
				}
			}
		}
		for(boolean Visited : seen) {
			if(Visited == false) return false;
		}	
		return true;
	}
}
