package lcQuestions;


import java.util.Iterator;
import java.util.PriorityQueue;


public class KthSmallestelementSortedMatrix378 {

	public int kthSmallest(int[][] matrix, int k) {
        //if()
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                pq.add(matrix[i][j]);
                //System.out.println(matrix[i][j]);
//                if(pq.size() > (k-1)){
//                    pq.poll();
//                }
            }
        }
        Iterator value = pq.iterator();
        //System.out.println(pq.size());
        int i=1;
        while(value.hasNext()){
        	//System.out.println(pq.size());
            if(i == k) {
            	break;
            }
            else {
            	pq.poll();
            	i++;
            }
        }
        return pq.peek();
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthSmallestelementSortedMatrix378  KS = new KthSmallestelementSortedMatrix378();
		int[][] matrix = new int[][] {{1,5,9},{10,11,13},{12,13,15}};
		System.out.println(KS.kthSmallest(matrix,8));
	}
}
