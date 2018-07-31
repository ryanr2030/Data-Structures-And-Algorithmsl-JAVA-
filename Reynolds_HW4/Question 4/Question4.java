import java.util.*;
public class Question4 extends BST{
   public static void main(String[] args){
 
      TreeNode root = new TreeNode(5);
		root.left = new TreeNode(189);
		root.right = new TreeNode(11);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(88);
		root.right.left = new TreeNode(9);
		root.right.right = new TreeNode(987);
      Question4 tree= new Question4();
      tree.breadthFirst(root);
   }
public boolean breadthFirst(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>() ;
    if (root == null)
        return false;
    queue.clear();
    queue.add(root);
    while(!queue.isEmpty()){
        TreeNode node = queue.remove();
        System.out.print(node.element + " ");
        if(node.left != null) queue.add(node.left);
        if(node.right != null) queue.add(node.right);
    }
    return true;

}   

}