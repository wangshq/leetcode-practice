package sword_offer;

import sword_offer.从尾到头打印链表.ListNode;

public class 反转链表 {
	/*
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    } 1 <-- 2 ---> 3 ---> 4
	}*/
	public ListNode ReverseList(ListNode head) {
		if(head == null){
			return null;
		}else if (head.next == null) {
			return head;
		}
		ListNode pre = null;
		
    	while (head != null) {
    		ListNode last = head.next;
    		head.next = pre;
    		pre = head;
    		head = last;
		}
    	return pre;
    }
}
