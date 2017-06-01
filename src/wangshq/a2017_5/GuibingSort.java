package wangshq.a2017_5;

import java.util.Arrays;

public class GuibingSort {
	  class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
	  
	  
	    public ListNode sortList(ListNode head) {
	        return null;
	    }
	    
	    
	    public int[] mergeSort(int[] a){
	    	if(a.length <= 1){
	    		return a;
	    	}
	    	
	    	int size = a.length>>2;
	    	
	    	int[] left = mergeSort(Arrays.copyOfRange(a, 0, size));
	    	int[] right = mergeSort(Arrays.copyOfRange(a, size-1, a.length));
	    	
	    	int i = 0;
	    	int j = 0;
	    	while(i != left.length && j != right.length){
//	    		if(left)
	    	}
	    	return null;
	    }
}
