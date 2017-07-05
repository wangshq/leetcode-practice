package sword_offer;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分
 * ，并保证奇数和奇数，偶数和偶数之间的相对位置不变
 * @author wangshq
 *
 */
public class 调整数组顺序使奇数位于偶数前面 {
	//两个思路吧，第一个思路：类似冒泡算法，前偶后奇数就交换：
	
	//这种我想出一点优化的地方，就是在找到奇数的时候不要停，继续在找
	void reOrderArray1(int[] array) {
		 
        
        for (int i = 0; i < array.length;i++)
        {
            for (int j = array.length - 1; j>i;j--)
            {
                if (array[j] % 2 == 1 && array[j - 1]%2 == 0) //前偶后奇交换
                {
                    swap(array,j, j-1);
                }
            }
        }
    }
	
	private void swap(int[] array, int j, int i) {
		// TODO Auto-generated method stub
		
	}


	//第二个思路：再创建一个数组
	public void reOrderArray(int [] array) {
        if(array.length==0||array.length==1) return;
        int oddCount=0,oddBegin=0;
        int[] newArray=new int[array.length];
        for(int i=0;i<array.length;i++){
            if((array[i]&1)==1) oddCount++;
        }
        for(int i=0;i<array.length;i++){
            if((array[i]&1)==1) newArray[oddBegin++]=array[i];
            else newArray[oddCount++]=array[i];
        }
        for(int i=0;i<array.length;i++){
            array[i]=newArray[i];
        }
    }
}
