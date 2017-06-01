package wangshq.a2017_5;

public class TwoPointSearch {
	public static void main(String[] args) {
		
	}
	
	private int search(int[] arr , int k) {
		int left = 0;
		int right = arr.length-1;
		int mid = left+(right - left)/2;
		while(right>=left){
			if(arr[mid] > k){
				mid = right - 1;
			}else if (arr[mid] < k) {
				mid = left + 1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
