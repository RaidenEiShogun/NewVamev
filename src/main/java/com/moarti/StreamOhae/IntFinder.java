package com.moarti.StreamOhae;

import java.util.*;

public class IntFinder {

    public static List<Integer> mostOftenSeenNumber(int[] numbers){

        Map<Integer,Integer> finderMap = new HashMap<>();
        for (int num:
             numbers) {
            finderMap.put(num, finderMap.getOrDefault(num,0)+1);
        }
        int maxCount = Collections.max(finderMap.values());


        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry:finderMap.entrySet()//итерируемся по ключам
             ) {
            if (entry.getValue() == maxCount){
                res.add(entry.getKey());
            }
            
        }
        return res;
    }

}
