package com.zhangchuang.al.lib.sort;

public class QuickSort
{
    public static int[] quickSort(int[] arr)
    {
        if (arr.length <= 1)
        {
            return arr;
        }
        
        quickSort(arr, 0, arr.length - 1);
        
        return arr;
    }

    private static void quickSort(int[] arr, int left, int right)
    {
        if (right >= 1 && left < right)
        {           
            int i = left;
            int j = right;
            int temp = arr[left];
            
            while (i < j)
            {
                while (i < j && arr[j] >= temp)
                {
                    j--;
                }
                
                if (i < j)
                {
                    arr[i++] = arr[j];
                }
                
                while (i < j && arr[i] <= temp)
                {
                    i++;
                }
                
                if (i < j)
                {
                    arr[j--] = arr[i];
                }
            }
            
            arr[i] = temp;
            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
    }
}
