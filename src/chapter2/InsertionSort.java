package chapter2;

/**
 * 插入排序
 * 时间复杂度o(n^2)
 * 
 * 对于部分有序的数组，该算法效率会高一些
 * @author fengxiaofan
 *
 */
public class InsertionSort {
	public static void sort(Comparable[] a) {
		int N = a.length;
		for (int i = 0; i< N; i++) {
			//将a[i]插入到a[i-1]、a[i-2]...a[0]中
			for ( int j = i; j >0 && Example.less(a[j], a[j-1]); j--) {
				Example.exch(a, j, j-1);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] a = {"S","O","R","T","E","X","A","M","P","L","E"};
		sort(a);
		Example.show(a);
	}
}
