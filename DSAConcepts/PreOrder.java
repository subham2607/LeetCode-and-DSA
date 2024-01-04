package DSAConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {
	
	TreeNode root ;
	List<Integer> preorder = new ArrayList<>();
	//Input: root = [1,null,2,3]
	//		Output: [1,2,3]
	public List<Integer> preorderTraversal(TreeNode root){
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode current =stack.pop();
			preorder.add(current.val);
			if(current.left != null)
				stack.push(current.left);
			if(current.right != null)
				stack.push(current.right);
		}
		
		
		//helper(root);
		return preorder;
	}
//	public void helper(TreeNode root) {
//		if(root == null) return;
//		preorder.add(root.val);
//		helper(root.left);
//		helper(root.right);
//	}
	public static void main(String[] args) {
		PreOrder PO = new PreOrder();
		PO.root = new TreeNode(1);
		PO.root.right = new TreeNode(2);
		PO.root.right.left = new TreeNode(3);

		System.out.println(PO.preorderTraversal(PO.root));
	}
}
