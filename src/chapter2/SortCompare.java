package chapter2;


import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;


public class SortCompare {
	public static double time(String alg, Comparable[] a) {
		Stopwatch timer = new Stopwatch();
		if (alg.equals("Insertion")) InsertionSort.sort(a);
		if (alg.equals("Selection")) SelectionSort.sort(a);
		if (alg.equals("Shell")) Shell.sort(a);
		//if (alg.equals("Merge")) Merge.sort(a);
		//if (alg.equals("Quick")) Quick.sort(a);
		//if (alg.equals("Heap")) Heap.sort(a);
		return timer.elapsedTime();
	}
	
	
	/**
	 * 将T个长度为N的数组排序
	 * @param alg 排序名称
	 * @param N 数组长度
	 * @param T 排序数组个数
	 * @return 数组排序所用的时间
	 */
	public static double timeRandomInput(String alg, int N, int T) {
		double total = 0.0;
		Double[] a = new Double[N];
		for (int t = 0; t < T; t++) {
			//进行一次测试，生成一个数组并排序
			for (int i = 0; i < N; i++) {
				a[i] = StdRandom.uniform();
			}
			total += time(alg, a);
		}
		return total;
	}
	
	public static void main(String[] args) {
		String alg1 = args[0];
		String alg2 = args[1];
		int N = Integer.parseInt(args[2]);
		int T = Integer.parseInt(args[3]);
		double t1 = timeRandomInput(alg1, N, T);
		double t2 = timeRandomInput(alg2, N, T);
		StdOut.printf("For %d random Doubles\n  %s is", N,alg1);
		StdOut.printf(" %.1f times faster than %s\n", t2/t1, alg2);
	}
}
