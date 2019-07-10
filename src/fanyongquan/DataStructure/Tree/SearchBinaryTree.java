package fanyongquan.DataStructure.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SearchBinaryTree {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        Random ra = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(ra.nextInt(100));
        }
        System.out.print("随机数列：");
        for (Integer i : list) {
            System.out.print(i + "\t");
        }



    }
}
