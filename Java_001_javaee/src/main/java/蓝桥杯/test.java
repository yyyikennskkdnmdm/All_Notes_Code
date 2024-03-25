package 蓝桥杯;

import java.util.*;
public class test {
    private static Tree root;
    private static int N = 110;
    private static int[] count = new int[N];
    private static int cnt = 0, k = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        for (String s : next.split(" ")) {
            count[cnt++] = Integer.parseInt(s);
        }

        root = new Tree(count[k++]);


    }

    public static void build1(){
        Tree temp = root;
        while(k < cnt){
            if(count[k] > temp.val){
                if(temp.right == null){
                    temp.right = new Tree(count[k++]);
                }else{
                    temp = temp.right;
                }
            }else if(count[k] < temp.val) {
                if (temp.left == null) {
                    temp.left = new Tree(count[k++]);
                } else {
                    temp = temp.left;
                }
            }
        }
    }

    public static void build2(Tree root, Tree q, int height){
        if(root != null){

            if(root.right != null) build2(root.right, q,height + 1);
            //打印
            q = root;
            if(root.left != null) build2(root.left,q, height+1);

        }
    }
}
class Tree{
    int val;
    Tree left;
    Tree right;
    Tree back;
    Tree(int val){
        this.val=val;
        this.left = null;
        this.right = null;
    }

}
