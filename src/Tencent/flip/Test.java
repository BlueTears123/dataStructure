package Tencent.flip;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        way(n, m);
    }

    public static void way(int n, int m) {
        int time = 0;
        boolean flip = false;
        Long amount = 0l;
        for (int i = 1; i <= n; i++, time++) {
            if (time == m) {
                time = 0;
                flip = flip ? false : true;
            }
            if (flip) {
                amount += i;
            } else {
                amount -= i;
            }
        }
        System.out.println(amount);
    }

    public static void way2(int n, int m) {

    }
}
