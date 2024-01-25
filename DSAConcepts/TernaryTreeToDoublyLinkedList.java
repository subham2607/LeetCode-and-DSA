package DSAConcepts;

public class TernaryTreeToDoublyLinkedList {
	TreeNode root;
	TreeNode tail;
	public void push(TreeNode root) {
		tail.right = root;
		root.left = tail;
		root.mid= root.right = null;
		tail = root;
	}
	public void PreOrderTraversal(TreeNode root,TreeNode head) {
		if(root==null) return;
		TreeNode left = root.left;
		TreeNode mid = root.mid;
		TreeNode right = root.right;
		if(tail!= root) {
			push(root);
		}
		PreOrderTraversal(left,head);
		PreOrderTraversal(mid,head);
		PreOrderTraversal(right,head);
		 
	}
	public TreeNode start(TreeNode root) {
		TreeNode head= root;
		tail = root;
		
		PreOrderTraversal(root,head);
		return head;
	}
	public void printlist(TreeNode head) {
		while (head != null) {
            if (head.right != null) {
                System.out.print(head.val + " ");
            } else {
                System.out.print(head.val);
            }
            head = head.right;
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TernaryTreeToDoublyLinkedList TT = new TernaryTreeToDoublyLinkedList();
		TT.root = new TreeNode(30);
		TT.root.left = new TreeNode(5);
		TT.root.mid = new TreeNode(5);
		TT.root.right = new TreeNode(5);
		TT.root.left.left = new TreeNode(1);
		TT.root.left.mid = new TreeNode(4);
		TT.root.left.right = new TreeNode(8);
		
		TT.printlist(TT.start(TT.root));
		
	}

}
