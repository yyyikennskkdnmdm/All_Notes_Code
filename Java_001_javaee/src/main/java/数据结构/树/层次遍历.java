package 数据结构.树;

import org.testng.annotations.Test;

import java.util.*;

public class 层次遍历 {

    public static List<List<Integer>> levelOrder_change(TreeNode root) {

        List<List<Integer>> results = new ArrayList<>();
        if(root == null) return results;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int size = queue.size();
        TreeNode temp = root;
        while(!queue.isEmpty()){
            List<Integer> result = new ArrayList<>();
            size = queue.size();
            while(size > 0){
                size--;
                temp = queue.poll();
                if(temp.left != null) queue.offer(temp.left);
                if(temp.right != null) queue.offer(temp.right);
                result.add(temp.val);
            }
            results.add(result);
        }
        return results;

    }


    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if(root == null) return results;
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.add(root);
        TreeNode temp = root;
        while(!queue1.isEmpty() || !queue2.isEmpty()){
            List<Integer> result = new ArrayList<>();
            if(!queue1.isEmpty()){
                while(!queue1.isEmpty()){
                    temp = queue1.remove();
                    result.add(temp.val);
                    if(temp.left != null) queue2.add(temp.left);
                    if(temp.right != null) queue2.add(temp.right);
                }
            }else{
                while(!queue2.isEmpty()){
                    temp = queue2.remove();
                    result.add(temp.val);
                    if(temp.left != null) queue1.add(temp.left);
                    if(temp.right != null) queue1.add(temp.right);
                }
            }
            results.add(result);
        }
        return results;
    }

    @Test
    public void test(){

        TreeNode root = new TreeNode(3, null, null);
        TreeNode node1 = new TreeNode(9, null, null);
        TreeNode node2 = new TreeNode(20, null, null);
        TreeNode node3 = new TreeNode(15, null, null);
        TreeNode node4 = new TreeNode(7, null, null);
        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;


        List<List<Integer>> results = levelOrder(root);
        Collections.reverse(results);
        System.out.println(results);



    }
}
