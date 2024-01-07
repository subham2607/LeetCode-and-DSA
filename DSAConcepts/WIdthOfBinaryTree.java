package DSAConcepts;

import java.util.HashMap;

public class WIdthOfBinaryTree {
	TreeNode root;
	int max_width =0;
	HashMap<Integer,Integer> leftmost_position;
	public int widthOfBinaryTreeincludingNull(TreeNode root) {
		leftmost_position = new HashMap();
		getwidth(root,0,0);
		return max_width;
	}
	public void getwidth(TreeNode root, int depth,int position) {
		if(root == null) return;
		leftmost_position.computeIfAbsent(depth,x->position);
		max_width = Math.max(max_width, position - leftmost_position.get(depth)+1);
		getwidth(root.left,depth+1,position*2);
		getwidth(root.right,depth+1,position*2+1);
	}
	
	public int widthOfBinaryTreewithoutNull(TreeNode root) {
		int width =0;
		int height =height(root);
		for(int i =1; i<=height;i++) {
			int max=getwidth(root,i);
			if(max>width) width = max;
		}
		return width;
	}
	
	public int getwidth(TreeNode root,int level) {
		if(root == null) return 0;
		if(level == 1) return 1;
		
		return getwidth(root.left,level-1) + getwidth(root.right,level-1);
		 
	}
	public int height(TreeNode root) {
		
		if(root == null) return 0;
		
		int leftheight = height(root.left);
		int rightheight = height(root.right);
		if(leftheight>rightheight) return leftheight+1; 
		else return rightheight+1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub x[1,3,2,5,3,null,9]
		WIdthOfBinaryTree LO = new WIdthOfBinaryTree();
		LO.root = new TreeNode(1);
		LO.root.left = new TreeNode(3);
		LO.root.left.left = new TreeNode(5);
		LO.root.left.right = new TreeNode(3);
		LO.root.right = new TreeNode(2);
		//LO.root.right.left = new TreeNode(0);
		LO.root.right.right = new TreeNode(9);

		System.out.println(LO.widthOfBinaryTreeincludingNull(LO.root));
		System.out.println(LO.widthOfBinaryTreewithoutNull(LO.root));

	}

}
