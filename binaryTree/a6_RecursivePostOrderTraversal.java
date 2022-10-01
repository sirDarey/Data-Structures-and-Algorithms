package binaryTree;

/**
 *
 * @Sir Darey
 */
public class a6_RecursivePostOrderTraversal {
    
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
    
    void recursivePostOrder (TreeNode root) {
        if (root==null)
            return;
     
        recursivePostOrder(root.left);
        recursivePostOrder(root.right);
        System.out.print(root.data + " ");
    }
     
    public static void main(String[] args) {
        a6_RecursivePostOrderTraversal binaryTree = new a6_RecursivePostOrderTraversal();
        binaryTree.create();
        
        System.out.println("The Recursive PostOrder Traversal of the Binary Tree is: ");
        binaryTree.recursivePostOrder(binaryTree.root);
    }
}
