package com.algorithms.search;


/**
 * 折半(二分查找)
 * 
 * @author Mr.Zheng
 * @date 2014年11月2日 下午10:31:39
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] list = { 2, 4, 8, 11, 17, 34, 45, 66, 89, 134 };
		System.out.println(rank(8, list));
	}

	/**
	 * 
	 * @param key
	 * @param a
	 * @return key值对应的数组所在下标，不存在则返回-1
	 */
	public static int rank(int key, int[] a) {
		// 数组必须是有序的
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			// 被查找的键要么不存在，要么必然存在于a[lo...hi]之中
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) {
				hi = mid - 1;
			} else if (key > a[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
