package com.algorithms.sort;

/**
 * 排序算法类的模板
 * 
 * @author Mr.Zheng
 * @date 2014年11月10日 下午1:16:02
 */
public abstract class Example {
	/**
	 * 待排序的数组
	 */
	public static Integer[] testIntegers = { 5, 3, 1, -9, 14, 24, 31, 30, 19, 22 };

	/**
	 * 比较(v是否小于w)
	 * 
	 * @param v
	 * @param w
	 * @return
	 */
	protected static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	/**
	 * 交换数组a中的值
	 * 
	 * @param a
	 * @param i
	 * @param j
	 */
	protected static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	/**
	 * 打印数组
	 * 
	 * @param a
	 */
	protected static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	/**
	 * 检查数组是否有序(升序)
	 * 
	 * @param a
	 * @return
	 */
	protected static boolean isSorted(Comparable[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (!less(a[i], a[i + 1])) {
				return false;
			}
		}
		return true;
	}
}
