package DSAConcepts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBFSTree {
	TreeNode root;
	List<List<Integer>> level = new ArrayList<>();
	//Solution using Recursion.
	
//	  public List<List<Integer>> levelOrder(TreeNode root) {
//		  int h = height(root);
//		  
//		  for(int i=1 ; i<=h;i++) { 
//			  List<Integer> ladder = new ArrayList<>();
//			  levelorderBST(root,i,ladder); 
//			  level.add(ladder); 
//			  } 
//		  return level; 
//	  } 
//	  
//	  public void levelorderBST(TreeNode root,int l,List<Integer> ladder) {
//	  
//		  if(root == null) return; 
//		  if(l == 1) { 
//			  ladder.add(root.val);
//		  } 
//		  if(l>1) {
//			  levelorderBST(root.left,l-1,ladder); 
//			  levelorderBST(root.right,l-1,ladder); 
//		  }
//		  
//	  } 
//	  
//	  public int height(TreeNode root) {
//	  
//		  if(root == null) return 0; 
//		  int lheight = height(root.left); 
//		  int rheight = height(root.right); 
//		  if(lheight > rheight) { 
//			  return(lheight +1);
//		  
//		  }else return(rheight + 1);
//	  
//	  }
	 
	//Solution using queue
	public List<List<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		
		if(root == null) return level;
		queue.add(root);
		//ladder.add(root.val);
		//level.add(ladder);
		while(!queue.isEmpty()) {
			int l = queue.size();
			//TreeNode element =queue.peek();
			List<Integer> ladder = new ArrayList<>();
			
			for(int i=0;i<l;i++) {
				if(queue.peek().left!= null) queue.add(queue.peek().left );
				if(queue.peek().right!= null) queue.add(queue.peek().right );
				if(queue!=null)
					ladder.add((queue.poll()).val);
				//System.out.println(ladder);
			}
			level.add(ladder);
			
		}
		return level;
	}

	public static void main(String[] args) {
		LevelOrderBFSTree LO = new LevelOrderBFSTree();
		LO.root = new TreeNode(3);
		LO.root.left = new TreeNode(9);
		LO.root.right = new TreeNode(20);
		LO.root.right.left = new TreeNode(15);
		LO.root.right.right = new TreeNode(7);

		System.out.println(LO.levelOrder(LO.root));
	}

}
