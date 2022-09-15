import java.util.ArrayList;

public class BST{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }
    public Node buildTree(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        else if(val>root.data){
            root.right = buildTree(root.right, val);
        }else{
            root.left = buildTree(root.left, val);
        }
        return root;
    }
    public static void inorder(Node root){
        //Inorder Traversal of BST gives a sorted sequence
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root,int key){//O(H)
        if(root.data == key){
            return true;
        }else if(key>root.data && root.right != null){
            return search(root.right, key);
        }else if(key<root.data && root.left != null){
            return search(root.left, key);
        }else{
            return false;
        }
    }
    //also correct -->
    // public static boolean search(Node root,int key){
    //     if(root == null){
    //         return false;
    //     }
    //     if(root.data > key){
    //         return search(root.left, key)
    //     }else if(root.data == key){
    //         return true;
    //     }else{
    //         return search(root.right, key)
    //     }
    // }
    public static Node delete(Node root,int val){
        if(root.data < val){
            root.right = delete(root.right, val);//attaching the right subtree after deletion of the node
        }else if(root.data > val){
            root.left = delete(root.left, val);//attaching the right subtree after deletion of the node
        }else{//when root.data == val
            //case 1
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2
            else if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                //case 3
                Node a = inorderSuccessor(root.right);
                root.data = a.data;
                root.right = delete(root.right, a.data);
            }
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void printInRange(Node root,int x,int y){
        //eg: x = 6 & y = 10
        if(root == null){
            return;
        }
        if(root.data >= x && root.data <= y){
            printInRange(root.left, x, y);
            System.out.print(root.data+" ");
            printInRange(root.right, x, y);
        }else if(x >= root.data){
            printInRange(root.right, x, y);
        }else if(y<=root.data){
            printInRange(root.left, x, y);
        }
    }
    public static void printPath(ArrayList<Integer> path){
        for (int i = 0; i < path.size(); i++) {
            System.out.println(path.get(i)+"->");
        }
        System.out.println();
    }
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static void rootToLeafPaths(Node root){
        if(root==null){
            return;
        }
        arr.add(root.data);
        if(root.left == null && root.right == null){
            // printPath(arr);
            System.out.println(arr);
        }else{
            rootToLeafPaths(root.left);
            rootToLeafPaths(root.right);
        }
        arr.remove(arr.size()-1);

    }
    public static void main(String[] args) {
        int nodes[] = {8,5,3,1,4,6,10,11,14};
        BST tree = new BST();
        Node root=null;
        for(int i = 0;i<nodes.length;i++){
            root = tree.buildTree(root, nodes[i]);
        }
        inorder(root);
        System.out.println();
        // if(search(root, 7)){
        //     System.out.println("\nKey Found");
        // }else{
        //     System.out.println("\nkey Not found");
        // }
        
        // root = delete(root, 5);
        // System.out.println("\nafter deletion");
        // inorder(root);

        // printInRange(root, 6, 10);
        
        System.out.println("paths : ");
        rootToLeafPaths(root);
    }
}