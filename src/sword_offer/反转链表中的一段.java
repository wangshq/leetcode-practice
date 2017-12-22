/*
 * @(#)反转链表中的一段.java 2017年12月7日上午10:34:30
 * leetcode
 * Copyright 2017 Thuisoft, Inc. All rights reserved.
 * THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package sword_offer;

/**
 * 反转链表中的一段
 * @author wangshq
 * @version 1.0
 *
 */
public class 反转链表中的一段 {

    static class Node{
        Node next = null;
        
        int value = -1;
        
        /**
         * 
         */
        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }
    }
    /**
     * 
     */
    private static void resever(Node head,int n,int m) {
        Node preN = head;
        for (int i = 0; i < n; i++) {
            preN = preN.next;
        }
        
        Node x = preN.next;
        Node y = x.next;
        
        for (int i = 0; i < m - n; i++) {
            Node temp = y.next;
            
            y.next = x;
            
            x = y;
            y = temp;
        }
        
        Node temp = preN.next;
        preN.next = x;
        temp.next = y;
    }
    
    public static void main(String[] args) {
        
        Node n7 = new Node(7,null);
        Node n6 = new Node(6,n7);
        Node n5 = new Node(5,n6);
        Node n4 = new Node(4,n5);
        Node n3 = new Node(3,n4);
        Node n2 = new Node(2,n3);
        Node n1 = new Node(1,n2);
        Node n0 = new Node(0,n1);
        Node head = new Node(-1,n0);
        
        resever(head,2,5);
        
        while(head !=null ){
            System.out.println(head.value);
            head = head.next;
        }
    }
}
