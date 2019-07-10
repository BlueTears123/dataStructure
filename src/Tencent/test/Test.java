package Tencent.test;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        ArrayList al = new ArrayList();
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            al.add(i, scan.nextInt());
        }
        Collections.sort(al, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                // 返回值为int类型，大于0表示正序，小于0表示逆序
                return o2 - o1;
            }
        });

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
