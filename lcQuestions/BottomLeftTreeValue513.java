package lcQuestions;

import java.util.LinkedList;
import java.util.Queue;

import DSAConcepts.TreeNode;

public class BottomLeftTreeValue513 {
	TreeNode root;
	int leftvalue ;
	//int prelevel =-1;
	public int findBottomLeftValue(TreeNode root) {
        if(root == null) return root.val;
        Queue<TreeNode> q = new LinkedList<>();
        int leftval = root.val;
        q.add(root);
        while(!q.isEmpty()){
            int height = q.size();
            System.out.println(height);
            for(int i = 0 ;i<height;i++){
                if(q.peek().right!=null) q.add(q.peek().right);
                if(q.peek().left!=null){ 
                    q.add(q.peek().left); 
                    leftval = q.peek().left.val;
                    
                }
                if(q!=null) q.poll();
            }
        }
        return leftval;
		
		
		//recurssion
//		leftvalue = root.val;
//        height(root,0);
//        //System.out.println(leftvalue);
//        return leftvalue;
    }
//	public void height(TreeNode root,int l){
//		
//        if(root == null) return;
//        if(root.left == null && root.right == null && l>prelevel) {
//        	leftvalue = root.val;
//        	prelevel = l;
//        }
//        height(root.left,l+1);
//        height(root.right,l+1);
//        
//    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BottomLeftTreeValue513 LO = new BottomLeftTreeValue513();
		LO.root = new TreeNode(3);
		LO.root.left = new TreeNode(9);
		LO.root.right = new TreeNode(20);
		LO.root.right.left = new TreeNode(15);
		LO.root.right.right = new TreeNode(7);

		System.out.println(LO.findBottomLeftValue(LO.root));
	}

}
