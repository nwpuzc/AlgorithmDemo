package com.zhangchuang.al.base;

import com.zhangchuang.al.lib.search.BinarySearchLoop;
import com.zhangchuang.al.lib.search.BinarySearchRecursion;
import com.zhangchuang.al.lib.sort.BubbleSort;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final int[] arr1 = new int[] {5, 3, 1, 7, 9, 2, 11, 10, 13};
	
    public static void main( String[] args )
    {
    	int[] arrRes = BubbleSort.bubbleSort(arr1);
    	
    	System.out.println("Sorted array:");
        System.out.println(CommonUtils.pringArray(arrRes));
        
        System.out.println("Find is 9 exist By BinarySearchRecursion: " + BinarySearchRecursion.binarySearch(arrRes, 9, 0, arrRes.length - 1));
        System.out.println("Find is 90 exist By BinarySearchRecursion: " + BinarySearchRecursion.binarySearch(arrRes, 90, 0, arrRes.length - 1));
        
        System.out.println("Find is 1 exist By BinarySearchLoop: " + BinarySearchLoop.binarySearch(arrRes, 1));
        System.out.println("Find is 15 exist By BinarySearchLoop: " + BinarySearchLoop.binarySearch(arrRes, 15));
    }
}
