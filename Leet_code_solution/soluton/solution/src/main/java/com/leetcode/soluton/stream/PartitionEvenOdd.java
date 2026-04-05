package com.leetcode.soluton.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*

 */
public class PartitionEvenOdd {

    public static void main(String[] args) {

        /*
        🔹 1. list.stream()

        👉  Convert list → stream

        🔹 2. Collectors.partitioningBy(...)
          Collectors.partitioningBy(n -> n % 2 == 0)
        👉Splits elements into 2 groups based on condition

        🔹 Condition
            n -> n % 2 == 0

        👉 If condition is:
            true → Even
            false → Odd
         */
        List<Integer> list= Arrays.asList(1,4,6,3,7,8,9,10);

      Map<Boolean,List<Integer>> result= list.stream().collect(Collectors.partitioningBy(n->n%2==0));

        System.out.println("Even: " + result.get(true));
        System.out.println("Odd: " + result.get(false));
    }
}
