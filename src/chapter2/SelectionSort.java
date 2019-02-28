package chapter2;

/**
 * 选择排序
 * 
 * 对于随机排列的长度为N且主键不重复的数组，平均情况下插入排序需要N^2/4次比较和N^2/4次交换。
 * 最坏情况下,需要比较N^2/2次和交换N^2/2次
 * 最好情况下，需要N-1次比较和0次交换
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
				if( Example.less(a[j], a[i])) {
					min = j;
					Example.exch(a, i, min);
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
