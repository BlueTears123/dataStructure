package fanyongquan.Sort.QuickSort;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        /*
         * 遍历一次数组，把最大的和最后一个交换
         * */
        List<Integer> list = new LinkedList<Integer>();
        Random ra = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(ra.nextInt(100));
        }
        System.out.print("排序前：");
        for (Integer i : list) {
            System.out.print(i + "\t");
        }
        System.out.println();

        int sort = 0;
        while (sort < list.size()) {
            //假设第0个是最大的
            int max = 0;
            for (int i = 1; i < list.size() - sort; i++) {
                if (list.get(max) < list.get(i)) {
                    //获得最大的那个的下标
                    max = i;
                }
            }
            Integer value = ((LinkedList<Integer>) list).remove(max);
            list.add(list.size() - sort, value);
            sort++;
        }

        System.out.print("排序后：");
        for (Integer i : list
        ) {
            System.out.print(i + "\t");
        }


    }
}
