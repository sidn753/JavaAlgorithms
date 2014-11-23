package com.algorithms.sort;

/**
 * 希尔排序<br>
 * 概述：是基于插入排序的一种改进。其思想是使数组中任意间隔为h的 元素都是有序的。<br>
 * 时间复杂度：平均：O(nlog n)<br>
 * 稳定性：不稳定<br>
 * 空间复杂度：
 * 
 * @author Rocko
 * @date 2014年11月23日 下午5:57:40
 */
public class Shell extends Example {
	/**
	 * 将a[]升序排序
	 * 
	 * @param a
	 */
	public static void sort(Comparable[] a) {
		int h = 1;
		while (h < a.length / 3) {
			h = 3 * h + 1;// 1,4,13,40,121,364,1093,...
		}
		while (h >= 1) {
			// 将数组变为h有序
			for (int i = h; i < a.length; i++) {
				// 将a[i]插入到a[i-h],a[i-2*h],a[i-3*h]...之中
				for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
					exch(a, j, j - h);
				}
			}
			h = h / 3;
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
