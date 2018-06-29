package com.zhangchuang.al.lib.sort;

/**
 * 冒泡排序
 *
 */
public class BubbleSort
{
    public static int[] bubbleSort(int[] arr)
    {
        if (arr.length <= 1)
        {
            return arr;
        }

        boolean flag = true;

        for (int i = 0; i < arr.length && flag; i++)
        {
            /**
             * If there is no exchange occured in traversal beforem, no need to traverse
             * again the list is in order.
             */
            flag = false;

            for (int j = 0; j < arr.length - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
        }

        return arr;
    }
}
