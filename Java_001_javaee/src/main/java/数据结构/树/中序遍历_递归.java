package 数据结构.树;

import java.util.ArrayList;
import java.util.List;

public class 中序遍历_递归 {


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root,res);
        return res;
    }
    public void inorder(TreeNode root, List<Integer> res){
        if(root != null){
            inorder(root.left,res);
            res.add(root.val);
            inorder(root.right,res);
        }
    }
}
