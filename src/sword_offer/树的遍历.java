package sword_offer;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
public class 树的遍历 {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
         
         
        node1.left = node2;
        node1.right = node3;
         
        node2.left = node4;
        node2.right = node5;
         
        node3.left =  node6;
        node3.right = node7;
         
        
        midTraversal(node1);
        System.out.println();
        _midTraversal(node1);
    }
    
    //===============递归写法===========================================
    
    /**
     * 先序遍历
     */
    public static void preorderTraversal(TreeNode root){
        if(root != null){
            System.out.println(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }
    
    /**
     * 中序遍历
     */
    public static void midTraversal(TreeNode root){
        if(root != null){
        	System.out.print("(");
        	midTraversal(root.left);
            System.out.print(root.val);
            midTraversal(root.right);
            System.out.print(")");
        }
    }
    
    /**
     * 后序遍历
     */
    public static void rightTraversal(TreeNode root){
        if(root != null){
        	rightTraversal(root.left);
        	rightTraversal(root.right);
            System.out.println(root.val);
        }
    }
    
    //=====================================================================
    
    //===============非递归写法===========================================
    /**
     * 先序遍历
     */
    public static void _preorderTraversal(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode flag = root;
        while(flag != null || stack.size()>0){
            while (flag != null) {
                stack.push(flag);
                System.out.println(flag.val);
                flag = flag.left;
            }
            flag = stack.pop();
            flag = flag.right;
        }
    }
    
    /**
     * 中序遍历
     */
    public static void _midTraversal(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode flag = root;
        while(flag != null || stack.size()>0){
            while (flag != null) {
                stack.push(flag);
                flag = flag.left;
            }

            flag = stack.pop();
            System.out.print(flag.val);
            
            flag = flag.right;
        }
    }
    
    /**
     * 后序遍历
     */
    public static void _rightTraversal(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode flag = root;
        TreeNode perviousNode = null;
        while(flag != null || stack.size()>0){
            while (flag != null) {
                stack.push(flag);
                flag = flag.left;
            }
            flag = stack.peek();
            if(flag.right == null || flag.right == perviousNode){
            	flag = stack.pop();
                System.out.println(flag.val);
                perviousNode = flag;
                flag = null;
            }else {
            	flag = flag.right;
			}
        }
    }
  //=====================================================================
  
}
