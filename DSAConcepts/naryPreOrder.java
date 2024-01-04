package DSAConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class naryPreOrder {
	TreeNode root;
	List<Integer> preorder = new ArrayList<>();
	public List<Integer> preorder(TreeNode root) {
//        Stack<TreeNode> stack1 = new Stack<>();
//
//        List<Integer> preorder = new ArrayList<>();
//    
//        if(root==null) return preorder;
//        
//        stack1.push(root);
//        while(!stack1.isEmpty()){
//            
//        	TreeNode current = stack1.peek();
//            stack1.pop();
//            preorder.add(current.val);
//
//
//            for(int i=current.children.size()-1 ;i>=0; i--){
//                stack1.push(current.children.get(i));
//            }
//        }
		helper(root);
		
		
        return preorder;
    }
	public void helper(TreeNode root) {
		if(root==null) return;
		preorder.add(root.val);
		for(TreeNode i :root.children) {
			helper(i);
		}
		
	}
	public static void main(String[] args) {
		//TreeNode root = new TreeNode(1);
		naryPreOrder tree = new naryPreOrder();
		tree.root = new TreeNode(1);
		tree.root.children.add(new TreeNode(3));
		tree.root.children.add(new TreeNode(2));
		tree.root.children.add(new TreeNode(4));
		
		tree.root.children.get(0).children.add(new TreeNode(5));
		tree.root.children.get(0).children.add(new TreeNode(6));
	
		
		System.out.println(tree.preorder(tree.root));
		
	}
}
