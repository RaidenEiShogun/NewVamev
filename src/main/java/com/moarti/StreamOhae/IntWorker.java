package com.moarti.StreamOhae;

import java.util.List;
import java.util.stream.Collectors;

public class IntWorker {


    public static int sumOfPares(List<Integer> numbers){
        return numbers.stream()
                .filter(x->x%2==0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static List<Integer> MultiTo2(List<Integer> numbers){
        return numbers.stream()
                .map(x->x*2)
                .toList();
    }

    public static int maxInStream(List<Integer> numbers){
        return numbers.stream()
                .max(Integer::compareTo)
                .orElse(0);
    }

    public static String printNotPares(List<Integer> numbers){
        return numbers.stream()
                .filter(x -> x % 2!= 0)
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    public static double averageFinder(List<Integer> numbers){
        return numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average().orElse(0);
    }

}
