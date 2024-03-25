package 数据结构.树;

import org.testng.annotations.Test;

public class 中序线索二叉树 {
    private  static  STreeNode pre = null, n = null;
    public static void main(String[] args) {
        STreeNode root=new STreeNode(1);
        STreeNode b = new STreeNode(2);
        STreeNode c = new STreeNode(3);
        STreeNode d = new STreeNode(4);
        STreeNode e = new STreeNode(5);
        root.left = b;
        root.right = c;
        b.right = d;
        c.left = e;

        CreateInorder(root);
        //遍历线索二叉树
        Inorder(root);

    }
    public static void InTHread(STreeNode p){
        if(p!=null){
            InTHread(p.left);
            if(p.left==null){
                p.left=pre;
                p.ltag=1;
            }
            if(pre!=null&&pre.right==null){
                pre.right=p;
                pre.rtag=1;
            }
            pre=p;
            InTHread(p.right);
        }
    }
    public static void CreateInorder(STreeNode root){
        pre = null;
        if(root != null){
            InTHread(root);
            pre.right = null;
            pre.rtag = 1;
        }
    }

    public static STreeNode firstNode(STreeNode root){
        while(root.ltag == 0) root = root.left;
        return root;
    }

    public static STreeNode nextNode(STreeNode root){
        if(root.rtag == 0) return firstNode(root.right);
        return root.right;
    }
    public static void Inorder(STreeNode root){
        for(n = firstNode(root);n!=null;n=nextNode(n)){
            System.out.println(n);
        }
    }

    @Test
    public void test(){
        STreeNode root=new STreeNode(1);
        STreeNode b = new STreeNode(2);
        STreeNode c = new STreeNode(3);
        STreeNode d = new STreeNode(4);
        STreeNode e = new STreeNode(5);
        root.left = b;
        root.right = c;
        b.right = d;
        c.left = e;
        STreeNode pre = null;


    }

}
