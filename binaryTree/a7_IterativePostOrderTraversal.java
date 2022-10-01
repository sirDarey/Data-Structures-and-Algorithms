package binaryTree;

import java.util.Stack;

/**
 *
 * @Sir Darey
 */
public class a7_IterativePostOrderTraversal {
    
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
    
    void iterativePostOrder (TreeNode root) {
        if (root==null)
            return;
        
        Stack <TreeNode> stack = new Stack<>();        
        TreeNode current = root;
        
        while (current!=null || !stack.isEmpty()) {
            if (current!=null){
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;
                if (temp==null) {
                    temp = stack.pop();
                    System.out.print(temp.data +" ");
                    
                    while (!stack.isEmpty() && temp==stack.peek().right) {
                        temp = stack.pop();
                        System.out.print(temp.data +" ");
                    }
                } else
                    current = temp;
            }
        }
        
    }
     
    public static void main(String[] args) {
        a7_IterativePostOrderTraversal binaryTree = new a7_IterativePostOrderTraversal();
        binaryTree.create();
        
        System.out.println("The Iterative PostOrder Traversal of the Binary Tree is: ");
        binaryTree.iterativePostOrder(binaryTree.root);
    }
}
