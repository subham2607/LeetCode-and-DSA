package lcQuestions;


public class oddEvenList {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode tail;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		
	}
	
	
	public ListNode OddEvenList(ListNode head) {
		
		
		if(head == null) return head;
        ListNode odd = head;
        ListNode even = odd.next;
        ListNode evenhead = even;
        
        while (even!=null && even.next!=null){
            odd.next = even.next;
            odd = even.next;
            even.next = odd.next;
            even = odd.next;
        }
        
        odd.next = evenhead;
        return head;
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
	    head = newNode;
	     
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
	
	

}
