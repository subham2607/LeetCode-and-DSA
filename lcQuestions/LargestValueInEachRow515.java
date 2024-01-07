package lcQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import DSAConcepts.TreeNode;

public class LargestValueInEachRow515 {
	TreeNode root;
	public List<Integer> largestValues(TreeNode root) {
        List<Integer> max = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        max.add(root.val);
        while(!q.isEmpty()){
            int l = q.size();
            List<Integer> maxLevel = new ArrayList<>();
            for(int i = 0; i<l ; i++){
                if(q.peek().left!=null) {
                    q.add(q.peek().left);
                    maxLevel.add((q.peek().left).val);
                }
                if(q.peek().right!=null) {
                    q.add(q.peek().right);
                    maxLevel.add((q.peek().right).val);
                    //System.out.println(maxLevel.get(1));
                }
                if(q!= null)
                	q.poll();
            }
            if(maxLevel.size()>0) {
            	int value = maxval(maxLevel);
            	max.add(value);
            }
        }
        return max;
    }
    public int maxval(List<Integer> maxLevel){
        int l = maxLevel.size();
        
        int start = 0;
        int max = maxLevel.get(0) ;
        
        while(start<l-1){
            if(max < maxLevel.get(start+1)){
                max = maxLevel.get(start+1);
            }
            start++;
        }
        System.out.println(max);
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestValueInEachRow515 LO = new LargestValueInEachRow515();
		LO.root = new TreeNode(3);
		LO.root.left = new TreeNode(9);
		LO.root.right = new TreeNode(20);
		LO.root.right.left = new TreeNode(15);
		LO.root.right.right = new TreeNode(7);

		System.out.println(LO.largestValues(LO.root));
	}
}
