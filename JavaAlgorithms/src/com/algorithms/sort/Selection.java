package com.algorithms.sort;

/**
 * 选择排序<br />
 * 概述：在无序区里找一个最小的元素跟在有序区的后面。比较得多，换得少。<br />
 * 稳定性：稳定<br />
 * 时间复杂度： 平均：O(n^2) 最差:- <br />
 * 空间复杂度：O(1) <br />
 * 
 * @author Mr.Zheng
 * @date 2014年11月10日 下午1:12:51
 */
public class Selection extends Example {

	public static void main(String[] args) {
		show(testIntegers);
		System.out.println(isSorted(testIntegers));

		sort(testIntegers);

		show(testIntegers);
		System.out.println(isSorted(testIntegers));
	}

	public static void sort(Comparable[] a) {
		// 将a[]按升序排列
		for (int i = 0; i < a.length; i++) {
			// 将a[i]和a[i+1..N]中最小的元素交换
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (less(a[j], a[min])) {
					min = j;
				}
			}
			exch(a, i, min);
		}
	}

}
