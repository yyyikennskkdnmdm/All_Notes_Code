package 数据结构.树;

import java.util.ArrayList;
import java.util.List;

public class 后续遍历_递归 {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorderTraversal2(root, res);
        return res;
    }
    public static void postorderTraversal2(TreeNode root,List<Integer> l) {
        if(root != null){
            postorderTraversal2(root.left, l);
            postorderTraversal2(root.right, l);
            l.add(root.val);
        }
    }
}
