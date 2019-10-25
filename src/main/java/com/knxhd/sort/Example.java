package com.knxhd.sort;

/**
 * @ClassName Example
 * @description
 * @author: tianluhua
 * @date 2019/10/25 12:21
 */
public class Example {


    public static void sort(Comparable[] a) {
        System.out.println("排序一下");
    }

    public static boolean less(Comparable<Object> o1, Comparable<Object> o2) {
        System.out.println("比较两个值的大小");
        return o1.compareTo(o2) < 0;
    }

    public static void exch(Comparable[] o, int i, int j) {
        System.out.println("交换两个值");
        Comparable temp = o[i];
        o[i] = o[j];
        o[j] = temp;
    }

    public static void show(Comparable[] o) {
        System.out.println("ceshiyixia");
        System.out.println("测试一下啊");
        System.out.println("展示排序后的数据");
        for (Comparable comparable : o) {
            System.out.println(comparable + "");
        }
    }

    public static boolean isSortd(Comparable<Object>[] o) {
        System.out.println("判断是否是有顺序的");
        for (int i = 1; i < o.length; i++) return !less(o[i], o[i - 1]);
        return true;
    }
}
