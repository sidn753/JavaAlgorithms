package com.algorithms.algebra;

/**
 * 欧几里得算法 <br>
 * 计算最大公约数
 * 
 * @author Mr.Zheng
 * @date 2014年9月10日 下午5:08:55
 */
public class Euclid
{
	/**
	 * 计算两个数的最大公约数
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public static int getGCD(int m, int n)
	{
		if (m == 0 || n == 0)
			return 0;
		int r;
		while (n != 0)
		{
			r = m % n;
			m = n;
			n = r;
		}
		return m;
	}

	public static void main(String[] args)
	{
		System.out.println(getGCD(60, 24));
	}
}
