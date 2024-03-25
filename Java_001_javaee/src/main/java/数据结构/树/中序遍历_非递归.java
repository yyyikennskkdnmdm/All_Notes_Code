package 数据结构.树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 中序遍历_非递归 {


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(temp != null || !stack.isEmpty()){
            if(temp != null){
                stack.push(temp);
                temp = temp.left;
            }else{
                temp = stack.pop();
                res.add(temp.val);
                temp = temp.right;
            }
        }
        return res;
    }

}
