package com.algorithms.sort;

/**
 * 插入排序
 * 
 * @author Mr.Zheng
 * @date 2014年11月11日 下午4:55:10
 */
public class Insertion extends Example {
	/**
	 * 将a[]按升序排序
	 * 
	 * @param a
	 */
	public static void sort(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			// 将a[i]插入到a[i-1],a[i-2],a[i-3]...之中
			for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
				exch(a, j, j - 1);
			}
		}
	}

	public static void main(String[] args) {
		show(testIntegers);
		System.out.println(isSorted(testIntegers));

		sort(testIntegers);

		show(testIntegers);
		System.out.println(isSorted(testIntegers));
	}
}
