package com.knxhd.sort;

/**
 * @ClassName SelectSort
 * @description 选择排序
 * 原理：首先遍历一遍找到最小的值，放到第一位，然后从第二个遍历一遍，找到最小值，放到第二位，以此类推
 * 比较的次数为 N-1 +N-2 +....+1=N(N-1)/2，也就是可以得到N^2次
 * @author: tianluhua
 * @date 2019/10/25 12:39
 */
public class SelectSort {

    public static Object[] selectSort(Object[] o) {
        int k=0;
        Object min=0;
        for (int i = k; i < o.length; i++) {
            min=o[i];
            k++;
        }
        return o;
    }

    public static void main(String[] args) {

    }

}
