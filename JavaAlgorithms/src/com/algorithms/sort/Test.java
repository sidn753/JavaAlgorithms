package com.algorithms.sort;

/**
 * @author Mr.Zheng
 * @date 2014年11月12日 下午3:53:10
 */
public class Test extends Example {

	public static void main(String[] args) {

		long time1 = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			Insertion.sort(testIntegers);
		}
		long time2 = System.currentTimeMillis();
		System.out.println("Insertion: " + (time2 - time1));

		for (int i = 0; i < 10000000; i++) {
			Selection.sort(testIntegers);
		}
		long time3 = System.currentTimeMillis();
		System.out.println("Selection: " + (time3 - time2));
	}
}
