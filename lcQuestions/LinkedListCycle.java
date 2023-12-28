package lcQuestions;



public class LinkedListCycle {
	
	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		
	}
	
    public boolean hasCycle(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast !=null && fast.next != null ){
            fast = fast.next.next;
            slow = slow .next;
            if(fast == slow)
                return true;
        }
        return false;
        
    }
	
	
	// Function to make loop at k-th elements of 
	//linked list /
	public ListNode makeloop( ListNode head_ref, int k) 
	{ 
	    // traverse the linked list until loop 
	    // point not found 
		ListNode temp = head_ref; 
	    int count = 1; 
	    while (count < k)
	    { 
	        temp = temp.next; 
	        count++; 
	    } 
	 
	    // backup the joint point 
	    ListNode joint_point = temp; 
	 
	    // traverse remaining nodes 
	    while (temp.next != null) 
	        temp = temp.next; 
	 
	    // joint the last node to k-th element 
	    temp.next = joint_point; 
	    return head_ref;
	}
	
	public ListNode push(int data , ListNode head)
	{
	    // Allocate dynamic memory 
	    // for newNode.
		ListNode newNode = new ListNode();
	 
	    // Assign the data into newNode.
	    newNode.val = data;
	 
	    // newNode.next assign the 
	    // address of head node.
	    newNode.next = head;
	 
	    // newNode become the headNode.
	    head = newNode;//7->6->5->4->3->2->1
	     
	    return head;
	}
	
	public void displayList( ListNode node)
	{
	 
	    while (node.next != null)
	    {
	        System.out.print(" "+ node.val);
	        node = node.next;
	    }
	     
	    System.out.print(" " + node.val);
	}
	
//	public void cyclicprintList(ListNode head) 
//    { 
//		ListNode temp = head; 
//        if (head != null) { 
//            do { 
//                System.out.printf("%d ", temp.val); 
//                temp = temp.next; 
//            } while (temp != head); 
//        } 
//  
//        System.out.printf("\n"); 
//    } 
	public void cyclicprintList(ListNode head,int count) 
    { 
		while(count>-1) {
			System.out.print(" " + head.val);
			head= head.next;
			count--;
			
		}
		
    }
	
}
