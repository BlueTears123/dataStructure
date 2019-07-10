package test;

import sun.awt.SunHints;

import java.util.*;

public class 找最多次数数字 {

    public static int findX(int [] array){
        Map<Integer , Integer> times = new HashMap<Integer, Integer>();

        for (int i = 0 ; i < array.length ; i++){
            if(times.containsKey(array[i])) {
                int value = times.remove(array[i]);
                times.put(array[i] , value+1);
            } else {
                times.put(array[i] , 1);
            }
            
        }
        // 获取map中value最大的key
        Iterator kyes = times.keySet().iterator();
        Object maxkey = kyes.next();
        int value = times.get(maxkey);
        while (kyes.hasNext()){
            Object key = kyes.next();
            if(value < times.get(key)){
                value = times.get(key);
                maxkey = key;
            }
        }
        return(Integer) maxkey;
    }


    public static void main(String[] args) {
        int[] array  = new int[] {1,1,1,2,2,3};

        System.out.println(findX(array));


    }


}
