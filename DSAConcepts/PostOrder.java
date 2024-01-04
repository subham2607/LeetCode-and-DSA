package DSAConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrder {
	
	TreeNode root ;
	
	//Input: root = [1,null,2,3]
	//		Output: [1,2,3]
	public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);
        while(root!=null){
            //TreeNode current = stack.peek();
            if(root.left!=null)
                stack.push(root.left);
            if(root.right!=null)
                stack.push(root.right);
        }
        while(!stack.isEmpty()) {
        	TreeNode crr = stack.pop();
            postorder.add(crr.val);
        }
        
        return postorder;
    }
//	public void helper(TreeNode root) {
//		if(root == null) return;
//		preorder.add(root.val);
//		helper(root.left);
//		helper(root.right);
//	}
	public static void main(String[] args) {
		PostOrder PO = new PostOrder();
		PO.root = new TreeNode(1);
		PO.root.right = new TreeNode(2);
		PO.root.right.left = new TreeNode(3);

		System.out.println(PO.postorderTraversal(PO.root));
	}
}
