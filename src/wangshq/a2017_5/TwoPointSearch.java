package wangshq.a2017_5;

public class TwoPointSearch {
	public static void main(String[] args) {
		System.out.println(search(new int[]{1,3,5,7,8,10,22,23,33,34,41},10));;
	}
	
	private static int search(int[] arr , int k) {
		int left = 0;
		int right = arr.length-1;
		int mid = left+(right - left)/2;
		while(right>=left){
			if(arr[mid] > k){
				right = mid - 1;
			}else if (arr[mid] < k) {
				left = mid + 1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
