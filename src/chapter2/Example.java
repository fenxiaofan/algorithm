package chapter2;
/*
 * 排序算法模板
 */
public class Example {
	public static void sort(Comparable[] a) {
		/*
		 * 具体排序算法
		 */
	}
	
	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	public static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static void show(Comparable[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static boolean isSorted(Comparable[] a) {
		for(int i = 1; i < a.length; i++) {
			if(less(a[i],a[i-1])) return false;			
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] a = {"a","c","l","s","f"};
		sort(a);
		assert isSorted(a);
		show(a);
	}
	
}