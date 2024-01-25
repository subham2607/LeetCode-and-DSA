package DSAConcepts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DiagonalTraversalBT {
	TreeNode root;
	public List<Integer> diagonalTraversal(TreeNode root){
		List<Integer> diagonal = new ArrayList<>();
		if(root == null) {
			return diagonal;
		}
		Queue<TreeNode> q = new LinkedList<>();
		
		while(root!=null) {
			diagonal.add(root.val);
			if(root.left!=null) {
				q.add(root.left);
			}
			if(root.right!=null) {
				root=root.right;
				
			}else {
				if(!q.isEmpty()) {
					root=q.peek();
					//System.out.println(q.peek().val);
					q.remove();
				}
				else {
					root=null;
				}
			}
		}
		return diagonal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiagonalTraversalBT DT = new DiagonalTraversalBT();
		DT.root = new TreeNode(1);
		DT.root.left = new TreeNode(3);
		DT.root.left.left = new TreeNode(5);
		DT.root.left.right = new TreeNode(3);
		DT.root.right = new TreeNode(2);
		//LO.root.right.left = new TreeNode(0);
		DT.root.right.right = new TreeNode(9);
		List<Integer> n = DT.diagonalTraversal(DT.root);
		for(int i=0;i<n.size();i++) {
			System.out.println(n.get(i));
		}
	}

}
