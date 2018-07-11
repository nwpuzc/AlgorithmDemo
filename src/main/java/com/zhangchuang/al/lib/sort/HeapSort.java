package com.zhangchuang.al.lib.sort;

public class HeapSort
{
    private static void heapify(int[] arrays, int currentRootNode, int size)
    {
        if (currentRootNode < size)
        {
            int left = 2 * currentRootNode + 1;
            int right = 2 * currentRootNode + 2;
            
            int max = currentRootNode;
            
            if (left < size)
            {
                if (arrays[max] < arrays[left])
                {
                    max = left;
                }
            }
            
            if (right < size)
            {
                if (arrays[max] < arrays[right])
                {
                    max = right;
                }
            }
            
            if (max != currentRootNode)
            {
                int temp = arrays[max];
                arrays[max] = arrays[currentRootNode];
                arrays[currentRootNode] = temp;
                
                heapify(arrays, max, size);
            }
        }
    }
    
    private static void maxHeapify(int[] arrays, int size)
    {
        for (int i = size - 1; i >= 0; i--)
        {
            heapify(arrays, i, size);
        }
    }
    
    public static int[] heapSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            maxHeapify(arr, arr.length - i);
            
            int temp = arr[0];
            arr[0] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        
        return arr;
    }
}
