package com.leetcode.soluton.stream;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateElements {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 7, 6, 6, 7);
        System.out.println(Collections.frequency(list,1)>1);
       /*Collections.frequency(list, n)
         Counts how many times n appears in the list*/

        Set<Integer> duplicate = list.stream().filter(n -> Collections.frequency(list, n) > 1).collect(Collectors.toSet());

        duplicate.stream().forEach(n -> System.out.println(n));
    }
}
