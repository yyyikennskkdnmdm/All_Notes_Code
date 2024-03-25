package 数据结构.树;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 先序遍历_迭代{

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        if(root != null) stack.push(root);
        TreeNode temp;
        while(stack.empty() == false){
            temp = stack.pop();
            res.add(temp.val);
            // TODO： 注意先入右，再入左，这样左孩子才可以先出
            if(temp.right != null) stack.push(temp.right);
            if(temp.left != null) stack.push(temp.left);
        }
        return res;
    }


    @Test
    public void test(){
        Stack<TreeNode> treeNodes = new Stack<>();
        treeNodes.push(new TreeNode(1,null,null));
        System.out.println(treeNodes);
    }
}
