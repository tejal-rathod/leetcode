package com.leetcode.soluton.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenListList {

    public static void main(String[] args) {


        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );


        //  list.stream().forEach((k)-> k.forEach( key-> System.out.println(key)) );

/*
        List<List<Integer>>
        ↓
        Stream<List<Integer>>
        ↓ flatMap
        Stream<Integer>
        ↓
        List<Integer>*/

        List<Integer> result = list.stream().flatMap(Collection::stream).collect(Collectors.toList());

        result.stream().forEach(c -> System.out.println(c));
    }
}
