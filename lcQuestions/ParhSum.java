package lcQuestions;

import DSAConcepts.TreeNode;

//Important question. concept regarding recursion. 
public class ParhSum {
	TreeNode root;
	
	public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root == null) return false;

        if(root.left == null && root.right == null && root.val==targetSum) return true;
        
        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);//important    
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParhSum LO = new ParhSum();
		LO.root = new TreeNode(3);
		LO.root.left = new TreeNode(9);
		LO.root.right = new TreeNode(20);
		LO.root.right.left = new TreeNode(15);
		LO.root.right.right = new TreeNode(7);

		System.out.println(LO.hasPathSum(LO.root,12));
	}

}
