// Root to leaf path sum.

/**
 * Given a binary tree and an integer target, check whether there is a root-to-leaf path with its sum as target
 */

public class RootToLeafPathSum {
    boolean hasPathSum(Node root, int target) {
        // if root is leaf node
        if(root.left == null && root.right == null){
            // if data matches then true else false
            if(root.data == target){
                return true;
            } else {
                return false;
            }
        }
        // if left node present then find if target - data is the sum in any of the below path
        if(root.left!=null && hasPathSum(root.left, target-root.data)){
            return true;
        }
        // if right node present then find if target - data is the sum in any of the below path
        if(root.right!=null && hasPathSum(root.right, target-root.data)){
            return true;
        }
        // if no case matches
        return false;
    }
}
