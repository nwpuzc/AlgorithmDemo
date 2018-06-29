package com.zhangchuang.al.lib.sort;

public class InsertSort 
{
    public static int[] insertSort(int[] arr)
    {
    	if (arr.length <= 1)
    	{
    		return arr;
    	}
    
    	int j = 0;
    	
    	for (int i = 1; i < arr.length; i++)
    	{
    		int temp = arr[i];
    		
    		j = i - 1;
    		
    		while (j > -1 && arr[j] > temp)
    		{
    			arr[j+1] = arr[j];
    			j--;
    		}
    		
    		arr[j+1] = temp;
    	}
    	
    	return arr;
    }
}
