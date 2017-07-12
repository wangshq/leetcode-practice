/*
 * @(#)合并两个排序的链表.java 2017年7月10日下午10:57:13
 * leetcode
 * Copyright 2017 Thuisoft, Inc. All rights reserved.
 * THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package sword_offer;

import sword_offer.从尾到头打印链表.ListNode;

/**
 * 合并两个排序的链表
 * @author wangshq
 * @version 1.0
 *
 */
public class 合并两个排序的链表 {
    
    /**
     * 非递归版本
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }
        
        ListNode head = list1;
        if(list1.value > list2.value){
            head = list2;
        }
        
        while (list1 != null && list2 != null) {
            if(list1.value > list2.value){
                ListNode temp = list2.next;
                list2.next = list1;
                list2 = temp;
            }else{
                ListNode temp = list1.next;
                list1.next = list2;
                list1 = temp;
            }
        }
        
        return head;
    }
}
