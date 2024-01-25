package DSAConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ZigZagTraversal {
	TreeNode root;
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        //List<Integer> list = new ArrayList<>();
        List<List<Integer>> list1 = new ArrayList<>();
        if(root == null) return list1;
        Stack<TreeNode> currentLevel = new Stack<>();
        Stack<TreeNode> nextLevel = new Stack<>();
        currentLevel.push(root);
        
        boolean Lefttoright = true;
        while(!currentLevel.isEmpty()){
            List<Integer> list = new ArrayList<>();
            
            while(!currentLevel.isEmpty()){
                TreeNode node = currentLevel.pop();
                list.add(node.val);
                if(Lefttoright){
                    if(node.left!=null) nextLevel.push(node.left);
                    if(node.right!=null) nextLevel.push(node.right);
                }
                else{
                    if(node.right!=null) nextLevel.push(node.right);
                    if(node.left!=null) nextLevel.push(node.left);
                }
            }
            if(currentLevel.isEmpty()){
                Lefttoright=!Lefttoright;
                Stack<TreeNode> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
                list1.add(list);
            }
        }
        return list1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ZigZagTraversal DT = new ZigZagTraversal();
		DT.root = new TreeNode(1);
		DT.root.left = new TreeNode(3);
		DT.root.left.left = new TreeNode(5);
		DT.root.left.right = new TreeNode(3);
		DT.root.right = new TreeNode(2);
		//LO.root.right.left = new TreeNode(0);
		DT.root.right.right = new TreeNode(9);
		List<List<Integer>> n = DT.zigzagLevelOrder(DT.root);
		for(int i=0;i<n.size();i++) {
			System.out.println(n.get(i));
		}
	}

}
