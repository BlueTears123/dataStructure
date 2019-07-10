package Tencent.pork;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        ArrayList<Integer> al = new ArrayList<Integer>();
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
        int niuniu = 0;
        int yangyang = 0;
        boolean niuNiuTurn = true;
        for (int i = 0; i < al.size(); i++) {
            if (niuNiuTurn) {
                niuniu += al.get(i);
            } else {
                yangyang += al.get(i);
            }
            niuNiuTurn = niuNiuTurn ? false : true;
        }
        System.out.println(niuniu - yangyang);
    }
}
