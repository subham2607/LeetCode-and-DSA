package DSAConcepts;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	
	public int val;
	int nary;
	List<TreeNode> children = new ArrayList<>();
	public TreeNode left;
	public TreeNode right;
	public TreeNode(){}
	public TreeNode(int val){
		this.val = val;
		left= right =null;
	}
	public TreeNode (int nary, List<TreeNode> children){
		this.nary = nary;
		this.children = children;
	}
}

