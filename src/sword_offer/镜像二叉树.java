/*
 * @(#)镜像二叉树.java 2017年8月1日下午2:12:14
 * leetcode
 * Copyright 2017 Thuisoft, Inc. All rights reserved.
 * THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package sword_offer;

/**
 * 镜像二叉树
 * @author wangshq
 * @version 1.0
 *
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 
 * 二叉树的镜像定义：源二叉树 
            8
           /  \
          6   10
         / \  / \
        5  7 9 11
        镜像二叉树
            8
           /  \
          10   6
         / \  / \
        11 9 7  5
 */
public class 镜像二叉树 {

    public void mirrorTree(TreeNode root) {
        if(root == null){
            return;
        }
        if(root.left != null || root.right != null){
            TreeNode temRoot = root.left;
            root.left = root.right;
            root.right = temRoot;
        }
        
        mirrorTree(root.left);
        mirrorTree(root.right);
    }
}
