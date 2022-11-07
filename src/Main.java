import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeNode root = buildTree();
//        preTraverseTree(root);
//        System.out.println();
//        innerTraverseTree(root);
//        System.out.println();
//        postTraverseTree(root);
        System.out.println();
//        breadthFirstTraverse(root);
//        breadthFirstTraverseByLevel(root);

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(5);
        set.add(6);
        set.add(7);

        for (int num : set){
            System.out.print(num + " ");
        }
        System.out.println();

        Map<String, String> map = new HashMap<>();
        map.put("Jeff", "UofT");
        map.put("Laura", "Berkeley");
        map.put("Mohan", "Shit");
        map.put("Jerry", "Emily Carr");

        for (String key : map.keySet()){
            System.out.println(key + ":" + map.get(key));
        }


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
    public static void breadthFirstTraverse(TreeNode root){
        if (root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            System.out.print(cur.val + " ");
            if(cur.left != null){
                queue.offer(cur.left);
            }
            if (cur.right != null){
                queue.offer(cur.right);
            }
        }
    }

    public static void breadthFirstTraverseByLevel(TreeNode root){
        if (root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int n = queue.size();
            for (int i = 0; i < n; i ++){
                TreeNode cur = queue.poll();
                System.out.print(cur.val + " ");
                if(cur.left != null){
                    queue.offer(cur.left);
                }
                if (cur.right != null){
                    queue.offer(cur.right);
                }
            }
            System.out.println();
        }
    }
    public static void preTraverseTree(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preTraverseTree(root.left);
        preTraverseTree(root.right);
    }



    public static void innerTraverseTree(TreeNode root){
        if (root == null) return;
        innerTraverseTree(root.left);
        System.out.print(root.val +" ");
        innerTraverseTree(root.right);
    }

    public static void postTraverseTree(TreeNode root){
        if (root == null) return;
        postTraverseTree(root.left);
        postTraverseTree(root.right);
        System.out.print(root.val + " ");
    }
}
class TreeNode {
    public int val;

    public TreeNode left;

    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }


}
//Hello
//test branch
//Test run 2