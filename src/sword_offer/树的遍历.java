package sword_offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import javax.xml.soap.Node;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
    
    /** (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.valueOf(val);
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
         
         
        node1.left = node3;
        node1.right = node2;
         
        node2.left = node4;
        node2.right = node5;
         
        node3.left =  node6;
        node3.right = node7;
        TreeNode node8 = new TreeNode(8);
        node6.right = node8;
        
        List<TreeNode> aa = new ArrayList<TreeNode>();
//        finalTraversal(node1,node8,aa);
        cengciBianli(node1);
//        System.out.println(aa.toString());
//        System.out.println();
    }
    //==========层次遍历========================================
    public static void cengciBianli(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        TreeNode node = null;
        while((node = queue.poll()) != null){
            System.out.println(node);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
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
    
    static boolean isFind = false;
    /**
     * 后序遍历
     */
    public static void finalTraversal(TreeNode root,TreeNode find,List<TreeNode> path){
        if(isFind){
            return;
        }
        if(root != null){
            path.add(root);
            if(root == find){
                isFind = true;
                return;
            }
            finalTraversal(root.left,find,path);
            finalTraversal(root.right,find,path);
            if(isFind){
                return;
            }
            path.remove(root);
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
