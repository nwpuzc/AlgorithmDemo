package com.zhangchuang.al.lib.search;

public class BinarySearchRecursion 
{
	public static boolean binarySearch(int[] arr, int tar, int l, int r) 
	{
		if (l > r)
		{
			return false;
		}

		int m = (l + r) / 2;

		if (arr[m] > tar) 
		{
			r = m - 1;

			return binarySearch(arr, tar, l, r);
		} 
		else if (arr[m] < tar)
		{
			l = m + 1;

			return binarySearch(arr, tar, l, r);
		} 
		else 
		{
			return true;
		}
	}
}
