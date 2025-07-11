
//   Definition for binary tree
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
  }
 
public class Solution6 {
    public int isSymmetric(TreeNode A) {
        if(A==null) return 1;
        return isSymmetricHelp(A.left, A.right);
    }
    
    private int isSymmetricHelp(TreeNode left, TreeNode right){
        if(left==null && right==null) return 1;
        if(left==null || right==null) return 0;
        
        if(left.val != right.val) return 0;
        
        if(isSymmetricHelp(left.left, right.right) == 1 && isSymmetricHelp(left.right, right.left)==1){
            return 1;
        }
        else{
            return 0;
        }
    }
}
