package Tencent.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Test2 {

    public static void main(String[] args) {
        //获得10个随机数
        List<Integer> list = new LinkedList<Integer>();
        Random ra = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(ra.nextInt(100));
        }
        System.out.print("排序前：");
        for (Integer integer : list) {
            System.out.print(integer + "\t");
        }

        Integer i = list.remove(1);
        list.add(0 , i);
        System.out.print("排序后：");
        for (Integer integer : list) {
            System.out.print(integer + "\t");
        }

    }
}
