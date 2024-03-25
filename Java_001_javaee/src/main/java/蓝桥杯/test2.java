package 蓝桥杯;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
        int[] a = {-1};
        int[] b = {-1};
        TreeNode t = buildTree(a, b);
        trace(t);
    }
    public static void trace(TreeNode root){
        if(root != null){
            System.out.print(root.val + " ");
            trace(root.left);
            trace(root.right);
        }
    }
    private static int k = 0;

    public static TreeNode buildTree(int[] preorder, int[] inorder) {

        TreeNode tree = build(preorder, inorder, 0, inorder.length-1);
        return tree;



    }

    public static TreeNode build(int[] preorder, int[] inorder,int left, int right){

        if(left > right) return null;

        int mid = 0;
        for(int i = left; i <= right; i++){
            if(inorder[i] == preorder[k]){
                mid = i;
                break;
            }
        }

        TreeNode node = new TreeNode(preorder[k++]);



        node.left = build(preorder, inorder, left, mid-1);
        node.right = build(preorder, inorder,mid + 1, right);

        return node;

    }



}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
