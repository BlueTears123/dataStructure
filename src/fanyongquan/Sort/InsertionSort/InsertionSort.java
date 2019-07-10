package fanyongquan.Sort.InsertionSort;

import java.util.*;

public class InsertionSort {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        Random ra = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(ra.nextInt(50));
        }
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
        System.out.print("排序前：");
        for (Integer i : list) {
            System.out.print(i + "\t");
        }
        System.out.println();
        int sorted = 1;
        while (sorted < list.size()) {
            Integer cur = list.get(sorted);
            //如果目前需要排序的那一个比他前一个数要小
            if (cur < list.get(sorted - 1)) {
//                System.out.println(cur);
                //如果第二个比第一个大
                int i = sorted - 2;
                if (i < 0) {
                    list.remove(sorted);
                    list.add(0, cur);
                } else {
                    do {
                        if (i == -1 || cur > list.get(i)) {
                            list.remove(sorted);
                            list.add(i + 1, cur);
                            break;
                        }
                    } while (i-- >= 0);
                }
            }
            sorted++;
        }
        System.out.println();
        System.out.print("排序后：");
        for (Integer i : list
        ) {
            System.out.print(i + "\t");
        }


    }

    public Collections sort() {
        return null;
    }


}
