/*
   Question5: Add a method to return the number of leaves in a BST
*/
  
public class Question5 extends BST{
   public static void main(String[] args){
 
      TreeNode root = new TreeNode(5);
		root.left = new TreeNode(189);
		root.right = new TreeNode(11);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(88);
		root.right.left = new TreeNode(9);
		root.right.right = new TreeNode(987);
      Question5 tree= new Question5();
      int i=tree.getLeafCount(root);
      System.out.print(i);
   }
    
    //defaults to leaves from the root if no input is given
    int getLeafCount() 
    {
        return getLeafCount(root);
    }
  
    int getLeafCount(TreeNode cur) 
    {
        if (cur == null)
            return 0;
        if (cur.left == null && cur.right == null)
            return 1;
        else
            return getLeafCount(cur.left) + getLeafCount(cur.right);
   }
}