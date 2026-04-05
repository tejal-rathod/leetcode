package com.leetcode.soluton.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestString {

    public static void main(String[] args) {

        /*
        🔹 1. list.stream()

        👉 Converts list → stream of strings

        🔹 2. .max(Comparator.comparingInt(String::length))
            .max(Comparator.comparingInt(String::length))

        👉 Finds element with maximum length

            Breakdown:
            String::length → gives length of each string
            comparingInt → compares based on length
         */

        List<String> list = Arrays.asList("java", "spring", "microservices", "api");

       String longest= list.stream().max(Comparator.comparing(String::length)).orElse(null);
       System.out.println(longest);
    }
}
