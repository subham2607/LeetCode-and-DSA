package DSAConcepts;

import java.util.PriorityQueue;

public class Heapify {
	// MaxHeap method
//    public int findKthLargest(int[] nums, int k) {
//    	//3,2,1,5,6,4
//        
//        for(int i = nums.length/2-1;i>=0;i--){
//            MaxHeapify(i,nums,nums.length);
//        }
//        for(int i = nums.length-1;i>nums.length-k;i--){
//            int temp = nums[0];
//            nums[0]=nums[i];
//            nums[i]=temp;
//            MaxHeapify(0,nums,i);
//        }
//        return nums[0];
//    }
//    public void MaxHeapify(int i,int[] nums,int size){
//        int l = 2*i+1;
//        int r = 2*i+2;
//        int largest = i;
//        if(l<size && nums[l]>nums[i]){
//            largest = l;
//        }
//        if(r<size && nums[r]>nums[largest]){
//            largest = r;
//        }
//        if(i!=largest){
//            int temp = nums[i];
//            nums[i]=nums[largest];
//            nums[largest]=temp;
//            MaxHeapify(largest,nums,size);
//        }
//    }
	// Priority Queue Method
	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> q = new PriorityQueue<>();
		
		for(int i:nums) {
			q.offer(i);
			if(q.size()>k) {
				q.poll();
			}
		}
		
		return q.peek();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heapify MH = new Heapify();
		int[] nums = new int[]{3,2,3,1,2,4,5,5,6};
		System.out.println(MH.findKthLargest(nums,4));

	}

}
