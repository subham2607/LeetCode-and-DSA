package DSAConcepts;

class TreeImplementation {
	
	TreeNode root;

	public void display(TreeNode root) {
		if(root != null) {
			display(root.left);
			System.out.print(root.val+" ");
			display(root.right);
			
		}
	}
	
	public static void main(String[] args) {
		
		TreeImplementation TI= new TreeImplementation();
		
		TI.root = new TreeNode(7);
		TI.root.left = new TreeNode(1);
		TI.root.right = new TreeNode(2);
		TI.root.left.left  = new TreeNode(9);
		TI.root.left.right = new TreeNode(7);
		TI.display(TI.root);
	}
}
