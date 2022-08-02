package binaryTree;

import java.util.Stack;

/**
 *
 * @Sir Darey
 */
public class a3_IterativePreOrderTraversal {
    
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
    
    void iterativePreOrder (TreeNode root) {
        if (root==null){
            System.out.println("The Binary Tree is Empty");
            return;
        }
        
        Stack <TreeNode> stack = new Stack<>();
        stack.push(root);
        
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data +" ");
            
            if (temp.right!=null) 
                stack.push(temp.right);
            if (temp.left!=null) 
                stack.push(temp.left);
        }
        
    }
     
    public static void main(String[] args) {
        a3_IterativePreOrderTraversal binaryTree = new a3_IterativePreOrderTraversal();
        binaryTree.create();
        
        System.out.println("The Iterative PreOrder Traversal of the Binary Tree is: ");
        binaryTree.iterativePreOrder(binaryTree.root);
    }
}
