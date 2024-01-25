package lcQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import DSAConcepts.TreeNode;


public class FlattentoLL {
	TreeNode root;
	public void flatten(TreeNode root) {
        if(root == null) return;

        Stack<TreeNode> s = new Stack<>();
        
        s.push(root);
        while(!s.isEmpty()){
            TreeNode curr = s.pop();
            if(curr.right !=null) {
                s.push(curr.right);
            }
            if(curr.left !=null) {
                s.push(curr.left);
            }
            if(!s.isEmpty())
                curr.right = s.peek();
            curr.left = null;
            //System.out.println(root.right.right.val);
        }
    }
	List<Integer> arr = new ArrayList<>();
	public List<Integer> display(TreeNode root){
		
		
		if(root!=null) {
			int value = root.val;
			arr.add(value);
			display(root.right);
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlattentoLL LO = new FlattentoLL();
		LO.root = new TreeNode(1);
		LO.root.left = new TreeNode(2);
		LO.root.left.left = new TreeNode(3);
		LO.root.left.right = new TreeNode(4);
		LO.root.right = new TreeNode(5);
		//LO.root.right.left = new TreeNode(0);
		LO.root.right.right = new TreeNode(6);
		LO.flatten(LO.root);
		System.out.println(LO.display(LO.root));
	}

}
