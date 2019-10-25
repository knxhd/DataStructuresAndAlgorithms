package com.knxhd.sort;

/**
 * @ClassName Example
 * @description
 * @author: tianluhua
 * @date 2019/10/25 12:21
 */
public class Example {
    public static void sort(Comparable[] a) {

    }

    public static boolean less(Comparable<Object> o1, Comparable<Object> o2) {
        return o1.compareTo(o2) < 0;
    }

    public static void exch(Comparable[] o, int i, int j) {
        Comparable temp = o[i];
        o[i] = o[j];
        o[j] = temp;
    }

    public static void show(Comparable[] o) {
        for (Comparable comparable : o) {
            System.out.println(comparable + "");
        }
    }

    public static boolean isSortd(Comparable<Object>[] o) {
        for (int i = 1; i < o.length; i++) return !less(o[i], o[i - 1]);
        return true;
    }
}
