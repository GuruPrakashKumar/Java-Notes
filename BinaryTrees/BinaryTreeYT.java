import java.util.*;

public class BinaryTreeYT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int d){
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        public static void setterIdx(){
            idx = -1;
        }
        public static int getterIdx(){
            return idx;
        }
    }

    //NOTE: 
    // the time complexity of preorder, inorder and postorder traversal is O(n)
    public static void preorder(Node root){
        //root
        //left subtree
        //right subtree
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
        
    }
    public static void inorder(Node root){
        //left subtree
        //root
        //right subtree
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelorder(Node root){
        if(root == null){
            return;
        }
       Queue<Node> q = new LinkedList<>();
       q.add(root);
       q.add(null);
       while (!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null){
                if(q.isEmpty()){
                    break;
                }else{
                    System.out.println();
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
       }
    }
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);
        return leftNodes + rightNodes +1;
    }
    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
        
    }
    public static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }
        int heightLeft = heightOfTree(root.left);
        int heightRight = heightOfTree(root.right);
        if(heightLeft > heightRight){
            return heightLeft + 1;
        }else{
            return heightRight + 1;
        }
        
    }
    public static int diameter(Node root){//Time complexity of O(N^2) 
        if(root == null){
            return 0;
        }
        int diaLeft = diameter(root.left);
        int diaRight = diameter(root.right);
        int dia3 = heightOfTree(root.left)+heightOfTree(root.right)+1;
        //^^^Note that diam3 is the sum of (height of tree of left sub tree and right sub tree +1) ^^^^^
        int diam = Math.max(diaLeft, Math.max(diaRight, dia3));
        return diam;

    }
    public static void printKthLevelNodes(Node root,int level){
        if(root==null){
            return;
        }
        if(level==1){
            System.out.print(root.data+" ");
            return;
        }
            printKthLevelNodes(root.left, level-1);
            printKthLevelNodes(root.right, level-1);
        
    }
    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht,int diam){
            this.ht = ht;
            this.diam = diam;
        }

    }
    public static TreeInfo diameter2(Node root){//Time complexity O(N)
        if(root == null){
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);
        
        int myheight = Math.max(left.ht, right.ht)+1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(Math.max(diam1, diam2),diam3);
        return new TreeInfo(myheight, mydiam);
    }
    public static boolean isIdentical(Node root,Node subRoot){
        if(root==null && subRoot==null){
            return true;
        }
        if(root==null||subRoot==null){
            return false;
        }
        if(root.data == subRoot.data){
            return isIdentical(root.left,subRoot.left) && isIdentical(root.right,subRoot.right);
        }
            return false;
    }
    public static boolean isSubtree(Node root, Node subRoot) {
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }   
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
    /*Given the root of a binary tree, return the level order traversal of its nodes' values. 
    (i.e., from left to right, level by level).
    Leetcode question : 102. Binary Tree Level Order Traversal
    */
    public static List<List<Integer>> l = new ArrayList<>();
    public static void lo(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> l1 = new ArrayList<>();
        while(!q.isEmpty()){
            Node currNode = q.remove();
            
            if(currNode!=null){
                l1.add(currNode.data);
            }
            if(currNode == null){
                if(q.isEmpty()){
                    l.add(l1);
                    break;
                }else{
                    l.add(l1);
                    l1 = new ArrayList<>();
                    q.add(null);
                    
                }
            }else{
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static List<List<Integer>> levelOrder(Node root) {
        lo(root);
        return l;
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        System.out.println("Pre Order Traversal");
        preorder(root);

        System.out.println("In Order Traversal");
        inorder(root);

        System.out.println("Post Order Traversal");
        postorder(root);

        System.out.println("Level Order Traversal");
        levelorder(root);

        int countOfNodes = countNodes(root);
        System.out.println("\ncount of nodes is = "+countOfNodes);

        int sumOfNodes = sumOfNodes(root);
        System.out.println("sum of nodes is = "+sumOfNodes);

        int heightOfTree = heightOfTree(root);
        System.out.println("height of Tree is = "+heightOfTree);

        int diameterOfTree = diameter(root);
        System.out.println("Diameter of tree is = "+diameterOfTree);

        int diameter2OfTree = diameter2(root).diam;
        System.out.println("Diameter2 of tree is = "+diameter2OfTree);
        
        System.out.println("\n3rd level nodes are : ");
        printKthLevelNodes(root, 3);
        
        List<List<Integer>> l2 = new ArrayList<>();
        l2 = levelOrder(root);
        System.out.println("\n level order traversal : ");
        System.out.println(l2);
        // int subtree[] = {1,2,4,-1,-1,5,-1,-1};
        // tree.setterIdx();
        // System.out.println("idx value = "+tree.getterIdx());
        // Node subRoot = tree.buildTree(subtree);
        // System.out.println("Pre order traversal of subtree\n");
        // preorder(subRoot);
        // if(isSubtree(root, subRoot)){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }
    }
    
}
