package lcQuestions;

import DSAConcepts.TreeNode;

public class MaxDeptofNAryTree {
	TreeNode root;
	
	public int maxDepth(TreeNode root) {
		
        int height = 1;
        if(root == null) return 0;
        for(TreeNode i:root.children){
            int h = maxDepth(i)+1;
            if(height<h) {
                height = h;
            }
        }
        return height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxDeptofNAryTree tree = new MaxDeptofNAryTree();
		tree.root = new TreeNode(1);
		tree.root.children.add(new TreeNode(3));
		tree.root.children.add(new TreeNode(2));
		tree.root.children.add(new TreeNode(4));
		
		tree.root.children.get(0).children.add(new TreeNode(5));
		tree.root.children.get(0).children.add(new TreeNode(6));
		System.out.println(tree.maxDepth(tree.root));
	}

}
