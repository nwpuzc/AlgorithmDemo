package com.zhangchuang.al.base;

import com.zhangchuang.al.lib.search.BinarySearchLoop;
import com.zhangchuang.al.lib.search.BinarySearchRecursion;
import com.zhangchuang.al.lib.sort.BubbleSort;
import com.zhangchuang.al.lib.sort.SelectionSort;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final int[] arr1 = new int[] {5, 3, 1, 7, 9, 2, 11, 10, 13};
	
    public static void main( String[] args )
    {
    	System.out.println("Raw array: " + CommonUtils.pringArray(arr1));
    	
    	int[] arrResBu = BubbleSort.bubbleSort(arr1);
    	
    	System.out.println("Find is 9 exist By BinarySearchRecursion: " + BinarySearchRecursion.binarySearch(arrResBu, 9, 0, arrResBu.length - 1));
        System.out.println("Find is 90 exist By BinarySearchRecursion: " + BinarySearchRecursion.binarySearch(arrResBu, 90, 0, arrResBu.length - 1));
        
        System.out.println("Find is 1 exist By BinarySearchLoop: " + BinarySearchLoop.binarySearch(arrResBu, 1));
        System.out.println("Find is 15 exist By BinarySearchLoop: " + BinarySearchLoop.binarySearch(arrResBu, 15));
    	
    	System.out.print("Sorted array By BubbleSort:");
        System.out.println(CommonUtils.pringArray(arrResBu));
        
        int[] arrResSel = SelectionSort.slectionSort(arr1);
        
        System.out.print("Sorted array By SelectionSort");
        System.out.println(CommonUtils.pringArray(arrResSel));
        
        
        
    }
}
