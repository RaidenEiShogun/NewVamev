package com.moarti.StreamOhae;

import java.util.List;

public class StreamTasksMain {
    public static void main(String[] args) {
        System.out.println(IntToRoman.IntToRomanFunc(123));

        System.out.println(IntFinder.mostOftenSeenNumber(
                new int[]{1, 2, 3, 4,1,2,2,22}
        ));

        List<Integer> numbers = List.of(2,34,45325,5235,6346);

        IntWorker.averageFinder(numbers);
        IntWorker.MultiTo2(numbers);
        IntWorker.maxInStream(numbers);
        IntWorker.sumOfPares(numbers);
        IntWorker.printNotPares(numbers);
    }
}
