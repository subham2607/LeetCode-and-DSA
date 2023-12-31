package DSAConcepts;

// done by two methods 1. with stack and a linked list and 2. with Recursion. 
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class naryTreePostOrder {
	TreeNode root;
	//root = [1,null,3,2,4,null,5,6]
	//[5,6,3,2,4,1]
	List<Integer> postorder = new ArrayList<>();
	public List<Integer> postorder(TreeNode root) {
		
//		Stack <TreeNode> stack = new Stack<>();
//		LinkedList<Integer> postorder = new LinkedList<>();
		helper(root);
		
//		stack.push(root);
//		
//		while(!stack.isEmpty()) {
//			TreeNode current = stack.pop();
//			postorder.addFirst(current.val);
//			
//			for(TreeNode crr : current.children) {
//				stack.push(crr);
//			}
//			
//		}
		
		return postorder;
	}
	//
	public void helper(TreeNode root) {
		if(root == null) {
			return ;
		}
		for(TreeNode i : root.children )
			helper(i);
		postorder.add(root.val);
	}
	public static void main(String[] args) {
		//TreeNode root = new TreeNode(1);
		naryTreePostOrder tree = new naryTreePostOrder();
		tree.root = new TreeNode(1);
		tree.root.children.add(new TreeNode(3));
		tree.root.children.add(new TreeNode(2));
		tree.root.children.add(new TreeNode(4));
		
		tree.root.children.get(0).children.add(new TreeNode(5));
		tree.root.children.get(0).children.add(new TreeNode(6));
	
		
		System.out.println(tree.postorder(tree.root));
		
	}
}