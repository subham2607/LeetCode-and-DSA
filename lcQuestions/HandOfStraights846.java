package lcQuestions;

import java.util.TreeMap;

public class HandOfStraights846 {
	
	public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer,Integer> cards =new TreeMap<Integer,Integer>();  //TreeMap provides an ordered collection of key-value pairs,
        //where the keys are ordered based on their natural order,  does not allow null keys (like Map). Methods similar to Hashmap.
        for(int i : hand){
            if(!cards.containsKey(i))
                cards.put(i,1);
            else
                cards.replace(i,cards.get(i)+1);
        }

        while(cards.size() > 0){
            int first_card = cards.firstKey();
            for(int i=first_card; i<first_card + groupSize ;i++){
                if(!cards.containsKey(i)) return false;
                int counts = cards.get(i);
                if(counts == 1) cards.remove(i);
                else{
                    cards.replace(i,counts- 1);
                }
            }
        }

        return true;
	}

}

//recursive solution
//class Solution {
//    public ListNode swapPairs(ListNode head) {
//        if(head==null)
//        return head;
//        if(head.next==null)
//        return head;
//        ListNode temp= head.next;
//        head.next=swapPairs(temp.next);
//        temp.next=head;
//        return temp;
//    }
//}
	
