package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @Sir Darey
 */
public class a8_LevelOrderTraversal {
    
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
    
    void levelOrder (TreeNode root) {
        if (root==null)
            return;
        
        Queue <TreeNode> queue = new LinkedList<>();        
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data+" ");
            
            if (temp.left!=null)
                queue.offer(temp.left);
            if (temp.right!=null)
                queue.offer(temp.right);
        }
    }
     
    public static void main(String[] args) {
        a8_LevelOrderTraversal binaryTree = new a8_LevelOrderTraversal();
        binaryTree.create();
        
        System.out.println("The Level Order Traversal of the Binary Tree is: ");
        binaryTree.levelOrder(binaryTree.root);
    }
}
