package binaryTree;

import java.util.Stack;

/**
 *
 * @Sir Darey
 */
public class a5_IterativeInOrderTraversal {
    
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
    
    void iterativeInOrder (TreeNode root) {
        if (root==null)
            return;
        
        Stack <TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        
        while (!stack.isEmpty() || temp!=null) {
         
            if (temp!=null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data +" ");
                temp = temp.right; 
            }
        }
        
    }
     
    public static void main(String[] args) {
        a5_IterativeInOrderTraversal binaryTree = new a5_IterativeInOrderTraversal();
        binaryTree.create();
        
        System.out.println("The Iterative InOrder Traversal of the Binary Tree is: ");
        binaryTree.iterativeInOrder(binaryTree.root);
    }
}
