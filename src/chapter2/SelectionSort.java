package chapter2;


import static chapter2.Example.less;
import static chapter2.Example.exch;
/**
 * 选择排序
 * 
 * 时间复杂度o(n^2)
 * @author fengxiaofan
 *
 */
public class SelectionSort {
	public static void sort(Comparable[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i+1; j < N; j++) {
				//比较i和j的大小，取最小值为min
				if( less(a[j], a[i])) {
					min = j;
					exch(a, i, min);
				}			
			}
		}
	}
	
	public static void main(String[] args) {
		String[] a = {"S","O","R","T","E","X","A","M","P","L","E"};
		sort(a);
		Example.show(a);
	}
}
