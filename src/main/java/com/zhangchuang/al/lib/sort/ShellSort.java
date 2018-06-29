package com.zhangchuang.al.lib.sort;

public class ShellSort 
{
    public static int[] shellSort(int[] arr)
    {
    	if (arr.length <= 1)
    	{
    		return arr;
    	}
    	
    	int gap = arr.length/2;
    	
    	for (;gap > 0; gap = gap/2)
    	{
    		for (int i = 0; i < arr.length; i++)
    		{
    			int temp = arr[i];
    			
    			int j = i - gap;
    			
    			while (j > -1 && arr[j] > temp)
    			{
    				arr[j + gap] = arr[j];
    				j = j - gap;
    			}
    			
    			arr[j + gap] = temp;
    		}
    	}
    	
    	return arr;
    }
}
