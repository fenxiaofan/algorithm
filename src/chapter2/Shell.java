package chapter2;

import static chapter2.Example.less;
import static chapter2.Example.exch;

/**
 * 希尔排序
 * @author fengxiaofan
 * 
 *
 */
public class Shell {
	
	public static void sort(Comparable[] a) {
		int N = a.length;
		int h = 1;
		//找到最大的h值
		while (h < N/3) {
			h = 3*h + 1;
		}
		//循环排序，直至h=1
		while (h >=1) {
			//循环排序使数组为h有序
			for (int i = h; i < N; i++) {
				for (int j = i; j >=h && less(a[j], a[j-h]); j -=h) {
					exch(a, j, j-h);
				}
			}
			h = h / 3;
		}
	}
	
	public static void main(String[] args) {
		String[] a = {"S","O","R","T","E","X","A","M","P","L","E"};
		sort(a);
		Example.show(a);
	}
}
