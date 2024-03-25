package 数据结构.树;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class 后续遍历_迭代 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode temp = null;
        // 入栈中-左-右，出栈中-右-左
        while(!stack.isEmpty()){
            temp = stack.pop();
            res.add(temp.val);
            if(temp.left != null) stack.push(temp.left);
            if(temp.right != null) stack.push(temp.right);
        }
        //  TODO：反转 左-右-中
        Collections.reverse(res);
        return res;
    }

}
