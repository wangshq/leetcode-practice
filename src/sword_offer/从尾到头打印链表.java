package sword_offer;
import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * @author wangshq
 *
 */
public class 从尾到头打印链表 {

	class ListNode{
		int value;
		ListNode next = null;
		public ListNode(int value) {
			this.value = value;
		}
	}
	
	/**
	 * 第一种：使用栈
	 * @param listNode
	 * @return
	 */
	public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
		Stack<Integer> stack = new Stack<Integer>();
		
		while (listNode != null) {
			stack.push(listNode.value);
			listNode = listNode.next;
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (stack.size() > 0) {
			list.add(stack.pop());
		}
		
		return list;
    }
	
	/**
	 * 第二种：使用递归
	 * @param listNode
	 * @return
	 */
	ArrayList<Integer> list = new ArrayList<Integer>();
	public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
		
		if (listNode != null) {
			printListFromTailToHead2(listNode.next);
			list.add(listNode.value);
		}
		
		return list;
    }
	
	
}
