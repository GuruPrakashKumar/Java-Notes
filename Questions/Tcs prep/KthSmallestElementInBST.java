import java.util.*;

class KthSmallestElementInBST {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int k = sc.nextInt(); 
        int[] nodes = new int[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = sc.nextInt();
        }
        TreeNode root = null;
        for (int i = 0; i < n; i++) {
            root = insert(root, nodes[i]);
        }
        int[] result = {0, 0};
        findKthSmallest(root, k, result);
        System.out.println(result[1]);
    }
    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void findKthSmallest(TreeNode root, int k, int[] result) {
        if (root == null) {
            return;
        }
        findKthSmallest(root.left, k, result);
        result[0]++;
        if (result[0] == k) {
            result[1] = root.val;
            return;
        }
        findKthSmallest(root.right, k, result);
    }
}