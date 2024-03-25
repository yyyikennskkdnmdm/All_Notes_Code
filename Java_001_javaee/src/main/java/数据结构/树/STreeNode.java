package 数据结构.树;

public class STreeNode {
    int val;
    STreeNode left;
    STreeNode right;
    int ltag;
    int rtag;

    public STreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "STreeNode{" +
                "val=" + val +
                ", ltag=" + ltag +
                ", rtag=" + rtag +
                '}';
    }
}
