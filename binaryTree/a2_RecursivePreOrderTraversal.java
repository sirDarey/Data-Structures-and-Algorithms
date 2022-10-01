package binaryTree;

/**
 *
 * @Sir Darey
 */
public class a2_RecursivePreOrderTraversal {
    
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
        root = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);
        
        root.left = second; // 2 <-- root
        root.right = third; // root --> 3
        
        second.left = fourth;
        second.right = fifth; // 4 <-- 2 --> 5
        
        third.left = sixth;
        third.right = seventh; // 6 <-- 3 --> 7
    }
    
    void recursivePreOrder (TreeNode root) {
        if (root==null){
            System.out.println("The Binary Tree is Empty");
            return;
        }
        
        System.out.print(root.data + " ");
        recursivePreOrder(root.left);
        recursivePreOrder(root.right);
    }
     
    public static void main(String[] args) {
        a2_RecursivePreOrderTraversal binaryTree = new a2_RecursivePreOrderTraversal();
        binaryTree.create();
        
        System.out.println("The Recursive PreOrder Traversal of the Binary Tree is: ");
        binaryTree.recursivePreOrder(binaryTree.root);
    }
}
