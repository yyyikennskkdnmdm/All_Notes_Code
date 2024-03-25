package 数据结构.树;

import java.util.ArrayList;
import java.util.List;

public class 先序遍历_递归 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorderTraversal2(root, res);
        return res;
    }

    public static void preorderTraversal2(TreeNode root, List<Integer> l){
        if(root != null){
            l.add(root.val);
            preorderTraversal2(root.left, l);
            preorderTraversal2(root.right, l);
        }
    }
}


