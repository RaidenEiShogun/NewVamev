package com.moarti.StreamOhae;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class IntWorkerTest extends TestCase {

    @Test
    public void testSumOfPares() {
        List<Integer> numbers = Arrays.asList(2,4,6,7,14241,2,5,3,2);
        int expectedSum = 16;
        assertEquals(expectedSum, IntWorker.sumOfPares(numbers));
    }

    @Test
    public void testMultiTo2() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> expectedList = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18);
        assertEquals(expectedList, IntWorker.MultiTo2(numbers));
    }

    @Test
    public void testMaxInStream() {
        List<Integer> numbers = Arrays.asList(33423,342,424,7547,2355,23444);
        int expectedMax = 33423;
        assertEquals(expectedMax, IntWorker.maxInStream(numbers));
    }

    @Test
    public void testPrintNotPares() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        String expectedString = "1, 3, 5, 7, 9";
        assertEquals(expectedString, IntWorker.printNotPares(numbers));
    }
    @Test
    public void testAverageFinder() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        double expectedAverage = 5.0;
        assertEquals(expectedAverage, IntWorker.averageFinder(numbers));
    }
}