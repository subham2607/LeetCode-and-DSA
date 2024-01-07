package DSAConcepts;

import java.util.LinkedList;
import java.util.Queue;



public class completeBinaryTreeCheck958 {
	TreeNode root;
	public boolean isCompleteTree(TreeNode root) {
		//first check till level h-1 all nodes are full BT
        //nodes left to right in last level
        //i root left child is at 2i+1,right at 2i+2
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = false;
//returns true when complete BT.
        while(!q.isEmpty()) {

            if(q.peek().left != null) {
                q.add(q.peek().left);
                if(flag==true) return false;
            }else flag = true;
            if(q.peek().right != null) {
                q.add(q.peek().right);
                if(flag==true) return false;
            }else flag = true;
            q.poll();
        }
        
        return flag;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		completeBinaryTreeCheck958 LO = new completeBinaryTreeCheck958();
		LO.root = new TreeNode(0);
		LO.root.left = new TreeNode(0);
		LO.root.left.left = new TreeNode(0);
		LO.root.left.right = new TreeNode(0);
		LO.root.right = new TreeNode(0);
		//LO.root.right.left = new TreeNode(0);
		LO.root.right.right = new TreeNode(5);

		System.out.println(LO.isCompleteTree(LO.root));
	}
}
