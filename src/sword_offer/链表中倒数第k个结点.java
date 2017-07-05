package sword_offer;

import sword_offer.从尾到头打印链表.ListNode;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * @author wangshq
 *
 */
public class 链表中倒数第k个结点 {
	
	 public ListNode findKthToTail(ListNode head,int k) {
		 ListNode pre =  head;
		 ListNode last = head;
		 
		 for (int i = 0; i < k; i++) {
			 if(last == null){
				 throw new RuntimeException("last为空");
			 }
			 last = last.next;
		 }
		 
		 while (last != null) {
			 last = last.next;
			 pre = pre.next;
		 }
		 
		 return pre;
	 }
}
