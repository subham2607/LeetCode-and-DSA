package DSAConcepts;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class NaryLevelOrder {
	TreeNode root;
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> list1= new ArrayList<>();
            int level = q.size();
            for(int i =0;i<level;i++){
                list1.add(q.peek().val);
                for(TreeNode j:q.peek().children){
                    q.add(j);
                }
                q.remove();
            }
            if(!list1.isEmpty()) list.add(list1);
        }
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NaryLevelOrder DT = new NaryLevelOrder();
		DT.root = new TreeNode(1);
		DT.root.children.add(new TreeNode(3));
		DT.root.children.add(new TreeNode(2));
		DT.root.children.add(new TreeNode(4));
		
		DT.root.children.get(0).children.add(new TreeNode(5));
		DT.root.children.get(0).children.add(new TreeNode(6));
		List<List<Integer>> n = DT.levelOrder(DT.root);
		System.out.println(n);	
	}
}
