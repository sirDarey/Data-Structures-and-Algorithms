package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @Sir Darey
 */
public class a9_FindMaximumValue {
    
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
        TreeNode fourth = new TreeNode(9);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);
        
        root.left = second; // 2 <-- root
        root.right = third; // root --> 3
        
        second.left = fourth;
        second.right = fifth; // 9 <-- 2 --> 5
        
        third.left = sixth;
        third.right = seventh; // 6 <-- 3 --> 7
    }
    
    void iterativeFind (TreeNode root) {
        if (root==null)
            return;
        
        Queue <TreeNode> queue = new LinkedList<>();        
        queue.offer(root);
        int maxValue = Integer.MIN_VALUE;
        
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data+" ");
            
            if (temp.data>maxValue)
                maxValue = temp.data;
            
            if (temp.left!=null)
                queue.offer(temp.left);
            if (temp.right!=null)
                queue.offer(temp.right);
        }
        
        System.out.println("\nThe Maximum Value of the Binary Tree using Iterative Method is: "+maxValue);
    }
    
    int recursiveFind (TreeNode root) {
        if (root==null) 
            return Integer.MIN_VALUE;
        
        int maxValue = root.data;
        int left = recursiveFind(root.left);
        int right = recursiveFind(root.right);
        
        if (left > maxValue)
            maxValue = left;
        if (right > maxValue)
            maxValue = right;
        
        return maxValue;
    }
     
    public static void main(String[] args) {
        a9_FindMaximumValue binaryTree = new a9_FindMaximumValue();
        binaryTree.create();
        
        System.out.println("The Level Order Traversal of the Binary Tree is: ");
        binaryTree.iterativeFind(binaryTree.root);
                
        System.out.println("\nThe Maximum Value of the Binary Tree using Recursive Method is: "
                +binaryTree.recursiveFind(binaryTree.root));
    }
}
