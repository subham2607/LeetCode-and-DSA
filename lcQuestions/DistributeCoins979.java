package lcQuestions;

import DSAConcepts.TreeNode;

public class DistributeCoins979 {
	TreeNode root;
	int nums_moves;
    public int distributeCoins(TreeNode root) {
        nums_moves = 0;
        dfs(root);
        return nums_moves;
    }
    public int dfs(TreeNode root){
        if(root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        nums_moves += Math.abs(left) + Math.abs(right);
        return root.val + left + right -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistributeCoins979 LO = new DistributeCoins979();
		LO.root = new TreeNode(0);
		LO.root.left = new TreeNode(0);
		LO.root.right = new TreeNode(0);
		LO.root.right.left = new TreeNode(0);
		LO.root.right.right = new TreeNode(5);

		System.out.println(LO.distributeCoins(LO.root));

	}

}
