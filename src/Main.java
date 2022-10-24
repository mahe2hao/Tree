public class Main {
    public static void main(String[] args) {
        TreeNode root = buildTree();
        traverseTree(root);
    }
    public static TreeNode buildTree() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        node4.left = node8;
        node4.right = node9;

        return node1;
    }
    public static void traverseTree(TreeNode root) {
        System.out.print(root.val + " ");
        traverseTree(root.left);
        traverseTree(root.right);
    }
}
class TreeNode {

    public static void main(String[] args) {

    }

    public int val;

    public TreeNode left;

    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }


}
//Hello
//test branch