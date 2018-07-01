package com.zhangchuang.al.lib.sort;

/**
 * 选择排序
 *
 */
public class SelectionSort
{
    public static int[] slectionSort(int[] arr)
    {
        if (arr.length <= 1)
        {
            return arr;
        }

        int minIndex = 0;

        for (int i = 0; i < arr.length; i++)
        {
            minIndex = i;

            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }

            if (minIndex != i)
            {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        return arr;
    }
}
