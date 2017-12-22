/*
 * @(#)包含min函数的栈.java 2017年8月9日上午11:02:51
 * leetcode
 * Copyright 2017 Thuisoft, Inc. All rights reserved.
 * THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package sword_offer;

import java.util.Stack;

/**
 * 包含min函数的栈
 * @author wangshq
 * @version 1.0
 * 
 * 在用一个额外的栈来存最小元素的信息
 *
 */
public class 包含min函数的栈 {
    
    Stack<Integer> stack = new Stack<Integer>();
    
    Stack<Integer> minStack = new Stack<Integer>();
    
    public void push(int node) {
        if(minStack.isEmpty()){
            minStack.push(node);
        }else{
            if(minStack.peek() > node){
                minStack.push(node);
            }
        }
        stack.push(node);
    }
    
    public void pop() {
        if(stack.pop() == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return minStack.peek();
    }

}
