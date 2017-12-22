package sword_offer;

/**
 * 题目：输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回
 * @author wangshq
 *
 */
public class 重建二叉树 {

	/**
	 * 前序遍历的一个节点是根节点，在中序序列里找到这个根节点。
	 * 中序序列的左边是树的左子树，右边是右子树。
	 * 然后前序遍历的一下个节点
	 * 
	 * @param pre
	 * @param in
	 * @return
	 */
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    	return reConstructBinaryTree(pre, 0,pre.length-1,in,0,in.length-1);
    }

    
    public TreeNode reConstructBinaryTree(int[] pre,int pStart,int pEnd,int[] in ,int iStart,int iEnd){
    	
    	if(pStart >= pEnd && iStart >=iEnd){
    		int root = pre[pStart];
    		TreeNode node = new TreeNode(root);
        	int index = -1;
        	for (int i = iStart; i <= iEnd; i++) {
    			if(in[i] == root){
    				index = i;
    			}
    		}
        	
        	node.left = reConstructBinaryTree(pre, pStart+1,pStart+index-iStart,in,iStart,index-1);
        	node.right = reConstructBinaryTree(pre, pStart+index-iStart+1, pEnd, in, index+1, iEnd);
        	return node;
    	}else{
    		return null;
    	}
    }
}


