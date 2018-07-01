package com.zhangchuang.al.lib.search;

public class BinarySearchLoop
{
    public static boolean binarySearch(int[] arr, int tar)
    {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r)
        {
            int m = (l + r) / 2;

            if (arr[m] == tar)
            {
                return true;
            }
            else if (arr[m] > tar)
            {
                r = m - 1;
            }
            else
            {
                l = m + 1;
            }

        }

        return false;
    }
}
