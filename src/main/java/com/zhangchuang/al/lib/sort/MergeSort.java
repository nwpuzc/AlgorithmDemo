package com.zhangchuang.al.lib.sort;

public class MergeSort
{
    private static int[] merge(int[] nums, int left, int mid, int right)
    {
        int[] temp = new int[right - left + 1];
        
        int i = left;
        int j = mid + 1;
        int k = 0;
        
        while (i <= mid && j <= right)
        {
            if (nums[i] < nums[j])
            {
                temp[k++] = nums[i++];
            }
            else
            {
                temp[k++] = nums[j++];
            }
        }
        
        while (i <= mid)
        {
            temp[k++] = nums[i++];
        }
        
        while (j <= right)
        {
            temp[k++] = nums[j++];
        }
        
        for (int p = 0; p < temp.length; p++)
        {
            nums[left + p] = temp[p];
        }
        
        return nums;
    }
    
    private static int[] sort(int[] nums, int left, int right)
    {
        int mid = (left + right) / 2;
     
        if (left < right)
        {
            sort(nums, left, mid);
            sort(nums, mid + 1, right);
            merge(nums, left, mid, right);
        }
        
        return nums;
    }
    
    public static int[] mergeSort(int[] nums)
    {
        return sort(nums, 0, nums.length - 1);
    }
}
