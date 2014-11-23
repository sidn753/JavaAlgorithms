package com.algorithms.sort;


/**
 * 插入排序<br />
 * 概述：每一步都将一个待排数据按其大小插入到已经排序的数据中的适当位置，直到全部插入完毕。比较得少，换得多<br />
 * 稳定性：稳定<br />
 * 时间复杂度： 平均：O(n^2) 最差:- <br />
 * 空间复杂度：O(1) <br />
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
