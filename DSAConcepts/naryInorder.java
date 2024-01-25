package DSAConcepts;

import java.util.ArrayList;
import java.util.List;
//LRootR
public class naryInorder {
	TreeNode root;
	List<Integer> list= new ArrayList<>();
	public List<Integer> inorder(TreeNode root){
		
		helper(root);
		return list;
	}

	public void helper(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null) return;
		int n =root.children.size();
		//System.out.println(n);
		for(int i=0;i<n;i++) {
			//System.out.println(i);
			helper(root.children.get(i));
		}
		list.add(root.val);
		//System.out.println(list);
		//helper(root.children.get(n-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		naryInorder tree = new naryInorder();
		tree.root = new TreeNode(1);
		tree.root.children.add(new TreeNode(3));
		tree.root.children.add(new TreeNode(2));
		tree.root.children.add(new TreeNode(4));
		
		tree.root.children.get(0).children.add(new TreeNode(5));
		tree.root.children.get(0).children.add(new TreeNode(6));
		tree.root.children.get(0).children.add(new TreeNode(7));
		
		System.out.println(tree.inorder(tree.root));
	}

}
