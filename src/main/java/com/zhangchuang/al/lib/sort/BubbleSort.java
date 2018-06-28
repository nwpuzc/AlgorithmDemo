package com.zhangchuang.al.lib.sort;

public class BubbleSort
{
    public static int[] bubbleSort(int[] arr)
    {
    	if (arr.length <= 1)
    	{
    		return arr;
    	}
    	
    	for (int i = 0; i < arr.length; i++)
    	{
    		for (int j = 1; j < arr.length - i; j++)
    		{
    			if (arr[j - 1] > arr[j])
    			{
    				int temp = arr[j];
    				arr[j] = arr[j - 1];
    				arr[j - 1] = temp;
    			}
    		}
    	}
    	
    	return arr;
    }
}
