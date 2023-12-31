package DSAConcepts;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	
	int val;
	int nary;
	List<TreeNode> children = new ArrayList<>();
	TreeNode left;
	TreeNode right;
	TreeNode(){}
	TreeNode(int val){
		this.val = val;
		left= right =null;
	}
	TreeNode (int nary, List<TreeNode> children){
		this.nary = nary;
		this.children = children;
	}
}

