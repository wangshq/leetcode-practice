/*
 * @(#)求二叉树中节点的最大距离.java 2017年8月15日下午5:54:51
 * leetcode
 * Copyright 2017 Thuisoft, Inc. All rights reserved.
 * THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package 编程之美;

/**
 * 求二叉树中节点的最大距离
 * @author wangshq
 * @version 1.0
 *
 *如果把二叉树看成一个图，父子节点之间的连线看成是双向的，定义“距离”为两个节点之间边的个数。写一个程序求一棵二叉树中相距最远的两个节点之间的距离。
 *
 *分析：
 *
二叉树中节点的最大距离必定是两个叶子节点的距离。求某个子树的节点的最大距离，有三种情况：
1.两个叶子节点都出现在左子树；
2.两个叶子节点都出现在右子树；
3.一个叶子节点在左子树，一个叶子节点在右子树。
只要求得三种情况的最大值，结果就是这个子树的节点的最大距离。

int find_max_len(Node *root);

case 1: 两个叶子节点都出现在左子树。find_max_len(root->pLeft);

case 2: 两个叶子节点都出现在右子树。find_max_len(root->pRight);

case 3: 一个出现在左子树，一个出现在右子树。distance(root->pLeft) + distance(root->pRight) + 2;其中，distance()计算子树中最远的叶子节点与根节点的距离，其实就是左子树的高度减1。
 */
public class 求二叉树中节点的最大距离 {
    // 计算树的高度
    int height(Node root)
    {
        if(root == null) {
            return 0;
        }

        return max(height(root.pLeft), height(root.pRight)) + 1;
    }

    int find_max_len(Node root)
    {
        if(root == null) {
            return 0;
        }

        int lmax = find_max_len(root.pLeft); // 左子树中的最大距离
        int rmax = find_max_len(root.pRight); // 右子树中的最大距离

        int lh = 0, rh = 0;

        if(root.pLeft != null) {
            // 左子树最远的叶子节点与根节点的距离
            lh = height(root.pLeft);
        }

        if(root.pRight != null) {
            // 右子树最远的叶子节点与根节点的距离
            rh = height(root.pRight);
        }

        return max(max(lmax, rmax), lh + rh);
    }

    /**
     * @param lmax
     * @param rmax
     * @return
     */
    private int max(int lmax, int rmax) {
        if(lmax > rmax){
            return lmax;
        }else{
            return rmax;
        }
    }
}

class Node {
    int data;
    Node pLeft;
    Node pRight;
};
