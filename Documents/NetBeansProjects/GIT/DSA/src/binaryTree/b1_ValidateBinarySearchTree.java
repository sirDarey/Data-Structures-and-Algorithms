package binaryTree;

/**
 *
 * @Sir Darey
 * 
 * A BINARY SEARCH TREE is a Sorted Binary Tree such that the Nodes on the left of a particular node
 * have values less than that node and those on the right have values greater than that node.
 * 
 * At every level in the Binary Search Tree, each node satisfies the condition above.
 */
public class b1_ValidateBinarySearchTree {
    
    private TreeNode root;
    
    private static class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;
        
        public TreeNode (int data) {
            this.data = data;
        }
    }
    
    public void create () {
        root = new TreeNode(7);
        TreeNode second = new TreeNode(4);
        TreeNode third = new TreeNode(9);
        TreeNode fourth = new TreeNode(3);
        TreeNode fifth = new TreeNode(6);
        TreeNode sixth = new TreeNode(8);
        TreeNode seventh = new TreeNode(10);
        TreeNode eight = new TreeNode(2);
        
        root.left = second; 
        root.right = third; // 4 <--  7 --> 9
        
        second.left = fourth;
        second.right = fifth; // 3 <-- 4 --> 6
        
        third.left = sixth;
        third.right = seventh; // 8 <-- 9 --> 10
        
        fourth.left = eight; // 2 <-- 3 --> null
    }
    
    boolean isValid (TreeNode root, long min, long max) {
        if (root==null) 
           return true;
        
        if (min >= root.data || max <= root.data) 
            return false;
            
        boolean left = isValid(root.left, min, root.data);
        
        if (left) {
            boolean right = isValid(root.right, root.data, max);
            return right;
        }
        
        return false;        
    }
     
    public static void main(String[] args) {
        b1_ValidateBinarySearchTree binarySearchTree = new b1_ValidateBinarySearchTree();
        binarySearchTree.create();
        
        if (binarySearchTree.isValid(binarySearchTree.root, Integer.MIN_VALUE, Integer.MAX_VALUE))
            System.out.println("The Binary Search Tree IS Valid");
        else
            System.out.println("The Binary Search Tree is NOT Valid");
       
    }
}
