package com.zhangchuang.al.base;

public class CommonUtils
{
    public static String pringArray(int[] arr)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++)
        {
            if (i != arr.length - 1)
            {
                sb.append(arr[i]).append(", ");
            }
            else
            {
                sb.append(arr[i]);
            }
        }

        sb.append("]");

        return sb.toString();
    }
}
