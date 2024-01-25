package lcQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElements {
	public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for(int i : nums){
            if(!frequency.containsKey(i)){
                frequency.put(i,1);
            }
            else frequency.put(i,frequency.get(i)+1);
        }
        Queue<Integer> pq = new PriorityQueue<>((n1,n2) -> frequency.get(n1) - frequency.get(n2));
        
        
        for (Map.Entry<Integer,Integer> e:frequency.entrySet()){
        //for(int n: frequency.keySet()){
            //pq.add(n);
            pq.add(e.getKey());
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] arr = new int[k];
        while(!pq.isEmpty()){
            if(!pq.isEmpty() && k>=0) arr[k-1]= pq.poll();
            k--;
        }
        return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopKFrequentElements TK = new TopKFrequentElements();
		int[] nums = new int[]{1,1,1,2,2,3,};
		int[] n1 = new int[2];
		n1 = TK.topKFrequent(nums,2);
		for(int i:n1) {
			System.out.println(i);
		}
	}

}
