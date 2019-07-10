package fanyongquan.Sort.BubbleSort;

import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        int[] list = new int[10];
        Random ra = new Random();
        for (int i = 0; i < 10; i++) {
            list[i] = ra.nextInt(50);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(list[i] + "\t");
        }

        System.out.println();

        bubbleSort3(list);

        for (int i = 0; i < 10; i++) {
            System.out.print(list[i] + "\t");
        }

    }

    public static int[] bubbleSort(int[] list) {
        int lo = 0;
        int hi = list.length;
        int count = 0;
        while (lo < hi) {
            bubble(list , lo , hi);
            hi--;
            lo = 0;
        }
        System.out.println(count);
        return list;
    }

    public static int[] bubbleSort2(int[] list) {
        int lo = 0;
        int hi = list.length;
        while (!bubble2(list , lo , hi--));
        return list;
    }

    public static int[] bubbleSort3(int[] list) {
        int lo = 0;
        int hi = list.length;
        while (lo < bubble3(list , lo , hi--));
        return list;
    }

    public static void bubble(int[] list, int lo, int hi) {
        while (++lo < hi) {
            if (list[lo] < list[lo - 1]) {
                swap(list, lo, lo - 1);
            }
        }
    }

    public static boolean bubble2(int[] list, int lo, int hi) {
        boolean sorted = true;
        while (++lo < hi) {
            if (list[lo] < list[lo - 1]) {
                sorted = false;
                swap(list, lo, lo - 1);
            }
        }
        return sorted;
    }

    public static int bubble3(int[] list, int lo, int hi) {
        int last = lo;
        while (++lo < hi) {
            if (list[lo] < list[lo - 1]) {
                last = lo;
                swap(list, lo, lo - 1);
            }
        }
        return last;
    }

    public static void swap(int[] list, int a, int b) {
        int c = list[a];
        list[a] = list[b];
        list[b] = c;
    }


}
