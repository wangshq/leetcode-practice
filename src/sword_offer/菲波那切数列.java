package sword_offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
n<=39

变种：一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。

对于本题,前提只有 一次 1阶或者2阶的跳法。
a.如果两种跳法，1阶或者2阶，那么假定第一次跳的是一阶，那么剩下的是n-1个台阶，跳法是f(n-1);
b.假定第一次跳的是2阶，那么剩下的是n-2个台阶，跳法是f(n-2)
c.由a\b假设可以得出总跳法为: f(n) = f(n-1) + f(n-2) 
d.然后通过实际的情况可以得出：只有一阶的时候 f(1) = 1 ,只有两阶的时候可以有 f(2) = 2
e.可以发现最终得出的是一个斐波那契数列

 * @author wangshq
 *
 */
public class 菲波那切数列 {
    public static int Fibonacci(int n) {
    	switch (n) {
		case 0:
			return 0;
		case 1:
			return 1;
		case 2:
			return 1;
		}
    	int i1 = 1;
    	int i2 = 1;
    	int count = 3;
    	while (count++<=n) {
    		int number = i1+i2;
			i1 = i2;
			i2 = number;
		}
    	return i2;
    }

	/**
	 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个m级的台阶总共有多少种跳法。
	 * 
	 * 
	 * @param target
	 * @return
	 */
    public static int JumpFloorII(int target,int m ) {
    	if(target > m){
    		return 2*JumpFloorII(target-1, m)-JumpFloorII(target-1-m, m);
    	}
    	if (target <= 0) {
            return 1;
        } else if (target == 1) {
            return 1;
        } else {
            return 2 * JumpFloorII(target - 1,target);
        }
    }
    
	public static void main(String[] args) {
		List<Integer> hsphhList = new ArrayList<Integer>();
		hsphhList.add(1);
		hsphhList.add(3);
		hsphhList.add(12);
		hsphhList.add(4);
		hsphhList.add(34);
		hsphhList.add(354);
		hsphhList.add(332);
		hsphhList.add(-1);
		hsphhList.add(564);
		hsphhList.add(10);
		Collections.sort(hsphhList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				Integer phh1 = o1;
				Integer phh2 = o2;

				return phh1 - phh2;

			}
		});
		
		for (Iterator iterator = hsphhList.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
	}
    
    
}
